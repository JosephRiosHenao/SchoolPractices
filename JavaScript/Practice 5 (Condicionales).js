var g_tierra = 9.8;
var g_marte = 3.7;
var g_jupiter = 24.8;
var Option = prompt("¿Que planeta deseas?\n1.Marte\n2.Jupiter");
var peso = parseInt(prompt("Digite su peso"));
var PesoMarte = (peso*g_marte)/g_tierra;
var PesoJupiter = (peso*g_jupiter)/g_tierra;
if (Option == 1) {
    document.write("Su peso en Marte es <strong>"+(PesoMarte.toFixed(2)+" kilos</strong>"));
}else if (Option == 2) {
    document.write("Su peso en Jupiter es <strong>"+(PesoJupiter.toFixed(2)+" kilos</strong>"));
}else{
    document.write("No eligio una opcion valida");
}