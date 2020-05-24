#!/bin/bash -x
#checks if the entered number is prime or not
flag=0

read -p "enter a number of your choice" number

for (( counter=$((number-1)) ; counter>1 ; counter--  ))
do
    checker=$( echo $number $counter | awk '{print $1%$2}')
    
    if [[ $checker -eq 0 ]]
    then 
        ((flag++))
        break
    fi

done

if [[ $flag -eq 0 ]]
then 
    echo the number $number is a prime number
else
    echo the number $number is a NOT a prime number
fi