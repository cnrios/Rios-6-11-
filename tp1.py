
import requests

url = "http://www.boredapi.com/api/activity?type=recreational&#39"


response = requests.get(url)

data = response.text

print(data)

import os

file = open ("arc1.txt","w")
file.write("activity:Create a persolnal website,type:recreational,participants:1,price;0.1,link:,key:3141417,accessibility:0,12")
file.close()
