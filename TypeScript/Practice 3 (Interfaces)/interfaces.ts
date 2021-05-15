interface Usuario{
    nick:string;
    pass:string;
    confirmPass?:string;
}

let usuario:Usuario = {nick: "Juan",pass: "123",confirmPass: "123"};
console.log(usuario);

interface Abordar{
    abordarTransporte():void;
}

let avion:Abordar = {
    abordarTransporte: function (){
        alert("abordando");
    }
}

avion.abordarTransporte();