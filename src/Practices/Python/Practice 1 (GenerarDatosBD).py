import pyperclip
import random

Almacen = ""

def Copy(Almacen):
    pyperclip.copy(Almacen)

def Paste():
    pyperclip.paste()

def Generated(Almacen,Tabla):
    NombreLista = (["Carmen","Pedro","Joaquín","Jesús","María","Cristiano","Andres","Gerad","Ana","Eric","Eva","Hugo","Ivan","Juan","Laura","Leo"])
    CruceLista = (["Cr","Cll"])
    SubCruceLista = (["A","B","C","D","E","F",""])
    for ID in range(100):
        Nombre = random.choice(NombreLista)
        Cruce = random.choice(CruceLista)
        SubCruce = random.choice(SubCruceLista)
        NumeroDeCruce = random.randint(1,100)
        NumeroDeCruceContrario = random.randint(1,100)
        NumeroDeCasa = random.randint(1,100)
        Dirrecion = f"{Cruce} {NumeroDeCruce}{SubCruce} #{NumeroDeCruceContrario}-{NumeroDeCasa}"
        Almacen += f"\nINSERT INTO {Tabla} VALUES (\"{ID}\",\"{Nombre}\",\"{Dirrecion}\",\"Cali\");"
    print("Finalizado")

    Copy(Almacen)

print("Iniciando")
Generated(Almacen,"Cliente")