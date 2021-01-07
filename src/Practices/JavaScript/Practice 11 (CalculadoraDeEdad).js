var Calendario = document.getElementById("Fecha");
var AñoActual = 2021;
var Boton = document.getElementById("Boton");
var Resultado = document.getElementById("Resultado");
Boton.addEventListener("click",Calcular);

function Calcular(){
    var FechaDeNacimiento = Calendario.valueAsDate.getFullYear();
    var Edad = AñoActual-FechaDeNacimiento;
    document.write(Edad);
}   