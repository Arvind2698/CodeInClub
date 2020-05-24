#!/bin/bash 

#the dice is rolled until any one number has occured 10 times. The number with maximum and minimum 
#occurance are displayed

declare -A dice

#function to check if any value in the dictionary has reached 10
function check(){
    status=0
    for i in ${!dice[@]}
    do
        if [[ ${dice[$i]} == 10 ]]
        then 
            status=$((status+1))
            break;
        fi
    done
    echo $status
}

#while no value in the dictionary has reached 10 then keep generating random values
while [[ true ]]
do
    res=$( check )
    if [[ $res -eq 0 ]]
    then
        random=$((RANDOM%6 + 1))
        if [[ ${dice[$random]} == null ]]
        then
            dice[$random]=1
        else
            dice[$random]=$((dice[$random]+1))
        fi
    else
        break
    fi

done

#displaying the dictionary
for i in ${!dice[@]}
do
    echo "$i => ${dice[$i]}"
done

#finding the minimum value and the repective index in the dictionary
min=1
for i in ${!dice[@]}
do
    if [[ ${dice[$min]} -gt ${dice[$i]} ]]
    then
        min=$i
    fi
done

echo the number with the minimum occurance is $min with ${dice[$min]} occurances 

#finding the maximum value and the repective index in the dictionary
max=1
for i in ${!dice[@]}
do
    if [[ ${dice[$max]} -lt ${dice[$i]} ]]
    then
        max=$i
    fi
done

echo the number with the maximum occurance is $max with ${dice[$max]} occurances 