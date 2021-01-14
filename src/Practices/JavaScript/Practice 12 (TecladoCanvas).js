var teclado = {
    W: 87,
    A: 65,
    S: 83,
    D: 68
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
