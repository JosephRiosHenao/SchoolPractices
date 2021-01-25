var Body = document.getElementById("container");
var Punto1 = document.getElementById("SubirPunto1").addEventListener("click",Punto1);
var Punto2 = document.getElementById("SubirPunto2").addEventListener("click",Punto2);
var Punto3 = document.getElementById("SubirPunto3").addEventListener("click",Punto3);
var Punto4 = document.getElementById("SubirPunto4").addEventListener("click",Punto4);
var Punto5 = document.getElementById("SubirPunto5").addEventListener("click",Punto5);
var Punto6 = document.getElementById("SubirPunto6").addEventListener("click",Punto6);
var BGColor = document.getElementById("colorInput");
function Punto1() {
    alert("Se imprimieron en consola!");
    var i = 1;
    while (i<=20){
        if (i%2==0){
            console.log(i);
        }
        i++;    
    }
}
function Punto2() {
    var Entrada  = 0;
    do {
        Entrada  = parseInt(prompt("Introduzca un numero\nSi desea salir digite \"20\"\n"));
        if (Entrada==0) alert(Entrada+" es un numero neutro\n");
        else if (Entrada>0) alert(Entrada+" es un numero positivo\n");
        else alert(Entrada+" es un numero negativo\n");
    } while (Entrada != 20);
}
function Punto3() {
    var Variables = {Input: 0, Producto: 1,Suma: 0};
    while (Variables.Input != 999){
        Variables.Input = parseInt(prompt("Digite '999' para salir\nDigite un numero: "));
        if (Variables.Input%2==0) Variables.Suma += Variables.Input;
        if (Variables.Input%5==0) Variables.Producto *= Variables.Input;
        alert("Su suma es: "+Variables.Suma+"\nSu producto es: "+Variables.Producto);
    }
}
function Punto4() {
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
function Punto5() {
    ColorSelect = BGColor.value; 
    document.getElementById('container').style.backgroundColor= ColorSelect;

}
function Punto6() {
    var eleccion = 0;
    for (let i = 1; i <= 5; i++) {
        eleccion = parseInt(prompt("PERSONA #"+i+"\n\n1.Bogota\n2.Medellin\n3.Cali\nDigite su ciudad favorita: "));
        if (eleccion == 1) alert("\n\nVamos a comenzar hablando de Bogotá, capital de la República de Colombia y del departamento de Cundinamarca, además de ser el epicentro político, administrativo, económico, industrial, artístico, cultural, deportivo y, por supuesto, turístico del país. Se trata de una ciudad diversa y nmulticultural en la que se combinan las construcciones modernas con las del pasado colonial. Además, es importante tener en cuenta que gracias a sus cerros y a sus parques, es una ciudad verde.\n\n");
        if (eleccion == 2) alert("\n\nLa segunda ciudad más poblada de Colombia es Medellín, capital del departamento de Antioquia. Situada en la cordillera central de los Andes, es un destino ideal para hacer senderismo, tirolina y montar a caballo. Además, los turistas podrán disfrutar de unas vacaciones llenas de cultura.\n\n");
        if (eleccion == 3) alert("\n\nTras Medellín, la ciudad más poblada de Colombia es Cali, cuyo nombre oficial es Santiago de Cali. Se trata de la capital del departamento del Valle del Cauca y está considerada como una de las ciudades más antiguas de América. Por otro lado, debes saber que se trata de uno de los principales centros económicos e industriales del país.\n\n");
    }
}

