import requests
import json

base_url = "https://xkcd.com/info.0.json"

# To convert bytes in text
data = requests.get(base_url)


# json.loads to decode in text
data_json_obj = json.loads(data.content)

print(data_json_obj['img'])

# print('\n',data_json_obj["img"],'\n')