#!/bin/bash 

read -p "enter the value of N " N

harmonicSum=0;

for ((count=1;count<=$N;count++))
do
    #finds the value of each element in the series and gives their summation
    element=$( echo $count | awk '{ print 1/$1 }' ) 
    harmonicSum=$( echo $element $harmonicSum | awk '{print $1+$2}' )

    echo element $count in the harmonic series $element
done

echo the total sum of the harmonic series till $N will be $harmonicSum