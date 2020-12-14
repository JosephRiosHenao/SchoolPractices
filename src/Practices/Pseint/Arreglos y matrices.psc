//Crear un arreglo llamado nombres y que almacene los siguientes nombres de personas: Juan, Pedro, Maria, Humberto y Oscar
//Llenar un arreglo con nombres de personams. Preguntar al usuario cuantos datos desea ingresar
//Para sumar los elementos de un vector debemos usar un acumulador inicializado en cero
//Crear una matriz de 4x5 y cargarlos con los primeros numeros naturales; al ingresar un numero cualquiera debera buscar dicho numero en la matriz e indicar en que fila y columna se encuentra el numero dado
Funcion Actividad1
	Definir Nombres Como Caracter;
	Definir i como entero;
	Dimension Nombres(5);
	Nombres[0] = "Juan";
	Nombres[1] = "Pedro";
	Nombres[2] = "Maria";
	Nombres[3] = "Humberto";
	Nombres[4] = "Oscar";
	Escribir "[" Sin Saltar;
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		Escribir Nombres[i]+", " Sin Saltar;
	Fin Para
	Escribir "]" Sin Saltar;
	WaitMessage;
	Menu;
FinFuncion
Funcion Actividad2
	Definir Nombres Como Caracter;
	Definir i, SizeDeArreglo como entero;
	Escribir "Digite el tamano del arreglo de nombres";
	leer SizeDeArreglo;
	Dimension Nombres(SizeDeArreglo);
	Para i = 0 Hasta SizeDeArreglo - 1 Con Paso 1 Hacer
		Escribir "Digite el nombre #",(i+1),;
		leer Nombres[i];
	Fin Para
	Escribir "[" Sin Saltar;
	Para i = 0 Hasta SizeDeArreglo - 1 Con Paso 1 Hacer
		Escribir Nombres[i]+", " Sin Saltar;
	Fin Para
	Escribir "]" Sin Saltar;
	WaitMessage;
	Menu;
FinFuncion
Funcion Actividad3
	Definir ConfirmacionMatriz Como Logico;
	Definir i,j,Filas,Columnas,Confirmacion,Option Como Entero;
	Definir Number,Resultado,Minimo,Maximo Como Real;
	ConfirmacionMatriz = verdadero;
	Resultado = 0;
	Mientras ConfirmacionMatriz == Verdadero hacer
		Escribir "Valor recomendado 10 filas y 10 columnas";
		Escribir "Digite el tamaño de Filas";
		leer Filas;
		Escribir "Digite el tamaño de columnas";
		leer Columnas;
		Limpiar Pantalla;
		Escribir "Filas = ",Filas," Columnas = ",Columnas;
		Escribir "------------------------";
		si (Columnas>=Filas) Entonces
			Para i=0 Hasta Filas-1 Con Paso 1 Hacer
				Para j=0 Hasta Columnas-1 Con Paso 1 Hacer
					Escribir " |",i,",",j,"| " Sin Saltar;
				Fin Para
				Escribir "";
			Fin Para
		FinSi
		si (Columnas<Filas) Entonces
			Para i=0 Hasta Filas-1 Con Paso 1 Hacer
				Para j=0 Hasta Columnas-1 Con Paso 1 Hacer
					Escribir " |",i,",",j,"| " Sin Saltar;
				Fin Para
				Escribir "";
			Fin Para
		FinSi
		Escribir "---------------------";
		Escribir "¿Que desea hacer?";
		Escribir "1. Continuar";
		Escribir "2. Volver a digitar";
		Escribir "---------------------";
		leer Confirmacion;
		si (Confirmacion == 1) Entonces
			ConfirmacionMatriz = Falso;
		SiNo
			Limpiar Pantalla;
		FinSi
	FinMientras
	Limpiar Pantalla;
	Dimension Number(Filas,Columnas);
	Escribir "---------------------";
	Escribir "¿Cómo desea agregar los valores?";
	Escribir "1. Aleatorio";
	Escribir "2. Manual";
	Escribir "---------------------";
	leer Option;
	Limpiar Pantalla;
	si (Option == 2) Entonces
		si (Columnas>=Filas) Entonces
			Para i=0 Hasta Filas-1 Con Paso 1 Hacer
				Para j=0 Hasta Columnas-1 Con Paso 1 Hacer
					Escribir " Digite el valor de la casilla ",i,",",j,":";
					leer Number[i,j];
					Limpiar Pantalla;
					Resultado = Resultado + Number[i,j];
				Fin Para
				Escribir "";
			Fin Para
		FinSi
		si (Columnas<Filas) Entonces
			Para i=0 Hasta Filas-1 Con Paso 1 Hacer
				Para j=0 Hasta Columnas-1 Con Paso 1 Hacer
					Escribir " Digite el valor de la casilla ",i,",",j,":";
					leer Number[i,j];
					Limpiar Pantalla;
					Resultado = Resultado + Number[i,j];
				Fin Para
				Escribir "";
			Fin Para
		FinSi
		Escribir "Filas: ",Filas," Columnas: ",Columnas;
		Escribir "-----------------------------";
		si (Columnas>=Filas) Entonces
			Para i=0 Hasta Filas-1 Con Paso 1 Hacer
				Para j=0 Hasta Columnas-1 Con Paso 1 Hacer
					Escribir " |",Number[i,j],"| " Sin Saltar;
				Fin Para
				Escribir "";
			Fin Para
		FinSi
		si (Columnas<Filas) Entonces
			Para i=0 Hasta Filas-1 Con Paso 1 Hacer
				Para j=0 Hasta Columnas-1 Con Paso 1 Hacer
					Escribir " |",Number[i,j],"| " Sin Saltar;
				Fin Para
				Escribir "";
			Fin Para
		FinSi
		Escribir "-----------------------------";
		Escribir "Suma de los campos: ",Resultado;
	SiNo
		Escribir "Digite el valor minimo por campo";
		leer Minimo;
		Escribir "Digite el valor maximo por campo";
		leer Maximo;
		Limpiar Pantalla;
		Escribir "Filas: ",Filas," Columnas: ",Columnas;
		Escribir "Valor minimo: ",Minimo," Valor maximo: ",Maximo;
		Escribir "-----------------------------";
		si (Columnas>=Filas) Entonces
			Para i=0 Hasta Filas-1 Con Paso 1 Hacer
				Para j=0 Hasta Columnas-1 Con Paso 1 Hacer
					Number[i,j] = Aleatorio(Minimo,Maximo);
					Escribir " |",Number[i,j],"| " Sin Saltar;
					Resultado = Resultado + Number[i,j];
				Fin Para
				Escribir "";
			Fin Para
		FinSi
		si (Columnas<Filas) Entonces
			Para i=0 Hasta Filas-1 Con Paso 1 Hacer
				Para j=0 Hasta Columnas-1 Con Paso 1 Hacer
					Number[i,j] = Aleatorio(Minimo,Maximo);
					Escribir " |",Number[i,j],"| " Sin Saltar;
					Resultado = Resultado + Number[i,j];
				Fin Para
				Escribir "";
			Fin Para
		FinSi
		Escribir "-----------------------------";
		Escribir "Suma de los campos: ",Resultado;
	FinSi
	WaitMessage;
	Menu;
