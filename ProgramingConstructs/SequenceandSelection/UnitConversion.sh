#!/bin/bash -x

#this program performs unit conversion between feet,meterand inch
 
echo enter which conversion you want to perform 1. feet to inch 2. feet to meter 3. inch to feet  4. meter to feet

read -p "enter your choice" choice

read -p "enter the number" number


case "$choice" in
        1) res=$(( $number*12 ))
                echo $res inch
        ;;
        2) res=$( echo "$number 0.3048" | awk '{ print $1*$2 }' )
                echo $res meter
        ;;
        3)      res=$( echo "$number 0.0833" | awk '{ print $1*$2 }' )
                echo $res feet
        ;;
        4) res=$( echo "$number 3.28084" | awk '{ print $1*$2 }' )
                echo $res feet
        ;;
esac