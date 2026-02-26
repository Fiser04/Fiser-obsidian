import fitz  # PyMuPDF
import nltk
import json
import re

# Ensure the tokenizer resources are ready
nltk.download("punkt")
nltk.download("punkt_tab")


def pdf_to_sentences(file_path, start_page, end_page):
    full_text = ""

    try:
        doc = fitz.open(file_path)

        for page_num in range(start_page - 1, end_page):
            page = doc.load_page(page_num)
            text = page.get_text("text")

            lines = text.split("\n")
            cleaned_lines = []

            for line in lines:
                clean_line = line.strip()

                # 1. Skip page numbers and empty lines
                if not clean_line or clean_line.isdigit():
                    continue

                # 2. Filter out the word "CHAPTER" (case insensitive)
                # This removes "CHAPTER 1", "Chapter One", or just "CHAPTER"
                clean_line = re.sub(
                    r"\bCHAPTER\s*\d*\b", "", clean_line, flags=re.IGNORECASE
                ).strip()

                if clean_line:
                    cleaned_lines.append(clean_line)

            # Join lines with a space so words aren't glued together
            page_content = " ".join(cleaned_lines)
            full_text += page_content + " "

        # --- THE "..." FIX ---
        # This regex looks for dots separated by spaces (e.g., ". . .")
        # and removes the spaces so it becomes "..."
        # It handles 2, 3, or more dots in a row.
        full_text = re.sub(
            r"\.\s*(?:\.\s*)+", lambda m: m.group(0).replace(" ", ""), full_text
        )

        # 3. Fix hyphenated words at line breaks (e.g., "dark- ness" -> "darkness")
        full_text = re.sub(r"(\w+)-\s+(\w+)", r"\1\2", full_text)

        # 4. Clean up any weird double spaces created during processing
        full_text = re.sub(r"\s+", " ", full_text).strip()

        # 5. Tokenize into sentences (keeps !, ?, and ... at the end)
        sentences = nltk.sent_tokenize(full_text)

        return sentences

    except Exception as e:
        print(f"Error occurred: {e}")
        return []


def save_human_readable(data, base_name):
    # Save as JSON (exactly like your list format)
    with open(f"{base_name}.json", "w", encoding="utf-8") as f:
        json.dump(data, f, ensure_ascii=False, indent=4)

    # Save as TXT (One sentence per line)
    with open(f"{base_name}.txt", "w", encoding="utf-8") as f:
        for s in data:
            f.write(s + "\n")

    print(f"Done! Exported {len(data)} sentences.")


# --- EXECUTION ---
# Adjust these for your specific book
FILE = "book.pdf"
START_PG = 7
END_PG = 458

results = pdf_to_sentences(FILE, START_PG, END_PG)

if results:
    # Print a preview to check the "..." fix
    print("\nPreview of extracted sentences:")
    for s in results[:8]:
        print(f"-> {s}")

    save_human_readable(results, "final_training_data")
