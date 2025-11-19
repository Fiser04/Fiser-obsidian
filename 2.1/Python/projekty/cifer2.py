from random import randbytes, randint
from traceback import print_tb

cislo = randint(10**24, 10**25)
print(cislo)


def ciferace(cislo):
    cisloString = str(cislo)
    delka = len(cisloString)
    celkem = 0
    for i in range(0, delka):
        celkem = celkem + int(cisloString[i])
    if celkem > 9:
        return ciferace(celkem)
    else:
        return celkem


print(ciferace(cislo))
