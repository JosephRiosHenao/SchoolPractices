Algoritmo ArreglosYMatricesAct
	Menu;
FinAlgoritmo
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
		Escribir Nombres[i],", " Sin Saltar;
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
		Escribir Nombres[i],", " Sin Saltar;
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
			Resultado = MultiploN * i;
			Arreglo(i) = Resultado;
			Escribir "[",Arreglo(i),"]";
		Fin Para
		Escribir "-----------------------";
		Escribir "¿Que desea hacer?";
		Escribir "1.Cambiar multiplo";
		Escribir "2.Volver";
		Escribir "-----------------------";
		leer Option;
		si Option == 2 Entonces
			Ciclo = Falso;
			Limpiar Pantalla;
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
		Escribir "Nombre: ",Nombres(i);
		Escribir "Longitud: ",Lent(i);
		Escribir "------------------";
	Fin Para
	WaitMessage;
	Menu;
FinFuncion
Funcion Actividad7
	Definir Arreglo1,Arreglo2,Arreglo3,i,Tamano,Option,Minimo,Maximo Como Entero;
	Definir Ciclo Como Logico;
	Limpiar Pantalla;
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
			Escribir "Digite el valor minimo";
			leer Minimo;
			Escribir "Digite el valor maximo";
			leer Maximo;
			Para i=0 Hasta Tamano-1 Con Paso 1 Hacer
				Arreglo1(i) = Aleatorio(Minimo,Maximo);
				Arreglo2(i) = Aleatorio(Minimo,Maximo);
				Arreglo3(i) = Arreglo1(i) + Arreglo2(i);			
			Fin Para
		FinSi
		Limpiar Pantalla;
		Para i=0 Hasta Tamano-1 Con Paso 1 Hacer
			Escribir "Arreglo1[",i,"]: ",Arreglo1(i)," + Arreglo2[",i,"]: ",Arreglo2(i)," = " Arreglo3(i);
		Fin Para
		Escribir "-----------------------";
		Escribir "¿Que desea hacer?";
		Escribir "1.Cambiar valores";
		Escribir "2.Volver";
		Escribir "-----------------------";
		leer Option;
		si Option == 2 Entonces
			Ciclo = Falso;
			Limpiar Pantalla;
		FinSi
	FinMientras
	WaitMessage;
	Menu;
