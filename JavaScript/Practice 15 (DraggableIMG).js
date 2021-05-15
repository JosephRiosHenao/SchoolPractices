document.getElementById("ButtonDraggable").addEventListener("click",ColorFunc);
//Imagen = document.getElementById("ImageDraggable");

var Fondo = document.getElementById("container");
var Imagen = document.getElementById("ImageDraggable");
var Contenido = document.getElementById("contenido");
var Titulo = document.getElementById("Titulo");
var Boton = document.getElementById("ButtonDraggable");
var TituloEstado = document.getElementById("Estado");

var Estado = "SI";

function ColorFunc(){
    if (Estado == "NO"){
        Fondo.style.backgroundColor = "#5a9c70";
        Fondo.style.borderColor = "#90ee90";
        Imagen.style.borderColor = "#90ee90";
        Contenido.style.borderColor = "#90ee90";
        Titulo.style.color = "#90ee90";
        Boton.style.borderColor = "#90ee90";
        Boton.style.color = "#90ee90";
        TituloEstado.innerHTML = "SI";
        Boton.value = "Volver NO draggable";
        Imagen.setAttribute("draggable", "true");
        console.log(Imagen.draggable);
        Estado = "SI";
    }else{
        Fondo.style.backgroundColor = "#9c5a5a";
        Fondo.style.borderColor = "#f08080";
        Imagen.style.borderColor = "#f08080";
        Contenido.style.borderColor = "#f08080";
        Titulo.style.color = "#f08080";
        Boton.style.borderColor = "#f08080";
        Boton.style.color = "#f08080";
        TituloEstado.innerHTML = "NO";
        Boton.value = "Volver SI draggable";
        Imagen.setAttribute("draggable", "false");
        console.log(Imagen.draggable);
        Estado = "NO";
    }
}
