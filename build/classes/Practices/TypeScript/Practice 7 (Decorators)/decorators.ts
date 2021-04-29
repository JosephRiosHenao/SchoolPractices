function Saludar(target:Function):void{
    target.prototype.saludos = function():void {
        alert("Hola desde decoradores");
    }
}

@Saludar
class Hello{
    constructor(){}
}

let hi = new Hello();
hi.saludos();