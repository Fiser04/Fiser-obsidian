en_text = "FCAFLC ORA LWJC WV MLIUU RAEUCU URAELX VAZ ZRPAO UZAVCU. CVMLWUR FPAJCPN."


def decrypt(mujtext):
    abeceda = list("abcdefghijklmnopqrstuvwxyz")
    mujtextMale = mujtext.lower()
    mujvysledek = ""
    cislo = -1
    for i in range(0, len(mujtextMale)):
        for j in range(0, len(abeceda)):
            if mujtextMale[i] not in abeceda:
                cislo = -100
            elif mujtextMale[i] == abeceda[j]:
                cislo = j
        if cislo != -100:
            cislo = 21 * (cislo - 8) % 26
            mujvysledek = mujvysledek + abeceda[cislo]
        else:
            mujvysledek += mujtextMale[i]
        cislo = -1
    return mujvysledek


print(decrypt(en_text))
