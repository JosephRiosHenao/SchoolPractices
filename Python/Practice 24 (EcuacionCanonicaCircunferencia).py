import math

print('r²=(x-h)²+(y-k)²')
center = []
for num in ['x','y']:
    center.append(float(input('Input center coodinate {}: '.format(num))))
radio = float(input('Input the radio: '))
result = math.pow(2,radio)
print( '{}=(x,-({}))²+(y-({}))²'.format(result,center[0],center[1]))

