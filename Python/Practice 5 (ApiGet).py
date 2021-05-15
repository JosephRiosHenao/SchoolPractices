import http.client

conn = http.client.HTTPSConnection("api.zoom.us")

headers = {
    'authorization': "Bearer 39ug3j309t8unvmlmslmlkfw853u8",
    'content-type': "application/json"
    }

conn.request("GET", "/v2/users?status=active&page_size=30&page_number=1", headers=headers)

res = conn.getresponse()
data = res.read()

print(data.decode("utf-8"))