class Vehicle:
    def __init__(self,numTire,color):
        self.numTire = numTire
        self.color = color
    def __str__(self):
        return "Traccion: "+str(self.numTire)+" Color: "+str(self.color)

class Auto(Vehicle):
    def __init__(self,numTire,color,velocity):
        super().__init__(numTire,color)
        self.velocity = velocity
    def __str__(self):
        return super().__str__()+" Velocidad km/h: "+str(self.velocity)

class Bicycle(Vehicle):
    def __init__(self, numTire, color,type):
        super().__init__(numTire, color)
        self.type = type
    def __str__(self):
        return super().__str__()+" Tipo de bicicleta: "+self.type

vehicle = Vehicle(3,"Yellow")
print(vehicle)

auto = Auto(4,"red",54)
print(auto)

bicycle = Bicycle(2,"green","Mountain")
print(bicycle)
