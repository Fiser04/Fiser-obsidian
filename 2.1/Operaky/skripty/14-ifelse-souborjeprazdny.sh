#!/bin/bash
txt="file.txt"
if [[ -z $txt ]]; then
    echo "soubor je prazdny"
else
    echo "soubor je plny"
fi
