from PIL import Image
im = Image.open("image.png")
width, height = im.size
colortuples = im.getcolors()
mycolor1 = min(colortuples)[1]
mycolor2 = max(colortuples)[1]
print(mycolor1)
pix = im.load()
for x in range(0, width):
    for y in range(0, height):
        if pix[x,y] == mycolor1:
            im.putpixel((x, y), (0,0,0))
im.save('MyImage.png')
