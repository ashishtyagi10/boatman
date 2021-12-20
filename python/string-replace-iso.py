import csv
from typing import OrderedDict

# open the csv file and load it as dictionary
mymapping = {}
with open("convert.csv", "r") as csvfile:
    reader = csv.reader(csvfile)
    mymapping = {rows[0]: rows[1] for rows in reader}

print(mymapping)


# search and replace the string in the file
temp_file = open("it1.txt", "r+")

with open("it1.txt", "r+") as f:
    for line in f:
        for key, value in mymapping.items():
            line = line.replace(key, value)
        temp_file.write(line)

print("Done")
