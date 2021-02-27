var net = new brain.NeuralNetwork();


var colorSelectorObject = document.getElementById("colorSelector");
var backTitle = document.getElementById("sitio");

colorSelectorObject.addEventListener("input",update,false);
colorSelectorObject.addEventListener("change",update,false);

function update(){
    // console.log(hexToRGB(colorSelectorObject.value).r);
    // console.log(hexToRGB(colorSelectorObject.value).g);
    // console.log(hexToRGB(colorSelectorObject.value).b);
    // console.log(hexToRGB(colorSelectorObject.value));
    backTitle.style.background = colorSelectorObject.value;
    var inputColors = {
        red: (hexToRGB(colorSelectorObject.value).r)/255,
        green: (hexToRGB(colorSelectorObject.value).g)/255,
        blue: (hexToRGB(colorSelectorObject.value).b)/255
    };

    var result = net.run(inputColors);
    console.log(result);
    var textColor = result.color > .5 ? "white" : "black";
    backTitle.style.color = textColor;
}


function  hexToRGB(hex){
    var result = /^#?([a-f\d]{2})([a-f\d]{2})([a-f\d]{2})$/i.exec(hex);
    return result ? {
        r: parseInt(result[1], 16),
        g: parseInt(result[2], 16),
        b: parseInt(result[3], 16)
    } : null;
}

net.train([
    //fondo negro, color blanco
    { input:{red:0,green:0,blue:0}, output:{color:1}},
    //fondo blanco, color negro
    { input:{red:1,green:1,blue:1}, output:{color:0}}
])
/*
function NeuralNetwork(red,green,blue){
    var Salida;

    return Salida;
}
*/