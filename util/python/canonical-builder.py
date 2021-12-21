import csv
from typing import OrderedDict

# load the properties file
import myconfig
print("myconfig.properties loaded")
print(myconfig.pain001_name)

# open the csv file and load it as dictionary
mymapping = {}
with open("convert.csv", "r") as csvfile:
    reader = csv.reader(csvfile)
    mymapping = {rows[0]: rows[1] for rows in reader}

print("========== all mappings are loaded ==========")
for key, value in mymapping.items():
    print(key, '==> ', value)


# search and replace the string in the file
temp_file = open("it1.txt", "r+")

print("========== start to search and replace the json schema ==========")
with open("it1.txt", "r+") as f:
    for line in f:
        for key, value in mymapping.items():
            line = line.replace(key, value)
        temp_file.write(line)

print("============ program end ===============")
