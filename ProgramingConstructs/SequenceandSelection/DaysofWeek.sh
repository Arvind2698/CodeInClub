#!/bin/bash

read -p "enter digit between 1 and 6" digit

case "$digit" in
        0) echo sunday
        ;;
        1) echo monday
        ;;
        2) echo tuesday
        ;;
        3) echo wednesday
        ;;
        4) echo thursday
        ;;
        5) echo friday
        ;;
        6) echo saturday
        ;;
        *) echo Wrong Choice

esac