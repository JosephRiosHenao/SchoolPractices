"use strict";
class Persona {
    constructor(nombre) {
        this.nick = "juan";
        this.nick = nombre;
    }
    getNick() {
        return this.nick;
    }
    static metodStatic() {
        return 10;
    }
}
let persona = new Persona("Carlos");
alert(persona.getNick());
alert(Persona.metodStatic());
