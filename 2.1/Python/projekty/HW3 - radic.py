listCisel = [5, 7, 10, 4, 2, 7, 8, 1, 3]  # input pole


def serad(listOrigo):
    listPrac = []  # ukladam si posloupnost
    listListuFinal = []  # 2d pole posloupnosti
    startPozice = 0  # start
    finalniList = []  # finalni list

    while startPozice < len(listOrigo):
        posloupnost = 1
        for i in range(
            startPozice, len(listOrigo) - 1
        ):  # nejdrive si sectu delku posloupnosti
            if listOrigo[i] < listOrigo[i + 1]:
                posloupnost += 1
            else:
                break

        for i in range(
            startPozice, startPozice + posloupnost
        ):  # cleny ktere jdou za sebou postupne pridam do listPrac
            listPrac.append(listOrigo[i])

        startPozice = startPozice + posloupnost

        listListuFinal.append(
            listPrac[::-1]
        )  # zapisu otoceny list do listu listu (2d pole jakoby)

        listPrac = []  # vycistim svuj list pro posloupnosti

    for i in range(
        0, len(listListuFinal)
    ):  # chovam se k tomu jako k 2d poli a snazim se z toho udelat klasicke pole
        for j in range(0, len(listListuFinal[i])):
            finalniList.append(listListuFinal[i][j])

    return finalniList


print(serad(listCisel))
