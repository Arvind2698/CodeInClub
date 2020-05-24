#!/bin/bash 

#prints a table of the powers of 2 that are less than or equal to 2^n

read -p "enter a the value of N" N


for (( count=1; count<=$N; count++ ))
do 
    echo 2 power $count equals to $(( 2**count ))
done