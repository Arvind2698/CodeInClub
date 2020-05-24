#!/bin/bash 

read -p "enter the number who's factorial you want" number

fact=1;

for ((count=$number ; count>=1 ; count-- ))
do
    fact=$((count*fact))
done

echo the factorial of the number $number is $fact