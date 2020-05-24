#!/bin/bash

#random number between 1-12 is generated 50 times and the occurances of each number is found 

declare -A Month


for ((count=0;count<50;count++))
do
    random=$((RANDOM%12 + 1)) #generating a random number

    if [[ ${Month[$random]} == null ]]
    then
        Month[$random]=1
    else
        Month[$random]=$((Month[$random]+1 ))
    fi

done

#printing the key and values of the dictionary
for i in ${!Month[@]}
do 
    echo "month $i has ${Month[$i]} occurances "
done