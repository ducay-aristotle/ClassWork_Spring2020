# -*- coding: utf-8 -*-

#Author: Aristotle Ducay
#Date: 09/16/2020
#File: SeasonsAndDays.py

import sys

#list of seasons
spring = ["Spring", "spring", "SPRING"]
summer = ["Summer", "summer", "SUMMER"]
fall = ["Fall", "fall", "FALL"]
winter = ["Winter", "winter", "WINTER"]

#empty strings for overwriting with user input
day = ""
month = ""

#takes user input for day num(int) and season(String)
day_num = int(input("Please enter a number between 1 and 7 "))
season = input("What season is it? ")

#if elif else statements to determin day for day_num variable
if day_num == 1:
    day = "Monday"
        
elif day_num == 2:
    day = "Tuesday"
    
elif day_num == 3:
    day = "Wednesday"
    
elif day_num == 4:
    day = "Thursday"

elif day_num == 5:
    day = "Friday"
    
elif day_num == 6:
    day = "Saturday"
    
elif day_num == 7:
    day = "Sunday"
    
else:
    print("invalid day number...")
    sys.exit(0)
    
#if elif else statements to determine month for month variable
if season == spring[0] or season == spring[1] or season == spring[2]:
    month = "March"
    print("The day is", day, "which is day number: ", day_num)
    print("The month is", month, "which is in the: ", season)
    
elif season == summer[0] or season == summer[1] or season == summer[2]:
    if day_num <= 3:
        month = "June"
        print("The day is", day, "which is day number: ", day_num)
        print("The month is", month, "which is in the:", season)
        
    else:
        month = "July"
        print("The day is", day, "which is day number: ", day_num)
        print("The month is", month, "which is in the:", season)
        
        if season == summer[0] or season == summer[1] or season == summer[2] and day_num == 6:
            print("Go Swimming!")
    
elif season == fall[0] or season == fall[1] or season == fall[2]:
    month = "September"
    print("The day is", day, "which is day number:", day_num)
    print("The month is", month, "which is in the:", season)
    
elif season == winter[0] or season == winter[1] or season == winter[2]:
    month = "December"
    print("The day is", day, "which is day number:", day_num)
    print("The month is", month, "which is in the:", season)
    
else:
    print("Invalid season...")
    sys.exit(0)

    


    

