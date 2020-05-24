#!/bin/bash -x

random=$(( RANDOM%2 ))

if [[ random -eq 1 ]]
then
        echo HEAD
else
        echo TAIL
fi