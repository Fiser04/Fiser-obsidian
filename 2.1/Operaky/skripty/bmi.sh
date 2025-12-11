#!/bin/bash
read -p "Zadej vahu " vaha
read -p "Zadej vysku " vyska
trueVaha=$(bc --expression "$vaha/1" --scale=2)
trueVyska=$(bc --expression "$vyska/1" --scale=2)
cislo1=$(bc --expression "$trueVyska*$trueVyska" --scale=2)
cislo2=$(bc --expression "$trueVaha/$cislo1" --scale=2)
echo "Vase bmi je $cislo2"

if (($(bc --expression "$cislo2 < 18.5") == 1)); then
    echo "podvaha"
elif (($(bc --expression "($cislo2 >= 18.5)&&($cislo2 <= 24.9)") == 1)); then
    echo "norma"
elif (($(bc --expression "($cislo2 >= 25.0)&&($cislo2 <= 29.9)") == 1)); then
    echo "nadvaha"
elif (($(bc --expression "($cislo2 >= 30.0)&&($cislo2 <= 34.9)") == 1)); then
    echo "obezita 1. stupen"
elif (($(bc --expression "($cislo2 >= 35.0)&&($cislo2 <= 39.9)") == 1)); then
    echo "obezita 2. stupne"
else
    echo "obezita 3. stupne"
fi
