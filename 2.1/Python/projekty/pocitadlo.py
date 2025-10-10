x = "Incidentally, the second number shown is 2 217 —the size of Python’s integers is limited only by machine memory, not by a fixed number of bytes. Strings can be delimited by double or single quotes, as long as the same kind are used at both ends, and since Python uses Unicode, strings are not limited to ASCII characters, as the penultimate string shows. An empty string is simply one with nothing between the delimiters. Python uses square brackets ( [] ) to access an item from a sequence such as a string. "

slova = x.split(" ")
konec = []
znak = "i"
for slovo in slova:
    if slovo.startswith(znak):
        print(slovo)

