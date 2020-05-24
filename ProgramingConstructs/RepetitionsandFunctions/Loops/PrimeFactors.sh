#!/bin/bash 

#finds the factors of the entered number and checks if they are prime or not

function checkIfPrime(){

local tempCounter=0
local number=$1

for (( counter=$((number-1)) ; counter>1 ; counter--  ))
do
    checker=$( echo $number $counter | awk '{print $1%$2}')
    
    if [[ $checker -eq 0 ]]
    then 
        ((tempCounter++))
        break
    fi

done

if [[ $tempCounter -eq 0 ]]
then 
    echo the number $number is a prime factor
fi

}



read -p "enter a number that you want to check" number

for ((counter=$((number-1));counter>1; counter-- ))
do
    modulus=$( echo $number $counter | awk '{print $1%$2}' )
    if [[ $modulus -eq 0 ]]
    then 
    result=$( checkIfPrime $counter)
    echo $result
    fi
done