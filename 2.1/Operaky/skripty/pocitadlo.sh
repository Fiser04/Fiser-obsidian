#!/bin/bash
hodnota1=2
hodnota2=2
echo $((hodnota1 + hodnota2))

if ((hodnota1 == hodnota2)); then
    echo $"true"
else
    echo $"false"
fi

