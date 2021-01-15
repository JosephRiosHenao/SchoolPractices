var teclado = {
    W: 87,
    A: 65,
    S: 83,
    D: 68
}
var PASOS = 5;
var Posicion = 
{
    Inicial: {X:0,Y:0},
    Final: {X:0,Y:0}
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
