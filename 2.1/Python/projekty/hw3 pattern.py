def porovnavac(pattern, command):
    patternBinar = bin(pattern)  # prehodim to do binarky
    patternBinar = patternBinar[2:]  # odstranim predpis 0b

    if len(patternBinar) > len(
        command
    ):  # pokud je muj command moc kratkej tak se na to rovnou vykaslu
        return False

    patternBinar = doplnovac(patternBinar, len(command))  # doplnim chybici nuly zleva

    for i in range(
        0, len(command)
    ):  # kontrola jestli nahodou 1 neni cislo a 0 pismeno na pozici i
        if patternBinar[i] == "1":
            if not command[
                i
            ].isalpha():  # https://www.w3schools.com/python/ref_string_isalpha.asp
                return False
        else:
            if not command[
                i
            ].isdigit():  # https://www.w3schools.com/python/ref_string_isdigit.asp
                return False
    # a ano, ty if not vypadaj divne, je 23:43, jsem rad ze to funguje
    return True  # pokud jsem nic nenasel tak je to v pohode


def doplnovac(pattern, delkaCommand):
    vraci = pattern
    while (
        len(vraci) < delkaCommand
    ):  # proste do ty doby co to neni stejne dlouhy tak davam pred to 0
        vraci = "0" + vraci
    return vraci


print(porovnavac(42, "12a0b3e4"))
print(porovnavac(101, "ab23b4zz"))
