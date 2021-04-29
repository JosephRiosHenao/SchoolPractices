class Pila:
    def __init__(self, n): # M´etodo constructor.
        self.index = -1
        self.buffer = [None] * n
        print(self.buffer)
    def push(self, value): # Apila un elemento.
        if self.index >= len(self.buffer):
            raise "Error: Pila llena."  
        self.index += 1
        self.buffer[self.index] = value
        print(self.buffer)

    def top(self): # Consulta la cima de la pila.
        if self.index < 0:
            raise "Error: Pila vac´ıa."
        print(self.buffer)
        return self.buffer[self.index]
    def pop(self): # Extrae la cima de la pila.
        if self.index < 0:
            raise "Error: Pila vac´ıa."
        self.index -= 1
        print(self.buffer)
        return self.buffer[self.index+1]
p = Pila(5)
p.push(3)
p.push(2)
print (p.top())
print (p.pop())
print (p.pop())