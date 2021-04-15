import math
status = True
yi = float(input('Digite Yi: '))
vi = float(input('Digite Vi: '))
tSum = float(input('Digite la diferencia de tiempo: '))
limit = float(input('Digite tiempo maximo: '))
t = 0
while (status):
    if (t<=limit):
        resultPosition = yi+vi*t-((9.8*math.pow(t,2))/2)
        resultVelocity = vi-9.8*t
        print('Posicion:',resultPosition,'\nTiempo:',t,'\nVelocidad:',resultVelocity,'\n')
        t = t + tSum
    else:
        status = False