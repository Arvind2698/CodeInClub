#!/bin/bash
#random digit generation
random1=$((RANDOM))

echo $random1

#random number between 1 and 6
random2=$((RANDOM%6+1))

echo $random2

#random number 1 or 2
random3=$((RANDOM%2))

echo $random3