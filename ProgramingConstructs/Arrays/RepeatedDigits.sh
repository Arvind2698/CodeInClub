#!/bin/bash 

#take the numbers between 1-100 and returns the numbers that have the same repeated digits (11,22,33)

count=0

for ((counter=10;counter<100;counter++))
do
    firstDigit=$((counter/10))
    lastDigit=$((counter%10))

    if [[ $firstDigit -eq $lastDigit ]]
    then
        digitArray[ ((count++)) ]=$counter
    fi

done

echo ${digitArray[@]}