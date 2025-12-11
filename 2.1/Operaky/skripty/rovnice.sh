#!/bin/bash
read -p "Zadejte teplotu ve stupnich celsia " cislo
celsia=$(bc --expression "$cislo/1" --scale=2)
cislo1=$(bc --expression "$celsia * 9" --scale=2)
cislo2=$(bc --expression "$cislo1 / 5" --scale=2)
cislo3=$(bc --expression "$cislo2 + 32" --scale=2)

echo "$celsia C je $cislo3 F"

if (($(bc --expression "$celsia < 0") == 1)); then
    echo "teplota je pod bodem mrazu"
elif (($(bc --expression "$celsia == 0") == 1)); then
    echo "teplota je nulova"
else
    echo "teplota je nad bodem mrazu"
fi
