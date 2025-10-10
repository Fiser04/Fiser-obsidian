import string

my_heslo = "yozxp hgzoorlm"
alphabet_lower = list(string.ascii_lowercase)
print(alphabet_lower)
konec = ""
listCisleold = []
listCisle = []
for znak in my_heslo:
    for z in alphabet_lower:
        if znak == z:
            listCisleold.append(ord(znak) - 98)
print(listCisleold)
for cislice in listCisleold:
    listCisle.append(24 - cislice)
print(listCisle)
for cislo in listCisle:
    konec += alphabet_lower[cislo]
print(my_heslo)
print(konec)
