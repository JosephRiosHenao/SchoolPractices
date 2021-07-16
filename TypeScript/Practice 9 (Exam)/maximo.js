var readline = require('readline');

var rl = readline.createInterface(process.stdin, process.stdout);

rl.question("", (respuesta2) => {


    rl.question("", (respuesta) => {
    
        let    arregloBusqueda = [];
    
        var arregloNuevo = respuesta;
    
        arregloNuevo = arrayNew.split(' ');

        arrayNew.forEach(elemento => {
            elemento = parseInt(elemento);
            arregloBusqueda.push(elemento)
        });
    
        let maxNumero = 0
        arregloBusqueda.forEach(elemento => {
            if (maxNumero < elemento) { maxNumero = elemento }
        });
        
        console.log(maxNumero);
        
        process.exit()
    })
})



