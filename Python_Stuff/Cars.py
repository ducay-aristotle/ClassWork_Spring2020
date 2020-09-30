# -*- coding: utf-8 -*-

#Author: Aristotle Ducay
#Date: 09/16/2020
#File: Cars.py

#List objects for car makes, models and years
years = [2001, 1989, 2019, 1999]
makes = ["Honda", "Toyota", "Mercedes", "Nissan"]
models = ["Accord", "Camry", "C63AMG", "Skyline"]

#indexing values for years and makes list
years[2] = 2019
makes[3] = "Nissan GTR"

#adding to the 3 list objects with var.append()
makes.append("BMW")
models.append("M6")
years.append("2009")

print("Car1: ", years[0], "", makes[0], "", models[0])
print("Car2: ", years[1], "", makes[1], "", models[1])
print("Car3: ", years[2], "", makes[2], "", models[2])
print("Car4: ", years[3], "", makes[3], "", models[3])
print("Car5: ", years[4], "", makes[4], "", models[4])

