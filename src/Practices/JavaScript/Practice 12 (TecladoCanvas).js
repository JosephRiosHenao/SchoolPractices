var teclado = {
    W = 87,
    A = 65,
    S = 83,
    D= 68
}

document.addEventListener("keydown",dibujarTeclado)

function dibujarTeclado(Tecla) {
    console.log(Tecla.keyCode)
}
