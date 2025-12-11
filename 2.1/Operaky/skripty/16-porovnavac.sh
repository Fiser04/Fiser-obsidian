#!/bin/bash
read -p "cislo 1" cislo1
read -p "cislo 2" cislo2
if (( cislo1 > cislo2 )); then
    echo "cislo jedna je vetsi"
elif (( cislo2 > cislo1 )); then
    echo "cislo dva je vetsi"
else
    echo "cisla jsou rovna"
fi

