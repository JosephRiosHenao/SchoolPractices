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
    CiudadLista = (["Popayan","Timbio","Cali","Cucuta","Medellin","Pereira","Guacari","Cartagena","Bogota"])
    ProductoLista = (["Chocolates","Licor","Dulces","Jugo","Cepillo","Alcohol","Golosinas","Helado","Abientador","Carne","Pollo","Pavo","Costilla","Pimienta","Cayena","Sal","Azucar","Cafe","Frijoles","Yuca","Platano","Papa","Guisantes","Tomate","Cebolla","Mantequilla","Harina","Huevo","Queso","Jamon","Mermelada","Fresa","Uvas","Melocoton"])
    for ID in range(1000):
        Nombre = random.choice(NombreLista)
        Cruce = random.choice(CruceLista)
        SubCruce = random.choice(SubCruceLista)
        NumeroDeCruce = random.randint(1,100)
        NumeroDeCruceContrario = random.randint(1,100)
        NumeroDeCasa = random.randint(1,100)
        Producto = random.choice(ProductoLista)
        Ciudad = random.choice(CiudadLista)
        CodigoProducto = random.randint(0,1000)
        Cantidad = random.randint(0,100)
        PrecioIndividual = random.randint(1000,10000)
        Precio = PrecioIndividual * Cantidad
        Dirrecion = f"{Cruce} {NumeroDeCruce}{SubCruce} #{NumeroDeCruceContrario}-{NumeroDeCasa}"
        #Almacen += f"\nINSERT INTO {Tabla} VALUES (\"{ID}\",\"{Nombre}\",\"{Dirrecion}\",\"{Ciudad}\");"
        #Almacen += f"\nINSERT INTO {Tabla} VALUES (\"{ID}\",\"{Producto}\");"
        Almacen += f"\nINSERT INTO {Tabla} VALUES (\"{ID}\",\"{CodigoProducto}\",\"{Cantidad}\",\"{Precio}\");"

    print("Finalizado")
    Copy(Almacen)

print("Iniciando")
Generated(Almacen,"item_ventas")
#ITEM_VENTAS(Número_Factura, codigo_producto,cantidad,precio) VENTAS(numero_factura, codigo_cliente,fecha)