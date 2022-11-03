#https://www.youtube.com/watch?v=q5uM4VKywbA

import csv

with open('AraMon.csv', 'r') as csv_file:
    csv_reader = csv.reader(csv_file)

    next(csv_reader) #Ignoriere erste Zeile

    for line in csv_reader:
        print("Comic drawing of a pokemon like figure named " + line[1])