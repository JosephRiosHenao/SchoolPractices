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
const Punto3 = () => {
    var Variables = {Input: 0, Producto: 1,Suma: 0};
    while (Variables.Input != 999){
        Variables.Input = parseInt(prompt("Digite '999' para salir\nDigite un numero: "));
        if (Variables.Input%2==0) Variables.Suma += Variables.Input;
        if (Variables.Input%5==0) Variables.Producto *= Variables.Input;
        alert("Su suma es: "+Variables.Suma+"\nSu producto es: "+Variables.Producto);
    }
}
const Punto4 = () => {
    var NombreMeses = ["Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"];
    var DineroTotal = 0, Mensaje = "MESES\n\n";
    let DineroMeses = [];
    for (let i = 0; i <12; i++){
        DineroMeses.push(parseInt(prompt("Digite el dinero ahorrado en el mes de "+NombreMeses[i])));
        DineroTotal += DineroMeses[i];
        Mensaje += NombreMeses[i]+": "+DineroMeses[i]+"\n";
    }
    alert(Mensaje+"\nDinero total del año: "+DineroTotal);
}
