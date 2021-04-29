class Persona{
    private nick:string = "juan";
    constructor(nombre:string){
        this.nick = nombre;
    }

    getNick():string{
        return this.nick;
    }

    static metodStatic():number{
        return 10;
    }
}

let persona = new Persona("Carlos")
alert(persona.getNick());


alert(Persona.metodStatic());