#!/bin/bash 

#takes an input value and returns an array of its prime factors

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
    echo $number 
fi

}

count=0

read -p "enter a number that you want to check" number

for ((counter=$((number-1));counter>1; counter-- ))
do
    modulus=$( echo $number $counter | awk '{print $1%$2}' )
    if [[ $modulus -eq 0 ]]
    then 
    result=$( checkIfPrime $counter)
    primeFactorArray[ ((count++)) ]=$result
    fi
done

echo the prime factor array is ${primeFactorArray[@]}