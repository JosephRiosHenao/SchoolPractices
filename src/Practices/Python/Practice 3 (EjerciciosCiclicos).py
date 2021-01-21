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
def Punto3():
    Producto, Suma, Input = 1,0,0
    while (Input != 999):
        Input = int(input("Digite '999' para salir\nDigite un numero: "))
        if (Input%2==0): Suma += Input
        if (Input%5==0): Producto *= Input
        print(f"Su suma es: {Suma}\nSu producto es: {Producto}\n\n")
def Punto4():
    NombreMeses = (["Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"])
    DineroTotal, DineroMeses= 0, []
    for i in range(12):
        try:
            DineroMeses.append(int(input(f"¿Cuanto dinero ahorrastes en {NombreMeses[i]}?: ")))
            DineroTotal += DineroMeses[i]
        except ValueError:
            print("Digite un valor valido")
    for i in range(12):
        print(f"{NombreMeses[i]}: {DineroMeses[i]}")
    print("Dinero total ahorrado en el año: {}".format(DineroTotal))
    (NombreMeses[0])
Punto4()
