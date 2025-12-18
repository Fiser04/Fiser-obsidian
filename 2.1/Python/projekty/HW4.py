import string

#Import souboru
file = open("raven.txt", "r")
fileList = file.readlines()
file.close()

fileString = ""

#Cteni vnitrku souboru
for line in fileList:
    fileString += line

#Na maly pismena
fileString = fileString.lower()

#Pryc s ,. a dalsimi znaky
for char in string.punctuation:
    fileString = fileString.replace(char, "")

#Pryc s mezerami, entrama atd
for space in string.whitespace:
    fileString = fileString.replace(space, "")

#pouzil jsem string takto, protoze je to string charakteru ktere chci smazat

#pryc s specialnim znakem
fileString = fileString.replace("—", "")

maxDelka = 0
vysledek = []
    
for i in range(len(fileString)):
    nalezeno = set()
    for j in range(i, len(fileString)):
        if fileString[j] in nalezeno:
            break
        nalezeno.add(fileString[j])
        delka = j-i+1

        if(delka > maxDelka):
            maxDelka = delka
            vysledek = [fileString[i:j+1]]
        elif(delka == maxDelka):
            vysledek.append(fileString[i:j+1])

#Vysvetleni:
#Beru postupne kazdy znak jako pocatecni, pak z toho pocatecniho jdu na konec a postupne pridavam pismena do setu, jakmile narazim na stejny pismeno tak to zahazuju, ale kdyz to neni stejne pismeno tak si spocitam novou delku (pozice kde jsem - pozice od kud jsem zacal + 1)a pokud je to nejak vyznamna delka tak se rozhoduji, kdyz to je zatim nejdelsi co jsem nasel, tak vse minule zahazuju, kdyz to ale je stejne dlouhe tak to pridam mezi stejne dlouhe, takhle to udelam pro kazdy string zacinajici pozici i

#Odstranim duplicity ktere by mohli ve vysledku nastat
vysledek = set(vysledek)
for vysled in vysledek:
    print(vysled)
