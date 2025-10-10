from num2words import num2words

listlist = []
cisloDoslova = ""
cislo = 687
cislohledane = num2words(cislo).replace(" and ", "").replace(" ", "").replace("-", "")
print(cislohledane)
cisloDoslova = num2words(cislo)
cisloDoslova = cisloDoslova.replace(" and ", "")
cisloDoslova = cisloDoslova.replace(" ", "")
for i in range(1, cislo + 1):
    listlist.append(
        (((num2words(i)).replace(" and ", "")).replace(" ", "")).replace("-", "")
    )
listlist.sort()
counter = 1
for chuj in listlist:
    if chuj == cislohledane:
        print(counter)
    else:
        counter += 1
