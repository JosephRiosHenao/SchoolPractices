/*
    Tarea: Dado una variable de tipo objeto, realizar las siguientes validaciones
    1. Determinar si el perro es adulto o no
        (los perros son adultos a los 18 meses, deben convertir los dias a meses).
    2. Imprimir todas las actividades favoritas del perro con un bucle
    3. Si mide mas de un metro y pesa mas de 10 kilogramos y menos de 15 kilogramos,
        indicar que es saludable.
*/

let perro = {
    raza: "Dalmata",
    nombre: "Tommy",
    edadDias: 985,
    actividadesFavoritas: [
        "Jugar con la pelota",
        "Nadar en la piscina",
        "Morder cosas"
    ],
    peso: 12, // Kg
    altura: 110 // cm
}

function dogIsAdult(dog){
    let meses = parseInt(dog.edadDias/30.417);
    if (meses>18){
        console.log("Su edad es:",(meses),"meses, es mayor de edad");
    }else{
        console.log("Su edad es:",(meses),"meses, es menor de edad");
    }
    
}

function dogActivities(dog){
    dog.actividadesFavoritas.forEach( (elemento) => console.log("-",elemento) );
}

function dogIsHeal(dog){
    if ((dog.altura > 100) && (dog.peso>10 && dog.peso<15)){
        console.log("El perro es saludable");
    }else{
        console.log("El perro no es saludable");
    }
}

console.log("\n\n-------Edad------");
dogIsAdult(perro);
console.log("\n\n---Actividades---");
dogActivities(perro);
console.log("\n\n------Salud------");
dogIsHeal(perro);