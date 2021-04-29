/*
    Tarea: De acuerdo con las siguientes variables, simular la creacion de un usuario
    con las siguientes validaciones:
    1. Validar todas las variables de tipo cadena no sean nulas, y que no esten vacias
    2. Validar que el password coincida con password_confirm
    3. Validar acepte los terminos
    Si todas las validaciones son verdaderas, crear una variable de tipo objeto,
    cuyos atributos sean las variables evaluadas.
    NOTA: Debe implementar funciones para al menos una validacion y usarla correctamente
*/

let full_name = "Fulanito de tal"
let username = "fulanito123"
let email = "email@example.com"
let password = "123isu"
let password_confirm = "123isu"
let acept_terms = true

class User{
    constructor(name,user,email,pass,passConfirm,terms) {
        this.name = name;
        this.user = user;
        this.email = email;
        this.pass = pass;
        this.passConfirm = passConfirm;
        this.terms = terms;
    }

    confirmAccount(){
        let errorAccount = false;
        let error1 = false, error2 = false, error3 = false
        error1 = this.stringValidation();
        error2 = this.passwordValidation();
        error3 = this.termsValidation();
        if (error1 || error2 || error3) errorAccount = true;
        return errorAccount;
    }

    stringValidation(){
        let stringError = false;
        if (this.name ==null || this.name =="" ) stringError = true;
        if (this.user ==null || this.user =="" ) stringError = true;
        if (this.email==null || this.email=="" ) stringError = true;
        if (this.pass ==null || this.pass =="" ) stringError = true;
        if (this.passConfirm==null || this.passConfirm=="") stringError = true;
        if (stringError) console.error("Entradas de texto fallidas");
        else console.log("Entrada de texto correctamente!");
        return stringError;
    }

    passwordValidation(){
        let passError = false;
        if (this.pass=!this.passConfirm) passError = true;
        if (passError) console.error("Contraseña valida incorrectamente");
        else console.log("Contraseña valida correctamente!");
        return passError;
    }

    
    termsValidation(){
        let termsError = false;
        if (!this.terms) termsError = true;
        if (termsError) console.error("No acepto los terminos y condiciones");
        else console.log("Terminos y condiciones aceptados!");
        return termsError;
    }
}

let user = new User(full_name,username,email,password,password_confirm,acept_terms);
let error = user.confirmAccount();
if (error){
    delete user;
    console.error("Cuenta invalida, se eliminara");
}
else console.log("Cuenta creada correctamente!");