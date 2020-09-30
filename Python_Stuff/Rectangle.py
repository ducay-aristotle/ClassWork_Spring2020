# -*- coding: utf-8 -*-

#Author: Aristotle Ducay
#Date: 09/15/2020
#File: Rectangel.py

"""
A simple program which calculates 
the perimeter and area of a rectangle 
using the user's input
"""

#Info for user
info = "calculate the perimeter and area of a rectangle"
print(info)

#Getting user input and saving to variables
width = int(input("What is the width? "))
length = int(input("What is the length? "))

#calculating perimeter (P= 2(w+l))
perimeter = 2*(width + length)

#calculating area (A = w*l)
area = (width) * (length)  #converts user input from type string to type int

print("-----------")
print("calculating")
print ("-----------")

#printing the results to the user
print("The width of the rectable is: ", width)
print("The length of the rectable is: ", length)
print("The area of the rectable is: ", area)
print("The perimeter of the rectable is: ", perimeter)

