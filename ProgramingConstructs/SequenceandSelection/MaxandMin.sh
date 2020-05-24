#!/bin/bash -x

#program reads five numbers and finds the maximum and minimum number from the input

read -p "number 1" one
read -p "number 2" two
read -p "number 3" three
read -p "number 4" four
read -p "number 5" five

max=$one

if [[ $two -gt max ]]
then
max=$two
fi

if [[ $three -gt max ]]
then
max=$three
fi

if [[ $four -gt max ]]
then
max=$four
fi

if [[ $five -gt max ]]
then
max=$five
fi


min=$one


if [[ $two -lt min ]]
then
min=$two
fi

if [[ $three -lt min ]]
then
min=$three
fi

if [[ $four -lt min ]]
then
min=$four
fi

if [[ $five -lt min ]]
then
min=$five
fi

echo the max number is $max
echo the min number is $min