#!/bin/bash

# takes an input array and returns the combination of three numbers from the array whose sum is 0

numbers=(1 -2 3 -4 5 -6 7)

sum=0

for ((count=0;count<${#numbers[@]};count++))
do
    sum=$((sum+${numbers[$count]}))
done

for ((count=0;count<${#numbers[@]};count++ ))
do
    
    first=${numbers[$count]}

    for ((countf=0;countf<${#numbers[@]};countf++))
    do
        while [[ $countf -ne $count ]]
        do
            second=${numbers[$countf]}

            for ((counts=0;counts<${#numbers[@]};counts++))        
            do
                while [[ $counts -ne $count && $counts -ne $countf ]]
                do
                    third=${numbers[$counts]}

                    if [[ $(($first+$second+$third)) -eq 0 ]]
                    then
                        echo found $first $second $third                        
                    fi

                break
                done

            done

        break
        done

    done


done