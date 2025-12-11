#!/bin/bash
pole=("karel" "pepa" "mrvic")
echo ${#pole[@]}
echo ${pole[2]}
pole[2]="jan"
unset pole[0]
echo ${#pole[@]}
