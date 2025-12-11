#!/bin/bash
generovane=$((1 + $RANDOM % 100))
pusteno=true
while true; do
    read cislo
    if (( cislo > generovane )); then
	echo "to je moc"
    elif (( cislo < generovane )); then
	echo "moc malo"
    else
	echo "uhadl"
	break
    fi
done
