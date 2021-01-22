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
def Punto5():
    while (True):
        Color = "N/A"
        Color = input(f"\nColor = {Color}\nDigite un color, sí digita 'BLUE' finaliza el programa: ")
        if (Color == "BLUE"): break;
def Punto6():
    for i in range(5):
        eleccion = int(input("PERSONA #{}\n\n1.Bogota\n2.Medellin\n3.Cali\nDigite su ciudad favorita: ".format(i+1)))
        if eleccion == 1: print("\n\nVamos a comenzar hablando de Bogotá, capital de la República de Colombia y del departamento\nde Cundinamarca, además de ser el epicentro político, administrativo, económico, industrial,\nartístico, cultural, deportivo y, por supuesto, turístico del país. Se trata de una ciudad diversa y\nmulticultural en la que se combinan las construcciones modernas con las del pasado colonial.\nAdemás, es importante tener en cuenta que gracias a sus cerros y a sus parques, es una ciudad\nverde.\n\n")
        if eleccion == 2: print("\n\nLa segunda ciudad más poblada de Colombia es Medellín, capital del departamento de\nAntioquia. Situada en la cordillera central de los Andes, es un destino ideal para hacer\nsenderismo, tirolina y montar a caballo. Además, los turistas podrán disfrutar de unas\nvacaciones llenas de cultura.\n\n")
        if eleccion == 3: print("\n\nTras Medellín, la ciudad más poblada de Colombia es Cali, cuyo nombre oficial es Santiago de\nCali. Se trata de la capital del departamento del Valle del Cauca y está considerada como una de\nlas ciudades más antiguas de América. Por otro lado, debes saber que se trata de uno de los\nprincipales centros económicos e industriales del país.\n\n")
Punto6()
