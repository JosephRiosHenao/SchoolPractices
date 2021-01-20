def Punto1():
    i = 1
    while (i<=20):
        if (i%2==0): print(f"Numero par: {i}");
        i += 1
def Punto2():
    Entrada = 0;
    while(Entrada != 20):
        Entrada = int(input("Introduzca un numero\nSi desea salir digite \"20\"\n"))
        if (Entrada==0): print(f"{Entrada} es un numero neutro\n")
        elif (Entrada>0): print(f"{Entrada} es un numero positivo\n")
        else: print(f"{Entrada} es un numero negativo\n")
Punto2()