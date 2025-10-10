file1 = open(
    "/Users/fiser/PythonBlyaaa/HW02_cypher.txt"
).readlines()  # nahrani prvniho souboru
file2 = open(
    "/Users/fiser/PythonBlyaaa/HW02_shifts.txt"
).readlines()  # nahrani druhyho souboru
rows = []
numbers = []
for f in file1:
    f = f.replace("\n", "")  # odstraneni entru na konci kazdeho prvku listu
    rows.append(f)
for f in file2:
    f = f.replace("\n", "")  # odstraneni entru na konci kazdeho prvku listu
    numbers.append(f)
print(rows)

for i in range(len(rows)):  # pro kazdy prvek listu
    for char in rows[i]:  # pro kazdy znak prvku z listu
        print(
            chr(ord(char) - int(numbers[i])), end=""
        )  # vytiskni textovou verzy znaku ktery je vysledkem odecteni ciselne verze znaku s urcitou radkou z druheho souboru (vytvari klic) a na konec nedavej \n
    print()
