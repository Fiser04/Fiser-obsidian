#!/bin/bash
read cislo
for ((i = 1; i<11; i++)); do
    echo $((cislo * i))
done
