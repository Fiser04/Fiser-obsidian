#!/bin/bash
read -p "cislo 1: " cislo1
read -p "cislo 2: " cislo2
read -p "<, >" vetsimensi

if ((cislo1 > cislo2)); then
    max=cislo1
    min=cislo2
elif ((cislo1 < cislo2)); then
    max=cislo2
    min=cislo1
else
    echo "cislo jsou stejne"
fi

if [[ $vetsimensi == "<" ]]; then
    echo "mensi cislo je $min"
elif [[ $vetsimensi == ">" ]]; then
    echo "vetsi je $max"
else
    echo "toto neni operator"
fi
