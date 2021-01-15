Canvas = document.getElementById("Lienzo");
Pincel = Canvas.getContext("2d");

var teclado = {
    W: 87,
    A: 65,
    S: 83,
    D: 68
}
var PASOS = 5;
var Posicion = 
{
    Inicial: {X:250,Y:250},
    Final: {X:250,Y:250}
}

document.addEventListener("keydown",dibujarTeclado)

function dibujarTeclado(Teclas) {
    switch (Teclas.keyCode) {
        case teclado.W:
            console.log("Arriba!");
        break;

        case teclado.S:
            console.log("Abajo!");
        break;

        case teclado.A:
            console.log("Izquierda!");
        break;

        case teclado.D:
            console.log("Derecha!");
        break;
    }
}

function DibujarLinea(Color,X1,Y1,X2,Y2){
    Pincel.beginPath();
    Pincel.strokeStyle = color;
    Pincel.moveTo(X1,Y1);
    Pincel.lineTo(X2,Y2);
    Pincel.stroke();
    Pincel.closePath();
}