FinFuncion
Funcion Actividad8
	Definir ConfirmacionMatriz,ConfirmacionArreglo,TerminarCiclo Como Logico;
	Definir i,j,Filas,Columnas,Confirmacion,Option,NumeroAsignador,Unidimensional,Bidimensional,Minimo,Maximo,NumeroABuscar,Contador,Resultado Como Entero;
	Escribir "-----------------------";
	Escribir "¿Que arreglo utilizara?";
	Escribir "1.Unidimensional";
	Escribir "2.Bidimensional";
	Escribir "-----------------------";
	leer Option;
	Limpiar Pantalla;
	Si Option == 1 Entonces
		ConfirmacionArreglo = Verdadero;
		Mientras ConfirmacionArreglo == Verdadero Hacer
			Limpiar Pantalla;
			Escribir "Digite el tamaño del arreglo";
			leer Filas;
			Limpiar Pantalla;
			Para i = 0 Hasta Filas-1 Con Paso 1 Hacer
				Escribir "[",i,"]" Sin Saltar;
			Fin Para
			Escribir "";
			Escribir "----------------------";
			Escribir "¿Que desea hacer?";
			Escribir "1.Cambiar tamaño";
			Escribir "2.Continuar";
			Escribir "----------------------";
			leer Option;
			si Option == 2 Entonces
				ConfirmacionArreglo = Falso;
			FinSi
		FinMientras
		Dimension Unidimensional(Filas);
		TerminarCiclo = Verdadero;
		Para i=0 Hasta Filas-1 Con Paso 1 Hacer
			Unidimensional(i) = 0;
		Fin Para
		Mientras TerminarCiclo == Verdadero Hacer
			Para i=0 Hasta Filas-1 Con Paso 1 Hacer
				Escribir "[",Unidimensional(i),"]" Sin Saltar;
			Fin Para
			Escribir "";
			Escribir "----------------------";
			Escribir "¿Que desea hacer?";
			Escribir "1.Asignar valores";
			Escribir "2.Encontrar posicion";
			Escribir "3.Salir";
			Escribir "----------------------";
			leer Option;
			Segun Option hacer
				1:
					Escribir "Digite el valor minimo";
					leer Minimo;
					Escribir "Digite el valor maximo";
					leer Maximo;
					Limpiar Pantalla;
					Para i=0 Hasta Filas-1 Con Paso 1 Hacer
						Unidimensional(i) = Aleatorio(Minimo, Maximo);
					Fin Para
					Limpiar Pantalla;
				2:
					Contador = 1;
					Escribir "Digite el valor que desea encontrar";
					leer NumeroABuscar;
					Limpiar Pantalla;
					Para i=0 Hasta Filas-1 Con Paso 1 Hacer
						SI Unidimensional(i)==NumeroABuscar Entonces
							Escribir "Existe ",Contador," en la posicion ",i," con numero ",NumeroABuscar;
							Contador = Contador + 1; 
						FinSi
					Fin Para
					Si Contador == 1 Entonces
						Escribir "El numero digitado no se encuentra en el arreglo";
					FinSi
				De Otro Modo:
					TerminarCiclo = Falso;
			FinSegun
		FinMientras
	SiNo
		ConfirmacionMatriz = verdadero;
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
						Escribir " [",i,",",j,"]" Sin Saltar;
					Fin Para
					Escribir "";
				Fin Para
			FinSi
			si (Columnas<Filas) Entonces
				Para i=0 Hasta Filas-1 Con Paso 1 Hacer
					Para j=0 Hasta Columnas-1 Con Paso 1 Hacer
						Escribir " [",i,",",j,"]" Sin Saltar;
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
			FinSi
			Limpiar Pantalla;			
		FinMientras
		Limpiar Pantalla;
		Dimension Bidimensional(Filas,Columnas);
		TerminarCiclo = Verdadero;
		si (Columnas>=Filas) Entonces
			Para i=0 Hasta Filas-1 Con Paso 1 Hacer
				Para j=0 Hasta Columnas-1 Con Paso 1 Hacer
					Bidimensional(i,j) = 0;
				Fin Para
			Fin Para
		FinSi
		si (Columnas<Filas) Entonces
			Para i=0 Hasta Filas-1 Con Paso 1 Hacer
				Para j=0 Hasta Columnas-1 Con Paso 1 Hacer
					Bidimensional(i,j) = 0;
				Fin Para
			Fin Para
		FinSi
		Mientras TerminarCiclo == Verdadero Hacer
			si (Columnas>=Filas) Entonces
				Para i=0 Hasta Filas-1 Con Paso 1 Hacer
					Para j=0 Hasta Columnas-1 Con Paso 1 Hacer
						Escribir "[",Bidimensional(i,j),"]" Sin Saltar;
					Fin Para
					Escribir "";
				Fin Para
			FinSi
			si (Columnas<Filas) Entonces
				Para i=0 Hasta Filas-1 Con Paso 1 Hacer
					Para j=0 Hasta Columnas-1 Con Paso 1 Hacer
						Escribir "[",Bidimensional(i,j),"]" Sin Saltar;
					Fin Para
					Escribir "";
				Fin Para
			FinSi
			Escribir "----------------------";
			Escribir "¿Que desea hacer?";
			Escribir "1.Asignar valores";
			Escribir "2.Encontrar posicion";
			Escribir "3.Salir";
			Escribir "----------------------";
			leer Option;
			Segun Option hacer
				1:
					Escribir "Digite el valor minimo";
					leer Minimo;
					Escribir "Digite el valor maximo";
					leer Maximo;
					si (Columnas>=Filas) Entonces
						Para i=0 Hasta Filas-1 Con Paso 1 Hacer
							Para j=0 Hasta Columnas-1 Con Paso 1 Hacer
								Bidimensional(i,j) = Aleatorio(Minimo,Maximo);
							Fin Para
						Fin Para
					FinSi
					si (Columnas<Filas) Entonces
						Para i=0 Hasta Filas-1 Con Paso 1 Hacer
							Para j=0 Hasta Columnas-1 Con Paso 1 Hacer
								Bidimensional(i,j) = Aleatorio(Minimo,Maximo);
							Fin Para
						Fin Para
					FinSi
					Limpiar Pantalla;
				2:
					Limpiar Pantalla;
					Contador = 1;
					Escribir "Digite el valor que desea encontrar";
					leer NumeroABuscar;
					Para i=0 Hasta Filas-1 Con Paso 1 Hacer
						Para j=0 Hasta Columnas-1 Con Paso 1 Hacer
							Si BIdimensional(i,j)==NumeroABuscar Entonces
								Escribir "Existe ",Contador," en la posicion [",i,",",j,"] con numero ",NumeroABuscar;
								Contador = Contador + 1; 
							FinSi
						Fin Para
					Fin Para
					Si Contador == 1 Entonces
						Escribir "El numero digitado no se encuentra en el arreglo";
					FinSi
				De Otro Modo:
					TerminarCiclo = Falso;
			FinSegun
		FinMientras
	FinSi
	WaitMessage;
	Menu;
