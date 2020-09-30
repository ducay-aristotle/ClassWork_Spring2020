# -*- coding: utf-8 -*-
"""
Date: 09/23/2020
File: AnonymousFunctions.py
Author: Aristotle Ducay
"""
#varying Lambda Functions
addTwo = lambda health, healthBoost: health + healthBoost
average = lambda score_One,score_Two,score_Three: score_One + score_Two + score_Three / 3
powerThree = lambda pwr_UP: pwr_UP**3
info = lambda message: message
lowerStr = lambda lowerCase: lowerCase.strip().lower()
subUpperStr = lambda upperCase:  upperCase.upper().strip()[1:4]
halfList = lambda someList: someList[0:3]

#calling addtwo lambda function w/ assigned perams
health = 132
healthBoost = 150
print(addTwo(health,healthBoost))

#calling average lambda function w/ assigned perams
score_One = 156
score_Two = 105
score_Three = 12
print(average(score_One,score_Two,score_Three))

#calling lambda function to raise the power of the variable pwr_UP
pwr_UP = 23
print(powerThree(pwr_UP))

#Calling the info lambda w/ variable message to print Hello World!
message = "Hello World"
print(info(message))
#If print statement is in lambda function.(info(message))

#Calls the lambda function lowerStr to print CWU in lowercase
lowerCase = " CWU "
print(lowerStr(lowerCase))

#Calls the lambda function upperCaseStr to print out cwu in UpperCase
upperCase = " ccWucentral "
print(subUpperStr(upperCase))

#Calls the lambda function halfLIst to print out half of the list from the variable someList
someList = [1,2,3,4,5,6]
print(halfList(someList))


"""
Notes for me:
    using  dot operator to concatine the functions, .upper() and .strip()
"""

