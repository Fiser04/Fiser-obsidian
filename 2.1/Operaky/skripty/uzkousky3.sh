#!/bin/bash
read -p "cislo1" cislo1
read -p "cislo2" cislo2
read -p "cislo3" cislo3

echo "objem $((cislo1 * cislo2 * cislo3))"


if (((cislo1 == cislo2) && (cislo1 == cislo3))); then
    echo "obsah je $((6*(cislo1*cislo1)))"
else
    echo "obsah $((2*(cislo1*cislo2 + cislo1*cislo3 + cislo2*cislo3)))"
fi

