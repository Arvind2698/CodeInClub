#!/bin/bash -x 

#programs continues to run till head or tail has occured 11 times

tailWinCounter=0;
headWinCounter=0;


while [[ $tailWinCounter -lt 11 && $headWinCounter -lt 11 ]]
do
    toss=$((RANDOM%2))
    if [[ $toss -eq 1 ]]
    then 
        (( headWinCounter++ ))
    else
        (( tailWinCounter++ ))
    fi
done

if [[ $headWinCounter -eq 11 ]]
then 
    echo heads has won
elif [[ $tailWinCounter -eq 11 ]]
then
    echo tails has won
fi