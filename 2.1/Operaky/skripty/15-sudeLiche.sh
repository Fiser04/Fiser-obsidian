#!/bin/bash
read -p "zadejte cislo" cislo
sudic=$cislo%2
if (( sudic == 0)); then
    echo "cislo je sude"
else
    echo "cislo je liche"
fi

if (( $((cislo%2)) == 0)); then
    echo "cislo je delitelne dvema"
fi
if (( $((cislo%3)) == 0 )); then
    echo "cislo je delitelne tremi"
fi
