var d = document.getElementById("Lienzo");
var lienzo = d.getContext("2d"); 

var pasos = 50;
var PasoFinal = 0;
var X1 = 0, Y1 = 0, X2 = 500, Y2 = 500;

for (let i = 0; i <= 500; i+=50) {
    console.warn("Posiciones iniciales ("+X1+","+0+")\nPosiciones finales ("+250+","+500+")");
    dibujarLinea("black",X1,0,250,500);
    if (X1 != 500){
        X1 += pasos;
    }else{
        Y1 += pasos;
    }

}

/*
dibujarLinea("black",0,0,500,500);
dibujarLinea("red",250,0,250,500);
dibujarLinea("red",0,500,500,0);
*/


function dibujarLinea(color, xInicial, yInicial, xFinal, yFinal){
    console.log("Posiciones iniciales ("+xInicial+","+yInicial+")\nPosiciones finales ("+xFinal+","+yFinal+")");
    lienzo.beginPath();
    lienzo.strokeStyle = color;
    lienzo.moveTo(xInicial,yInicial);
    lienzo.lineTo(xFinal,yFinal);
    lienzo.stroke();
    lienzo.closePath();
}