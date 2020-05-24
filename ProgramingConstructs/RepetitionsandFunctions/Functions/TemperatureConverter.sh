#!/bin/bash 

#converts input between degC and degF based on selected option 

read -p "1. For conversion from degC to degF 
2. For conversion from degF to degC
Please enter your choice " option

read -p "Enter the temprature" temp

function degC2degF(){
    local degC=$1
    local constant1=$( echo 9 5 | awk '{print $1/$2}' )
    local calc=$( echo $degC $constant1 | awk '{print $1*$2 + 32}' )
    echo $calc
}

function degF2degC(){
    local degF=$1
    degF=$((degF - 32 ))
    constant2=$( echo 5 9 | awk '{print $1/$2}' )
    local calc=$( echo $degF $constant2 | awk '{print $1*$2}' )
    echo $calc
}

case "$option" in 
    1)  if [[ $temp -gt 0 && $temp -lt 100 ]]
        then
        result=$( degC2degF $temp)
        echo the temprature in DegF is $result
        else
            echo entered temprature not in range
        fi    
        ;;
    2)  if [[ $temp -gt 32 && $temp -lt 212 ]]
        then
        result=$( degF2degC $temp)
        echo the temprature in DegC is $result
        else
            echo entered temprature not in range
        fi
        ;;
    *) echo enter different option
esac