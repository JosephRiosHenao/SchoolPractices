class Aritmetica:
    def __init__(self,num1,num2):
        self.num1 = num1
        self.num2 = num2
        
    def sumar(self):
        return self.num1 + self.num2
    
    def restar(self):
        return self.num1 - self.num2
    
    def multiplicar(self):
        return self.num1 * self.num2
    
    def dividir(self):
        return self.num1 / self.num2
    
ClassSumar = Aritmetica(2,4)
print("Resultado suma:",ClassSumar.sumar())
print("Resultado resta:",ClassSumar.restar())
print("Resultado multiplicar:",ClassSumar.multiplicar())
print("Resultado dividir",ClassSumar.dividir())