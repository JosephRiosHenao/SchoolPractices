Objeto = document.getElementById("Lienzo");
Lienzo = Objeto.getContext("2d");

var Pasos = 10;

Dibujo(0,500,0,0,1);
Dibujo(500,0,0,0,1);
Dibujo(500,500,500,0,2);
Dibujo(0,0,500,0,2);

function Dibujo(Xinicial,Yinicial,X,Y,Operador){
    var Xint = X, Yint = Y;
    if (Operador == 1){
        for (let i = 0; i < 500; i+=Pasos) {
            Dibujar(Xinicial,Yint,Xint,Yinicial);
            Xint += Pasos;
            Yint += Pasos;
        }
    }else{
        for (let i = 0; i < 500; i+=Pasos) {
            Dibujar(Xinicial,Yint,Xint,Yinicial);
            Xint -= Pasos;
            Yint += Pasos;
        }
    }
}

function Dibujar(xInicial, yInicial, xFinal, yFinal){
    console.log("Posiciones iniciales ("+xInicial+","+yInicial+")\nPosiciones finales ("+xFinal+","+yFinal+")");
    Lienzo.beginPath();
    Lienzo.strokeStyle = "lightgreen";
    Lienzo.moveTo(xInicial,yInicial);
    Lienzo.lineTo(xFinal,yFinal);
    Lienzo.stroke();
    Lienzo.closePath();
}