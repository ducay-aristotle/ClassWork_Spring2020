# -*- coding: utf-8 -*-
"""
Date: 09/23/2020
File: MyOwnFunctions.py
Author: Aristotle Ducay
"""
#Function for creating a list of numbers that range from 1 to 13, inclusively
def numberList(start = 1, end = 13):
    numbers = []
    for i in range(start, end):
        numbers.append(i)
    return numbers

# Function for adding all values from the list
def sumOfList(x):
    x = sum(num_List)
    return x

# Function for multiplying values from the list
def productOfList(num_List):
    product = 1
    for i in num_List:
        product = product * i
    return product

#Function for getting even numbers from the list
def getEvenNum(num_List):
    for i in num_List:
        if i % 2 == 0:
            print(i, end=" ")
    return 

#variables to call functions
num_List = numberList(1, 13)
result = sumOfList(num_List)
product = productOfList(num_List)

#Prints out the corrisponding output for each variable
print(num_List)
print(result)
print(product)

#Calls the function getEvenNum to display all even numbers within the list
getEvenNum(num_List)

"""
Notes for me:
When having a function that returns nothing, but has stuff printing within a function,
call the function instead of printing the function
(Ex:getEvenNum() instead of print(evenNum)
"""
    