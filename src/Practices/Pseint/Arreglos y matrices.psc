//1.Crear un arreglo llamado nombres y que almacene los siguientes nombres de personas: Juan, Pedro, Maria, Humberto y Oscar
//2.Llenar un arreglo con nombres de personams. Preguntar al usuario cuantos datos desea ingresar
//3.Para sumar los elementos de un vector debemos usar un acumulador inicializado en cero
//4.Crear una matriz de 4x5 y cargarlos con los primeros numeros naturales; al ingresar un numero cualquiera debera buscar dicho numero en la matriz e indicar en que fila y columna se encuentra el numero dado
//5. Crea un array o arreglo unidimensional donde tu le indiques el tamaño por teclado y crear una función que rellene el array o arreglo con los múltiplos de un numero pedido por teclado. Por ejemplo, si defino un array de tamaño 5 y eligo un 3 en la función, el array contendrá 3, 6, 9, 12, 15. Muestralos por pantalla usando otra función distinta.
//6. Crea dos arrays o arreglos unidimensionales que tengan el mismo tamaño (lo pedirá por teclado), en uno de ellos almacenaras nombres de personas como cadenas, en el otro array o arreglo ira almacenando la longitud de los nombres, para ello puedes usar la función LONGITUD(cadena) que viene en PseInt. Muestra por pantalla el nombre y la longitud que tiene. Puedes usar funciones si lo deseas.
//7. Pedir valores numericos en dos arrays distintos y almacenar el resultado de los valores de cada posición (posición 0 del arreglo 1 + posición 0 del arreglo 2) y mostrar el contenido de los 3 arreglos de esta forma. valor pos 0 arreglo 1 + valor pos 0 arreglo 2 = valor pos 0 arreglo 3 valor pos 1 arreglo 1 + valor pos 1 arreglo 2 = valor pos 1 arreglo 3 …
//8. Buscar un elemento dentro de un arreglo que nosotros le pedimos por teclado. Indicar las posición donde se encuentra. Si hay más de uno, indicar igualmente la posición.
//9. Suponga un array que contiene N notas de 0 a 20 generados aleatoriamente y mostradas en pantalla, de acuerdo a la nota contenida, indique cuántos estudiantes son:
//				
//		Deficientes 0-5
//		Regulares 6-10
//		Buenos 11-15
//		Excelentes 16-20
//
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
		Fin Para
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
Funcion Actividad5
	Definir Tamano,Arreglo,i,MultiploN,Resultado,Option Como Entero;
	Definir Ciclo Como Logico;
	Escribir "Digite el tamaño del vector";
	leer Tamano;
	Dimension Arreglo(Tamano);
	Ciclo = Verdadero;
	Mientras Ciclo == Verdadero Hacer
		Resultado = Tamano;
		Escribir "Digite el Multiplo entero que desea";
		leer MultiploN;
		Limpiar Pantalla;
		Para i=0 Hasta Tamano-1 Con Paso 1 Hacer
			Arreglo(i) = Resultado;
			Resultado = Resultado + MultiploN;
			Escribir "[",Arreglo(i),"]";
		Fin Para
		Escribir "-----------------------";
		Escribir "¿Que desea hacer?";
		Escribir "1.Cambiar multiplo";
		Escribir "2.Volver";
		Escribir "-----------------------";
		leer Option;
		si Option == 2 Entonces
			Ciclo = Falso
		FinSi
	FinMientras
	WaitMessage;
	Menu;
FinFuncion
Funcion Actividad6
	Definir Nombres Como Caracter;
	Definir Option,i,Tamano,Lent Como Entero;
	Escribir "Digite numero de nombres";
	leer Tamano;
	Dimension Nombres(Tamano);
	Dimension Lent(Tamano);
	Limpiar Pantalla;
	Para i=0 Hasta Tamano-1 Con Paso 1 Hacer
		Escribir "Digite el ",i+1,"° nombre";
		leer Nombres(i);
		Lent(i) = Longitud(Nombres(i));
	Fin Para
	Limpiar Pantalla;
	Para i=0 Hasta Tamano-1 Con Paso 1 Hacer
		Escribir "Nombre: ",Nombre(i);
		Escribir "Longitud: ",Lent(i);
		Escribir "------------------";
	Fin Para
	WaitMessage;
	Menu;
FinFuncion
Funcion Actividad7
	Definir Arreglo1,Arreglor2,Arreglo3,i,Tamano,Option,Minimo,Maximo Como Entero;
	Definir Ciclo Como Logico;
	Escribir "Digite el tamaño del arreglo";
	leer Tamano;
	Dimension Arreglo1(Tamano);
	Dimension Arreglo2(Tamano);
	Dimension Arreglo3(Tamano);
	Ciclo = Verdadero;
	Mientras Ciclo == Verdadero Hacer
		Limpiar Pantalla;
		Escribir "---------------------";
		Escribir "¿Cómo desea agregar los valores?";
		Escribir "1. Aleatorio";
		Escribir "2. Manual";
		Escribir "---------------------";
		leer Option;
		Limpiar Pantalla;
		si Option == 2 Entonces
			Para i=0 Hasta Tamano-1 Con Paso 1 Hacer
				Limpiar Pantalla;
				Escribir "Digite el ",i+1,"° numero del arreglo 1";
				Leer Arreglo1(i);
				Escribir "Digite el ",i+1,"° numero del arreglo 2";
				Leer Arreglo2(i);
				Arreglo3(i) = Arreglo1(i) + Arreglo2(i);
			Fin Para
		SiNo
			Para i=0 Hasta Tamano-1 Con Paso 1 Hacer
				Escribir "Digite el valor minimo";
				leer Minimo;
				Escribir "Digite el valor maximo";
				leer Maximo;
				Arreglo1(i)  = Aleatorio(Minimo,Maximo);
				Arreglo2(i)  = Aleatorio(Minimo,Maximo);
				Arreglo3(i) = Arreglo1(i) + Arreglo2(i);			
			Fin Para
		FinSi
		Limpiar Pantalla;
		Para i=0 Hasta Tamano-1 Con Paso 1 Hacer
			Escribir "Arreglo1[",i,"]: ",Arreglo1(i)," + Arreglo2[",i,"]: ",Arreglo2(i)," = " Arreglo3(i);
		Fin Para
	FinMientras
	WaitMessage;
	Menu;
FinFuncion
Funcion Actividad8
	
FinFuncion
Funcion Actividad9
	
FinFuncion
Funcion Menu
	Limpiar Pantalla;
	Escribir "--------------Actividades---------------";
	Escribir "1.Arreglo de nombres";
	Escribir "2.Arreglo modificable";
	Escribir "3.Mostrar y sumar elementos de un vector";
	Escribir "4.Encontrar posicion en una matriz";
	Escribir "5.Mostrar numeros primos en arreglo"
	Escribir "6."
	Escribir "7."
	Escribir "8."
	Escribir "9."
	Escribir "10.Salir";
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
				Actividad5;
				Comprobante = Falso;
			6:
				Limpiar Pantalla;
				Actividad6;
				Comprobante = Falso;
			7:
				Limpiar Pantalla;
				Actividad7;
				Comprobante = Falso;
			8:
				Limpiar Pantalla;
				Actividad8;
				Comprobante = Falso;
			9:
				Limpiar Pantalla;
				Actividad9;
				Comprobante = Falso;
			10:
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
