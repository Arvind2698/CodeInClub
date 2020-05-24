#!/bin/bash 

# checks if the entered number is palindrome if true checks if it is prime
function primeCheck(){
    tempCounter=0
    number=$1

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
        echo the number $number is a prime number and also palindrome
    else
        echo the number $number is NOT a prime BUT it is a palindrome
    fi
}


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
    result=$( primeCheck $number )
    echo $result
else
    echo the give number $number is NOT a palindrome
fi