FinFuncion
Funcion Actividad4
	Definir Value,i,j,EnteroAsignador,Respuesta,NumeroABuscar Como Entero;
	Definir Ciclo Como Logico;
	Dimension Value(4,5);
	EnteroAsignador = 0;
	Para i=0 Hasta 3 Con Paso 1 Hacer
		Para j=0 Hasta 4 Con Paso 1 Hacer
			Value(i,j) = EnteroAsignador;
			EnteroAsignador = EnteroAsignador + 1;
			//Escribir "",Value(i,j)," | " Sin Saltar;
		Fin Para
		//Escribir "";
	Fin Para
	Limpiar Pantalla;
	Ciclo = Verdadero;
	Mientras Ciclo == Verdadero Hacer
		Para i=0 Hasta 3 Con Paso 1 Hacer
			Para j=0 Hasta 4 Con Paso 1 Hacer
				Escribir "",Value(i,j)," | " Sin Saltar;
			Fin Para
			Escribir "";
		Fin Para
		Escribir "-----------------------";
		Escribir "¿Que desea hacer?";
		Escribir "1.Encontrar posicion";
		Escribir "2.Volver";
		Escribir "-----------------------";
		leer Respuesta;
		Si (Respuesta == 1) Entonces
			Escribir "Digite la posicion del numero a hallar";
			leer NumeroABuscar;
			Para i=0 Hasta 3 Con Paso 1 Hacer
				Para j=0 Hasta 4 Con Paso 1 Hacer
					si (Value(i,j)==NumeroABuscar) Entonces
						Escribir "Esta en la posicion (",i,",",j,")";
					FinSi
				Fin Para
			Fin Para
			WaitMessage;
			Limpiar Pantalla;
		SiNo
			Ciclo = Falso;
			Limpiar Pantalla;
		FinSi
	Fin Mientras
	WaitMessage;
	Menu;
FinFuncion
Funcion Menu
	Limpiar Pantalla;
	Escribir "--------------Actividades---------------";
	Escribir "1.Arreglo de nombres";
	Escribir "2.Arreglo modificable";
	Escribir "3.Mostrar y sumar elementos de un vector";
	Escribir "4.Encontrar posicion en una matriz";
	Escribir "5.Salir";
	Escribir "----------------------------------------";
	
	Actividades;
Fin Funcion
Funcion WaitMessage
	Escribir "";
	Escribir "----------------------------------";
	Escribir "Pulse una tecla para continuar...";
	Escribir "----------------------------------";
	Esperar Tecla;
FinFuncion
Funcion Actividades
	Definir Seleccion como entero;
	Definir Comprobante como logico;
	leer Seleccion;
	Comprobante = Verdadero;
	Mientras Comprobante == Verdadero Hacer
		Segun Seleccion Hacer
			1:
				Limpiar Pantalla;
				Actividad1;
				Comprobante = Falso;
			2:
				Limpiar Pantalla;
				Actividad2;
				Comprobante = Falso;
			3:
				Limpiar Pantalla;
				Actividad3;
				Comprobante = Falso;
			4:
				Limpiar Pantalla;
				Actividad4;
				Comprobante = Falso;
			5:
				Limpiar Pantalla;
				Comprobante = Falso;
			De Otro Modo:
				Escribir "Digite una opcion valida";
		Fin Segun
	FinMientras
FinFuncion
Algoritmo ArreglosYMatrices
	Borrar Pantalla;
	Menu;
FinAlgoritmo
