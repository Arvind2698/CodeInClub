#!/bin/bash 

#a gambler starts with Rs 100 and places Re 1 bet
#until he/she goes broke i.e. no more money to gamble or reaches the
#goal of Rs 200. Program keeps track of the number of wins,losses and final amount in hand

initialMoney=100
betCounter=0
winCounter=0
lossCounter=0

while [[ $initialMoney -lt 200 && $initialMoney -gt 0 ]]
do
    bet=$((RANDOM%2))
    ((betCounter++))
    if [[ $bet -eq 1 ]]
    then 
        initialMoney=$((initialMoney+1))
        ((winCounter++))
    elif [[ $bet -eq 0 ]]
    then    
        initialMoney=$((initialMoney-1))
        ((lossCounter++))
    fi
done

echo the money in hand is $initialMoney
echo number of times won is $winCounter
echo number of times lost is $lossCounter
echo number of bets is $betCounter