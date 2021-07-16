a = int(input())
array = []
b = input()
b = b.split()
for x in b:
    x = int(x)
    array.append(x)
maxNum = 1
for x in array:
    if (x > maxNum): maxNum = x
print(maxNum)