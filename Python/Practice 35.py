import random
import pyxel

class Text():
    def __init__(self, text, color, x, y, state):
        self.text = text
        self.color = color
        self.x = x
        self.y = y
        self.state = state

    def update(self):
        pass
    
    def draw(self):
        if self.state:
            pyxel.text(self.x, self.y, self.text, self.color)

class Object():
    def __init__(self, m, x, K):
        self.m = m
        self.x = x
        self.K = K
        self.F = self.calculateF()  
        self.a = self.calculateA()
        self.texts = []
        self.initTexts()
        

    def update(self):
        pass

    def draw(self):
        pyxel.rect(96+self.x, 64, 5, 5, random.randint(1,15))
        for text in self.texts:
            text.draw() 

    def calculateF(self): 
        F = (self.K*self.x)*-1
        print("La fuerza es igual a: {}".format(F))        
        return F

    def calculateA(self): 
        a = (self.F/self.m)
        print("La accelaracion de desplazamiento es: {}".format(a))        
        return a 

    def initTexts(self):
        self.texts.append(Text("Fuerza: {}".format(self.F), random.randint(1,15), 100, 150, True))
        self.texts.append(Text("Acceleracion: {}".format(self.a), random.randint(1,15), 100, 100, True))

class App():
    def __init__(self, *args, **kwargs):
        m = float(input("m: "))
        x = float(input("x: "))
        K = float(input("K: "))
        # INICIALIZAR VENTANA
        pyxel.init( width      = 192,              # Ancho de ventana
                    height     = 128,              # Altura de ventana
                    caption    = "ParabolicShot",  # Titulo de la ventana
                    fps        = 200,              # FPS del programa
                    fullscreen = False,            # Estado de pantalla inicial
                    scale      = 4)                # Eyscala de la ventana inicial


        self.object = Object(m,x,K)
        pyxel.run(self.update, self.draw)

    def update(self):
        self.object.update()

    def draw(self):
        pyxel.cls(0)        
        self.object.draw()
        

App()