FinFuncion
Funcion Actividad9
	Definir CantEstudiantes,CantBJ,CantB,CantA,CantS,i,long Como Entero;
	CantA = 0;
	CantB = 0;
	CantS = 0;
	CantBJ = 0;
	Escribir "Digite la cantidad de estudiantes";
	leer long;
	Dimension CantEstudiantes(long);
	Para i=0 Hasta long-1 Con Paso 1 Hacer
		CantEstudiantes(i) = Aleatorio(0,20);
		si CantEstudiantes(i)>=0 y CantEstudiantes(i)<=5 Entonces
			CantBJ = CantBJ + 1;
		FinSi
		si CantEstudiantes(i)>=6 y CantEstudiantes(i)<=10 Entonces
			CantB = CantB + 1;
		FinSi
		si CantEstudiantes(i)>=11 y CantEstudiantes(i)<=15 Entonces
			CantA = CantA + 1;
		FinSi
		si CantEstudiantes(i)>=16 y CantEstudiantes(i)<=20 Entonces
			CantS = CantS + 1;
		FinSi
	Fin Para
	Limpiar Pantalla;
	Escribir "Cantidad de estudiantes = ",long;
	Escribir "Deficientes = ",CantBJ;
	Escribir "Regulares = ",CantB;
	Escribir "Buenos = ",CantA;
	Escribir "Excelentes = ",CantS;
	Escribir "--------------------------------";
	Escribir "";
	WaitMessage;
	Menu;
FinFuncion
Funcion Actividad10
	Definir i,Filas,Datos,Minimo,Maximo,Punter1,Punter2,NumeroIntermedio,Option,lon,l,n,temp Como Entero;
	Definir ConfirmacionArreglo,TerminarCiclo como logico;
	ConfirmacionArreglo = Verdadero;
	Mientras ConfirmacionArreglo == Verdadero Hacer
		Limpiar Pantalla;
		Escribir "Digite el tamaño del arreglo";
		leer Filas;
		Limpiar Pantalla;
		Para i = 0 Hasta Filas-1 Con Paso 1 Hacer
			Escribir "[",i,"]" Sin Saltar;
		Fin Para
		Escribir "";
		Escribir "----------------------";
		Escribir "¿Que desea hacer?";
		Escribir "1.Cambiar tamaño";
		Escribir "2.Continuar";
		Escribir "----------------------";
		leer Option;
		si Option == 2 Entonces
			ConfirmacionArreglo = Falso;
		FinSi
		Limpiar Pantalla;
	FinMientras
	Dimension Datos(Filas);
	TerminarCiclo = Verdadero;
	Para i=0 Hasta Filas-1 Con Paso 1 Hacer
		Datos(i) = 0;
	Fin Para
	Mientras TerminarCiclo == Verdadero Hacer
		Para i=0 Hasta Filas-1 Con Paso 1 Hacer
			Escribir "[",Datos(i),"]" Sin Saltar;
		Fin Para
		Escribir "";
		Escribir "----------------------";
		Escribir "¿Que desea hacer?";
		Escribir "1.Asignar valores";
		Escribir "2.Ordenarlos";
		Escribir "3.Salir";
		Escribir "----------------------";
		leer Option;
		Segun Option hacer
			1:
				Escribir "Digite el valor minimo";
				leer Minimo;
				Escribir "Digite el valor maximo";
				leer Maximo;
				Limpiar Pantalla;
				Para i=0 Hasta Filas-1 Con Paso 1 Hacer
					Datos(i) = Aleatorio(Minimo, Maximo);
				Fin Para
				Limpiar Pantalla;
			2:
				l = Filas-1;
				Hacer
					n=0;
					Para i=1 Hasta l Con Paso 1 Hacer
						Si Datos[i-1]>Datos[i]
							temp=Datos[i-1];
							Datos[i-1]=Datos[i];
							Datos[i]=temp;
							n=i;
						FinSi
					FinPara
					l=n;
				Hasta Que n=0;
				Limpiar Pantalla;
			De Otro Modo:
				TerminarCiclo = Falso;
		FinSegun
	FinMientras
	Limpiar Pantalla;
	WaitMessage;
	Menu;
