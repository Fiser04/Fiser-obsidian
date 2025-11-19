def funkce(*x, y=[6, 8, 9, 7, 8, 3, 12, 9]):
    return [i - j if i > j else j - i for i, j in zip(x, y)]


print(funkce(1, 5, 8, 9, 6, 12, 7, 5))

x = ["jes", "ne", "ano", "bum"]
b = [(i, j) for i, j in enumerate(x, start=5)]
print(b[3])
print(type(b))
print(type(b[3]))
