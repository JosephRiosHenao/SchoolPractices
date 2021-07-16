var readline = require('readline');

var rl = readline.createInterface(process.stdin, process.stdout);

rl.question("", (respuesta) => {
    let numero = respuesta;
    let factorial = 1;
    for (let i = 1; i <= numero; i++) {
        if (factorial == 0) {factorial = 1}
        factorial = factorial * i;
    }
    console.log(factorial)
    process.exit()
})