FinFuncion
Funcion Actividad11
	Definir i,j,Filas,Datos,Minimo,Maximo,Punter1,Punter2,NumeroIntermedio,Option,lon,l,n,temp Como Entero;
	Definir ConfirmacionArreglo,TerminarCiclo como logico;
	ConfirmacionArreglo = Verdadero;
	Mientras ConfirmacionArreglo == Verdadero Hacer
		Limpiar Pantalla;
		Escribir "Digite el tamaño del arreglo";
		leer Filas;
		Limpiar Pantalla;
		Para i = 0 Hasta Filas-1 Con Paso 1 Hacer
			Escribir "[",i,"]" Sin Saltar;
		Fin Para
		Escribir "";
		Escribir "----------------------";
		Escribir "¿Que desea hacer?";
		Escribir "1.Cambiar tamaño";
		Escribir "2.Continuar";
		Escribir "----------------------";
		leer Option;
		si Option == 2 Entonces
			ConfirmacionArreglo = Falso;
		FinSi
		Limpiar Pantalla;
	FinMientras
	Dimension Datos(Filas);
	TerminarCiclo = Verdadero;
	Para i=0 Hasta Filas-1 Con Paso 1 Hacer
		Datos(i) = 0;
	Fin Para
	Mientras TerminarCiclo == Verdadero Hacer
		Para i=0 Hasta Filas-1 Con Paso 1 Hacer
			Escribir "[",Datos(i),"]" Sin Saltar;
		Fin Para
		Escribir "";
		Escribir "----------------------";
		Escribir "¿Que desea hacer?";
		Escribir "1.Asignar valores";
		Escribir "2.Ordenarlos";
		Escribir "3.Salir";
		Escribir "----------------------";
		leer Option;
		Segun Option hacer
			1:
				Escribir "Digite el valor minimo";
				leer Minimo;
				Escribir "Digite el valor maximo";
				leer Maximo;
				Limpiar Pantalla;
				Para i=0 Hasta Filas-1 Con Paso 1 Hacer
					Datos(i) = Aleatorio(Minimo, Maximo);
				Fin Para
				Limpiar Pantalla;
			2:
				i  = 0;
				Mientras i < Filas - 1 Hacer
					n = i;
					j = i;
					Mientras j < Filas Hacer
						Si Datos[j] < Datos[n] Entonces
							n = j;
						FinSi
						j = j + 1;
					Fin Mientras
					Si i <> n Entonces
						temp = Datos[i];
						Datos[i] = Datos[n];
						Datos[n] = temp;
					FinSi
					i = i + 1;
				Fin Mientras
				Limpiar Pantalla;
			De Otro Modo:
				TerminarCiclo = Falso;
		FinSegun
	FinMientras
	Limpiar Pantalla;
	WaitMessage;
	Menu;
