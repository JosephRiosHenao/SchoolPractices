class Caja:
    def __init__(self,largo,ancho,alto):
        self.largo = largo 
        self.ancho = ancho
        self.alto = alto
    def calcularVolumen(self):
        return self.largo * self.ancho * self.alto

largo = int(input("Digite el largo: "))
ancho = int(input("Digite el ancho: "))
alto = int(input("Digite el alto: "))
caja = Caja(largo,ancho,alto)
print("Su volumen es",caja.calcularVolumen())
