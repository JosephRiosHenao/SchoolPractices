class Rectangulo:
    def __init__(self,base,altura):
        self.base = base
        self.altura = altura
    
    def calcular(self):
        return self.base * self.altura
    
base = int(input("Digite la altura: "))
altura = int(input("Digite la base: "))

Area = Rectangulo(base,altura)
print("El area es:",Area.calcular())
