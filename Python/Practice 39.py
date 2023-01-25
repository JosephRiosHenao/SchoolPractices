for i in range(0,7):
    suma = 0
    for j in range(0, len(A[i])):
        suma = suma + 1
        
        
def todo(a,b):
    c = [0]*5
    for i, numero in enumerate(a):
        if i%2!=0:
            c[i]=numero+b[i]
        else:
            c[i]=numero
    return c
    
a =[1,2,3,4,5]
b =[3,5,7,4,8]

c = todo(a,b)

print(c)


total = 0
for i in range(1,10):
    acum = 0
    for j in range(1,4):
        acum = acum+j
    total += acum
print(total)


print("======")
for i in range(1,4+1):
    if ((4%i)==0):
        print(i)
print("======")
for i in range(1,4+1):
    if ((i%4)==0):
        print(i)

print("======")
for i in range(1,4):
    if((4%i)==0):
        print(i)
        
print("======")


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

import numpy
a = numpy.zeros(7,6)
for i in range(0,7):
    suma = 0
    for j in range(0, len(a[i])):
        suma = suma + a[i][j] * x[i]


n = int(input("ingrese un numero: "))
i = 3
signo = 1
mensaje = ""
while(i<n):
    mensaje =mensaje+str(i*signo)+ " "
    i=i+2
    signo=signo*-1
print(mensaje)


n = int(input("ingrese un numero: "))
i = 3
signo = 1
mensaje = ""
while(i<=n):
    mensaje =mensaje+str(i*signo)+ " "
    i=i+2
    signo=signo*-1
print(mensaje)

n = int(input("ingrese un numero: "))
i = 3
signo = -1
mensaje = ""
while(i<=n):
    mensaje =mensaje+str(i*signo)+ " "
    i=i+2
    signo=signo*-1
print(mensaje)



z = int(input("Digite el valor de z: "))
i = 1
sumapar = 0
sumaimpar = 0
while i<z:
    if i%2==0:
        sumapar = z+i
    else:
        sumaimpar = z+i
    i += 1
print("pares: {}".format(sumapar))
print("impares: {}".format(sumaimpar))

z = int(input("Digite el valor de z: "))
i = 1
sumapar = 0
sumaimpar = 0
while i<=z:
    if i%2==0:
        sumapar = sumapar+z
    else:
        sumaimpar = sumaimpar+z
    i += 1
print("pares: {}".format(sumapar))
print("impares: {}".format(sumaimpar))

z = int(input("Digite el valor de z: "))
i = 1
sumapar = 1
sumaimpar = 1
while i<=z:
    if i%2==0:
        sumapar = sumapar+i
    else:
        sumaimpar = sumaimpar+i
    i += 1
print("pares: {}".format(sumapar))
print("impares: {}".format(sumaimpar))

z = int(input("Digite el valor de z: "))
i = 1
sumapar = 0
sumaimpar = 0
while i<=z:
    if i%2==0:
        sumapar = sumapar+i
    else:
        sumaimpar = sumaimpar+i
    i += 1
print("pares: {}".format(sumapar))
print("impares: {}".format(sumaimpar))


total = 0
for i in range(1,10):
    acum = 0
    for j in range(1,4):
        acum = acum+j
    total += acum
print(total)