FinFuncion
Funcion Actividad12
	Definir COLUMNAS, num, FILAS, i, j Como Entero;
	escribir "Introduce las filas del array";
	leer FILAS;
	escribir "Introduce las columnas del array";
	leer COLUMNAS;
	Dimension num[FILAS, COLUMNAS];
	Para i<-0 Hasta FILAS-1 Con Paso 1 Hacer
		Para j<-0 Hasta COLUMNAS-1 Con Paso 1 Hacer
			num[i,j]<-azar(10);
		Fin Para
	Fin Para
	Para i<-0 Hasta FILAS-1 Con Paso 1 Hacer
		Para j<-0 Hasta COLUMNAS-1 Con Paso 1 Hacer
			escribir num[i,j]," " Sin Saltar;
		Fin Para
		escribir "";
	Fin Para
	WaitMessage;
	Menu;
FinFuncion
Funcion Actividad13
	Definir i,j,Datos,Cantidad Como Entero;
	Escribir "Digite la cantidad de sumas";
	Leer Cantidad;
	Dimension Datos(Cantidad,3);
	Para i = 0 Hasta Cantidad - 1 Con Paso 1 Hacer
		Para j = 0 Hasta 1 Con Paso 1 Hacer
			Escribir "Digite el ",j + 1,"° numero de la ",i + 1,"° suma";
			leer Datos(i,j);
		Fin Para
	Fin Para
	Limpiar Pantalla;
	Para i = 0 Hasta Cantidad - 1 Con Paso 1 Hacer
		Datos(i,2) = Datos(i,0) + Datos(i,1);
		Escribir " ",Datos(i,0)," + ",Datos(i,1)," = ",Datos(i,2);
		Escribir "--------------";
	Fin Para
	WaitMessage;
	Menu;
FinFuncion
Funcion Actividad14
	Definir Multi, unid,d Como Entero;
	Definir X, yy, SS Como Entero;
	Definir i,l,  j,k,r Como Entero;
	Escribir "inserte las dimensiones de la matriz";
	Leer i,l;
	Dimension Multi(i,l);
	Dimension unid(i*l);
	Para k = 0 Hasta i-1 Con Paso 1 Hacer
		Para j = 0 Hasta l-1 Con Paso 1 Hacer
			Multi(k,j) = azar(i*l);
		FinPara
	FinPara
	Escribir "";
	Limpiar Pantalla;
	Para k = 0 Hasta i-1 Con Paso 1 Hacer
		Para j = 0 Hasta l-1 Con Paso 1 Hacer
			Escribir "",Multi(k,j),"|" Sin Saltar;
		FinPara
		Escribir "";
	FinPara
	Escribir "";
	Escribir "En array es:";
	Para k = 0 Hasta i-1 Con Paso 1 Hacer
		Para j = 0 Hasta l-1 Con Paso 1 Hacer
			unid(k) = Multi(k,j);
			unid(k) = Multi(k,j);
			Escribir "",unid(k), " " Sin Saltar;
		FinPara
	FinPara
	Escribir "";
	WaitMessage;
	Menu;
FinFuncion
Funcion Actividad15
	Definir Eleccion,Matriz,i,j Como Entero;
	Definir Ciclo2 Como Logico;
	Dimension Matriz(5,12);
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Para j=0 Hasta 11 Con Paso 1 Hacer
			Matriz[i,j] = Aleatorio(500,100000);
		Fin Para
	Fin Para
	Ciclo2 = Verdadero;
	Mientras Ciclo2 == Verdadero Hacer
		Limpiar Pantalla;
		Escribir "--------------Actividades----------------";
		Escribir "1.Mostrar ventas mensuales";
		Escribir "2.Mostrar monto anual";
		Escribir "3.Mostrar mayor venta";
		Escribir "4.Salir";
		Escribir "-----------------------------------------";
		leer Eleccion;
		Limpiar Pantalla;
		Segun Eleccion
			1:
				MostrarVentasMensuales(Matriz);
				Ciclo2 = Verdadero;
			2:
				MontoAnual(Matriz);
				Ciclo2 = Verdadero;
			3:
				MostrarMayorVenta(Matriz);	
				Ciclo2 = Verdadero;
			4:
				Ciclo2 = falso;
			De Otro Modo:
				Escribir "Digite un numero valido";
		FinSegun
	FinMientras
	WaitMessage;
	Menu;
