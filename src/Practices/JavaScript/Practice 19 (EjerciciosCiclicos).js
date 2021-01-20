const Punto1 = () => {
    var i = 1;
    while (i<=20){
        if (i%2==0){
            console.log(i);
        }
        i++;
    }
}
const Punto2 = () => {
    var Entrada  = 0;
    do {
        Entrada  = parseInt(prompt("Introduzca un numero\nSi desea salir digite \"20\"\n"));
        if (Entrada==0) alert(Entrada+" es un numero neutro\n");
        else if (Entrada>0) alert(Entrada+" es un numero positivo\n");
        else alert(Entrada+" es un numero negativo\n");
    } while (Entrada != 20);
}
