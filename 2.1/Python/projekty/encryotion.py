text_to_encrypt = (
    "Once upon a midnight dreary, while I pondered, weak and weary,"
    "Over many a quaint and curious volume of forgotten lore, While I nodded, nearly napping, "
    "suddenly there came a tapping, as of some one gently rapping, rapping at my chamber door. "
    "'This some visiter,' I muttered, 'tapping at my chamber door Only this, and nothing more."
)
lzw_d = {}

for i in range(0, 256):
    lzw_d[chr(i)] = i

k = len(lzw_d)

w = ""

outputlistin = []

for c in text_to_encrypt:
    wc = w + c
    if wc in lzw_d:
        w = wc
    else:
        outputlistin.append(lzw_d[w])
        lzw_d[wc] = k
        k += 1
        w = c

if len(w) > 0:
    outputlistin.append(lzw_d[w])

print(outputlistin)

print((len(outputlistin) / len(text_to_encrypt)))


### decompress
znaky = {}
for i in range(0, 256):
    znaky[i] = chr(i)

input = outputlistin

k = len(znaky)

w = znaky[input[0]]

output = []

output.append(w)

for code in input:
    if code in input[1:]:
        if code in znaky:
            entry = znaky[code]
        else:
            entry = w + w[0]

        output.append(entry)
        znaky[k] = w + entry[0]
        k += 1
        w = entry

output_string = "".join(output)

print(output_string)
assert output_string == text_to_encrypt, "Decompression failed to match original text!"
print("✓ Decompression successful - matches original text!")
