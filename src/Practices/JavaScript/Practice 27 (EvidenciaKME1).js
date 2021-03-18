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
let acept_terms = false

class User{
    constructor(name,user) {
        
    }


    

    passwordValidation(password,passwordConfirm){
        let error = 0;
        if (password==passwordConfirm){
            console.log("Contraseña valida correctamente!");
        }else{
            console.error("Contraseña valida incorrectamente!, verifique");
            error = 1;
        }
        return error;
    }
}