FinFuncion
Funcion Actividad16
	Definir filas, COLUMNAS, LUNES, MARTES, MIERCOLES,JUEVES, VIERNES, SABADO, DOMINGO, limite,I, J, media, diaMenorTemperaturaSemana, sumaTemperatura, menorTemperaturaSemana, diaMayorTemperaturaSemana, temperaturas, mayorTemperaturaSemana,  mayorTemperaturaGeneral, diaMayorTemperaturaGeneral, diaSemanaMayorTemperaturaGeneral como real;
	definir dias Como Caracter;
	filas <- 5;
    COLUMNAS <-7;
    LUNES <- 0;
    MARTES <- 1;
    MIERCOLES <- 2;
    JUEVES <- 3;                   
    VIERNES <- 4;
    SABADO <- 5;
    DOMINGO <- 6;
    Dimension dias(COLUMNAS);
    dias(0)<-"Lunes";
    dias(1)<-"Martes";
    dias(2)<-"Miercoles";
    dias(3)<-"Jueves";
    dias(4)<-"Viernes";
    dias(5)<-"Sabado";
    dias(6)<-"Domingo";
	Dimension temperaturas[5,7];
	Escribir  "LU MA MI JU VI SA DO";
    limite <- 0;
    Para i<-0 Hasta filas-1 Con Paso 1 Hacer
        Si i=filas-1 Entonces
            limite <- MIERCOLES;
        Sino
            limite <- DOMINGO;
        Fin Si
        Para j<-0 Hasta limite Con Paso 1 Hacer
            temperaturas(i,j) <- Aleatorio(7,38);
            Si temperaturas(i,j)<10 Entonces
                Escribir " " ,temperaturas(i,j) " " Sin Saltar;
            Sino
                Escribir temperaturas(i,j) " " Sin Saltar;
            Fin Si
        Fin Para
        Escribir "";
    Fin Para
    mayorTemperaturaGeneral <- temperaturas(0,0);
    diaMayorTemperaturaGeneral <- 1;
    diaSemanaMayorTemperaturaGeneral <- 0;
    Para i<-0 Hasta filas-1 Con Paso 1 Hacer
        mayorTemperaturaSemana <- temperaturas(i,0);
        diaMayorTemperaturaSemana <- LUNES;
        menorTemperaturaSemana <- temperaturas(i,0);
        diaMenorTemperaturaSemana <- LUNES;
        sumaTemperatura <- 0;
        Si i=filas-1 Entonces
            limite <- MIERCOLES;
        Sino
            limite <- DOMINGO;
        Fin Si
        Para j<-0 Hasta limite Con Paso 1 Hacer
            Si temperaturas(i,j)>mayorTemperaturaSemana Entonces
                mayorTemperaturaSemana <- temperaturas(i,j);
                diaMayorTemperaturaSemana <- j;
            Fin Si
            Si temperaturas(i,j)<menorTemperaturaSemana Entonces
                menorTemperaturaSemana <- temperaturas(i,j);
                diaMenorTemperaturaSemana <- j;
            Fin Si
            Si temperaturas(i,j)>mayorTemperaturaGeneral Entonces
                mayorTemperaturaGeneral <- temperaturas(i,j);
                diaSemanaMayorTemperaturaGeneral <- j;
                diaMayorTemperaturaGeneral <- (i * COLUMNAS) + j+1 ; 
            Fin Si
            sumaTemperatura<-sumaTemperatura + temperaturas(i,j);
        Fin Para
        Escribir "En la semana ",(i+1), " la mayor temperatura es de ",mayorTemperaturaSemana," en el dia ", dias(diaMayorTemperaturaSemana);
        Escribir "En la semana ",(i+1), " la menor temperatura es de ",menorTemperaturaSemana," en el dia ", dias(diaMenorTemperaturaSemana);
        escribir "";
        media<-sumaTemperatura/COLUMNAS;
        Escribir "La media de la semana ",(i+1), "es de ",media;
        Escribir "";
	FinPara
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
	Escribir "5.Mostrar numeros primos en arreglo";
	Escribir "6.Nombres y su longitud";
	Escribir "7.Suma de 2 arreglos en un tercero";
	Escribir "8.Asig/Search en arreglos";
	Escribir "9.Calcular notas de estudiantes";
	Escribir "10.Metodo de ordenamiento burbuja";
	Escribir "11.Metodo de ordenamiento por seleccion";
	Escribir "12.Crear matriz personalizada";
	Escribir "13.Suma de una matriz en la 3° columna";
	Escribir "14.Arreglo bidimensional a unidimensional";
	Escribir "15.Presupuestos de empresas";
	Escribir "16.Dias de la semana y registro de C°";
	Escribir "17.Salir";
	Escribir "----------------------------------------";
	Actividades;
