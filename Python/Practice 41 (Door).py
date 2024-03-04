n, m = '30 100'.split()
n, m = int(n), int(m)


def set_floor(words):
    chain = ''
    for _ in range(int((m-len(words))/2)): chain += '-'
    chain += words 
    for _ in range(int((m-len(words))/2)): chain += '-'
    return chain

door = []
for i in range(1,int(n-1/2)):
    if i%2==0: continue
    door.append('.|.'*i)

for word in door: print(set_floor(word))
print(set_floor('WELCOME'))
for i in range(len(door),0,-1): print(set_floor(door[i-1]))
