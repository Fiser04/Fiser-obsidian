import gensim
from gensim.models import Word2Vec
from gensim.utils import simple_preprocess


# Malý trénovací dataset
def loadFromJson(nameOfFile):
    with open(nameOfFile, "r", encoding="utf-8") as sentenceInput:
        sentences = json.load(sentenceInput)
    return sentences


sentences = loadFromJson("final_training_data.json")

# Tokenizace vět (převedeme text na seznam slov)
tokenized_sentences = [simple_preprocess(sentence) for sentence in sentences]

# Výpis tokenizovaných vět
print(tokenized_sentences)

# Trénování Word2Vec modelu
w2v_model = Word2Vec(
    sentences=tokenized_sentences,  # Tokenizované věty
    vector_size=10,  # Počet dimenzí vektoru
    window=3,  # Kontextové okno
    min_count=1,  # Minimální počet výskytů slova
    workers=4,  # Počet CPU vláken
)

# Uložení modelu pro budoucí použití
w2v_model.save("word2vec.model")
print("Model byl úspěšně natrénován!")


# Najdi nejbližší slova ke slovu "king"
print("\nMost similar words to 'Librarian':")
print(w2v_model.wv.most_similar("librarian"))

# Výpočet podobnosti mezi dvěma slovy
similarity = w2v_model.wv.similarity("darkness", "tunnel")
print(f"\nSimilarity between 'darkness' and 'tunnel': {similarity:.4f}")


# Analogie (king - man + woman = ?)
print("\nWord analogy (darkness - death + life):")
print(
    w2v_model.wv.most_similar(positive=["darkness", "life"], negative=["death"], topn=5)
)
