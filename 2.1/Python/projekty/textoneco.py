import string
import random

text="It began with a small guard unit known as the Saal-Schutz (Hall Security) made up of party volunteers to provide security for party meetings in Munich. In 1925, Heinrich Himmler joined the unit, which had by then been reformed and given its final name. Under his direction (1929–1945) it grew from a small paramilitary formation during the Weimar Republic to one of the most powerful organisations in Nazi Germany. From the time of the Nazi Party's rise to power until the regime's collapse in 1945, the SS was the foremost agency of security, mass surveillance, and state terrorism within Germany and German-occupied Europe.The two main constituent groups were the Allgemeine SS (General SS) and Waffen-SS (Armed SS). The Allgemeine SS was responsible for enforcing the racial policy of Nazi Germany and general policing, whereas the Waffen-SS consisted of the combat units of the SS, with a sworn allegiance to Hitler. A third component of the SS, the SS-Totenkopfverbande (SS-TV; Death's Head Units[2]), ran the concentration camps and extermination camps. Additional subdivisions of the SS included the Gestapo and the Sicherheitsdienst (SD) organisations. They were tasked with the detection of actual or potential enemies of the Nazi state, the neutralisation of any opposition, policing the German people for their commitment to Nazi ideology, and providing domestic and foreign intelligence. "
text = text.upper()
for char in string.punctuation:
    text=text.replace(char, "")
    
dict = {}
listA = []
listB = []
for i in range(1, 27):
    listA.append(chr(96+i))
listB = random.shuffle(listA)

print(listB)
# for i in range (1, 27):
    # dict[listA[i]] = listB[i]
# print(dict)
print(text)
