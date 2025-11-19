from random import randint


def prvocisla():
    nalezenaCisla = []
    while len(nalezenaCisla) < 20:
        cislo = randint(1000, 9999)
        if isPrvocislo(cislo):
            if cislo not in nalezenaCisla:
                nalezenaCisla.append(cislo)
    return nalezenaCisla


def isPrvocislo(cislo):
    je = all(cislo % i for i in range(2, cislo))
    return je


print(prvocisla())
