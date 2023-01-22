

total = 0
for n in [1,2]:
    acum = 0
    for m in [1,2,3,4,5]:
        acum = acum + m
    total += acum
print(total)

sw = 0
j = 0
n = int(input("Digite el valor de n: "))
i = n-1
while i>1 and sw!=1:
    if n%i==0:
        sw = 1
    else:
        i-=1
    j+=1
print("iterraciones: ",j)
if sw==1:
    print("no es primo")
else:
    print("si es primo")
        

n = int(input("ingrese numero n: "))
total = int(input("ingrese numero total: "))
num = 0
i = 0 
while num<=n:
    if i%2==0:
        total+=i
        print(i)
        num+=1
    i+=1
print(total)

numero = 32
resultado = 0

if numero>=5 and numero<=60:
    resultado = numero*100
else:
    if numero>60 and numero<=100:
        resultado = numero+200
    else:
        resultado = numero*numero
print(resultado)

x = float(input("Digite coordenada x: "))
y = float(input("Digite coordenada y: "))
if x >= 0 and y >= 0:
    print("1 cuadrante")
elif x<0 and y>=0: 
    print("2 cuadrante")
elif x<0 and y <0:
    print("3 cuadrante")
else:
    print("4 cuadrante")

def a(x):
    return str(x)

def b(x):
    return x

def c(x,y):
    x+y

print(c(a(1),b("1")))


n = 6 
total = 2

for i in range(1, n+1):
    m = total + 1
    total = total +1 
print(total)

import numpy

a = [[1, 5, 7, 23], [4, 1, 10, 14], [3, 7, 1, 2]]
print((a[0][2]+a[1][2]+a[1][3]+a[2][1]))


a  = [1,2,3,4,5]
b = a
b[2] = float(input("Digite un numero: "))

print(a[2])

def toto(a,b):
    
    c = [[0 for _ in range(len(a[0]))] for _ in range(len(a))]
    
    for i in range(len(a)):
        for j in range(len(a[0])):
            if j==i:
                c[i][j] = a[i][j] + b[i][j]
    return c

a = [
    [1,2,3],
    [4,5,6],
    [7,8,9]
]

b = [
    [2,2,2],
    [-1,5,1],
    [1,0,11]
]

c= toto(a,b)
print(c)

def suma(numeros):
    suma = 0
    for i in range(0,3):
        for j in range(0,3):
            if (i==j):
                suma = suma + numeros[i][j]
    print("la suma es:", suma)
suma([[20,2,4],[15,1,1],[6,2,2]])

