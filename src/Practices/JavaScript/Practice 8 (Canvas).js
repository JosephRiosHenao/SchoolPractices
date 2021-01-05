var d = document.getElementById("Lienzo");
var lienzo = d.getContext("2d"); 
var pasos = parseInt(prompt("Digite los pasos"));
var PasoFinal = 0;
var X1 = 0, Y1 = 0, X2 = 500, Y2 = 500;
for (let i = 0; i <= 500; i+=(pasos/2)) {
    dibujarLinea("black",X1,Y1,X2,Y2);
    if (X1 != 500){
        X1 += pasos;
    }else if (Y1 != 500){
        Y1 += pasos;
    }
    if (X2 != 0){
        X2 -= pasos;
    }else if (Y2 != 0){
        Y2 -= pasos;
    }
}
function dibujarLinea(color, xInicial, yInicial, xFinal, yFinal){
    console.log("Posiciones iniciales ("+xInicial+","+yInicial+")\nPosiciones finales ("+xFinal+","+yFinal+")");
    lienzo.beginPath();
    lienzo.strokeStyle = color;
    lienzo.moveTo(xInicial,yInicial);
    lienzo.lineTo(xFinal,yFinal);
    lienzo.stroke();
    lienzo.closePath();
}