Fin Funcion
Funcion MostrarVentasMensuales(Matriz)
	Definir i,j Como Entero;
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Escribir "Empresa #",i+1;
		Para j=0 Hasta 11 Con Paso 1 Hacer
			Escribir "Mes ",j+1," Ingresos: $ ",Matriz[i,j] Sin Saltar;
			Escribir "";
		Fin Para
		Escribir "";
	Fin Para
	WaitMessage;
FinFuncion
Funcion MontoAnual(Matriz)
	Definir i,j,IngresosAnuales Como Entero;
	IngresosAnuales = 0;
	Para i=0 Hasta 4 Con Paso 1 Hacer
		IngresosAnuales = 0;		
		Escribir "--------------------------------------";
		Escribir "Empresa #",i+1;
		Para j=0 Hasta 11 Con Paso 1 Hacer
			IngresosAnuales = IngresosAnuales + Matriz[i,j];
		Fin Para
		Escribir "Ingresos anuales: $ ",IngresosAnuales Sin Saltar;
		Escribir "";
	Fin Para
	WaitMessage;
FinFuncion
Funcion MostrarMayorVenta(Matriz)
	Definir i,j,PosibleMayor,MayorMes Como Entero;
	PosibleMayor = 0;
	MayorMes = 0;
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Escribir "--------------------------------------";
		Escribir "Empresa #",i+1;
		Para j=0 Hasta 11 Con Paso 1 Hacer
			si Matriz[i,j] > PosibleMayor Entonces
				MayorMes = i+1;
				PosibleMayor = Matriz[i,j];
			FinSi
		Fin Para
		Escribir "Mes ",MayorMes,"° con mayor venta";
		Escribir "Ingresos: ",PosibleMayor; 
		Escribir "";
	Fin Para
	WaitMessage;
FinFuncion
Funcion fun <- rellenaArray (a, b)
	definir fun, fil, col, i, j, num, arr Como Entero;
	fil<-a;
	col<-b;
	Dimension arr[fil, col];
	Escribir "¿hasta cuantos numeros al azar?";
	leer num;
	Para i <- 0 Hasta fil-1 Con Paso 1 Hacer
		Para j <- 0 Hasta col-1 Con Paso 1 Hacer
			arr[i, j] <- azar(num);
		Fin Para
	Fin Para
	Para i <- 0 Hasta fil-1 Con Paso 1 Hacer
		Para j <- 0 Hasta col-1 Con Paso 1 Hacer
			Escribir " ", arr[i, j], "" Sin Saltar;
		Fin Para
		Escribir " ";
	Fin Para
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
				Actividad10;
				Comprobante = Falso;
			11:
				Limpiar Pantalla;
				Actividad11;
				Comprobante = Falso;
			12:
				Limpiar Pantalla;
				Actividad12;
				Comprobante = Falso;
			13:
				Limpiar Pantalla;
				Actividad13;
				Comprobante = Falso;
			14:
				Limpiar Pantalla;
				Actividad14;
				Comprobante = Falso;
			15:
				Limpiar Pantalla;
				Actividad15;
				Comprobante = Falso;
			16:
				Limpiar Pantalla;
				Actividad16;
				Comprobante = Falso;
			17:
				Limpiar Pantalla;
				Comprobante = Falso;
			De Otro Modo:
				Escribir "Digite una opcion valida";
		Fin Segun
	FinMientras
FinFuncion