#!/bin/bash -x

read -p "enter the number which you want to check" number

divider=1

function checkPalindrom(){
    local number=$1
    local status=0


    while [[ $(($number/$divider)) -gt 10 ]]
    do
        divider=$((divider*10))
    done


    while [[ $number -gt 0 ]]
    do

        firstdigit=$((number/divider))
        lastdigit=$((number%10))
        if [[ $firstdigit -ne $lastdigit ]]
        then
            ((status++))
        break
        fi
        number=$((number%divider))
        number=$((number/10))
        divider=$((divider/100))    
    done

echo $status
}

res=$( checkPalindrom $number )

if [[ $res -eq 0 ]]
then 
    echo the give number $number is palindrome
else
    echo the give number $number is NOT a palindrome
fi