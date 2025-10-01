userInput = ""
num = -1
while(True):
    inputing = input()
    if (inputing=="stop"):
        break
    else:
        num += 1
        userInput+=str(num) + ": " +inputing +  " delka: " + str(len(inputing))+ "\n"

print(userInput)