# coding=utf-8
"""
    El programa que construyan debe aplicar 3 conceptos vistos en las ultimas sesiones.
        1. Manejo de listas, diccionarios o tuplas.
        2. Bloques de codigo de validacion (if, elif, else).
        3. Bucles.
    Teniendo en cuenta esto, el programa debe tener declaradas series y peliculas, con los siguientes atributos:
    id, nombre, descripciÃ³n, genero, duraciÃ³n, fecha de lanzamiento, si es serie o pelicula, puntuaciÃ³n (de 1 a 5).
    Una vez tengan suficientes series y peliculas declaradas, el programa debe:
        1. Imprimir las series lazadas en el 2021 con puntuacion mayor o igual a 4.5
        2. Imprimir las peliculas que duren menos de 2 horas, si dentro de esas peliculas existe una del genero Triller, imprimir
            su nombre, y puntuaciÃ³n.
        3. Modificar la puntiaciÃ³n de las series prÃ³ximas a lanzamiento (Superen la fecha actual), igualando dicha puntuaciÃ³n a 0.
"""
# Esta es la librerÃ­a de la fecha
from datetime import date

print("--Datos ficticios--")

metrajes = [{
    "Fast & Furious" : ("001","Fast & Furious","Carreras de autos","Acion","1:23:04","2004","Pelicula","4.2"),
    "Simpsons" : ("002","Simpsons","Comedia caricaturestica de una familia muy divertida","Comedio","+24","2000","Serie","5.0"),
    "Futurama" : 
}]

# tip para comparar fechas
miDate = date(2019, 4, 13)
today = date.today()
print ("Today's date:", today)
print ("miDate date:", miDate)
if today > miDate:
    print ("La pelicula ya fue estrenada")
elif today == miDate:
    print ("La pelicula se estrena hoy")
else:
    print ("La pelicula no se ha estrenado")