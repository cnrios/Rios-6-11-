import requests

url  = "http://www.boredapi.com/api/activity?type=recreational&#39"

data = requests.get(url)

data = data.text

with open ("arc2.txt","w") as f :

    f.write(data)