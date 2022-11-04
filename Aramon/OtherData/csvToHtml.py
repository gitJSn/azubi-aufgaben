#https://www.youtube.com/watch?v=q5uM4VKywbA

import csv

with open('AraMon.csv', 'r') as csv_file:
    csv_reader = csv.reader(csv_file, delimiter=';')

    next(csv_reader) #Ignoriere erste Zeile

    for line in csv_reader:
        print("<li>")
        print("    <div class=\"AraDexEntry\">")
        print("        <img src=\"AraMonImg/" + line[2].lower() + ".png\" alt=\"Image of Samsabis\">") #make name lowe case
        print("        <p class=\"AraMonNo\">" + line[1] + "</p>")
        print("        <p>" + line[2] + "</p>")
        print("        <span class=\"pill bg" + line[3] + "\">" + line[3] + "</span>")
        print("        <span class=\"pill bg" + line[4] + "\">" + line[4] + "</span>")
        print("    </div>")
        print("</li>")
        print()