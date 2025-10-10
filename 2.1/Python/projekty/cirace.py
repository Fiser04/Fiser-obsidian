number = 32123


def ciferace(number):
    if number <= 9:
        return number
    soucet = sum([int(n) for n in str(number)])
    if soucet > 9:
        return ciferace(soucet)
    else:
        return soucet


print(ciferace(number))
