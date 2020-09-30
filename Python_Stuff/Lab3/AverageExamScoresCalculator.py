# -*- coding: utf-8 -*-

#Author: Aristotle Ducay
#Date: 09/16/2020
#File: AverageExamScoresCalculator.py

sum_elements = 0 
average_score = 0

scores = []

while 1 > 0:
    user_input = int(input("Please enter an exam score or -1 to stop"))
    if user_input == -1:
        break
    
    else:
        scores.append(user_input)
        
    print("The exam scores: ")
    
    for i in scores:
        print(scores)
        
    for i in range(len(scores)):
        sum_elements = sum_elements + scores[i]
        
    average_score = sum_elements / len(scores)
    
    print()
    print("The average exam score is: ", average_score)

    
    
    

