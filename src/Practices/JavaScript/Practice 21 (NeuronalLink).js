colorSelectorObject = document.getElementById("colorSelector");
colorSelectorObject.addEventListener("input",update,false);
colorSelectorObject.addEventListener("change",update,false);
function update(){
    console.log(hexToRGB(colorSelectorObject.value).r);
    console.log(hexToRGB(colorSelectorObject.value).g);
    console.log(hexToRGB(colorSelectorObject.value).b);
    console.log(hexToRGB(colorSelectorObject.value));
}
function  hexToRGB(hex){
    var result = /^#?([a-f\d]{2})([a-f\d]{2})([a-f\d]{2})$/i.exec(hex);
    return result ? {
        r: parseInt(result[1], 16),
        g: parseInt(result[2], 16),
        b: parseInt(result[3], 16)
    } : null;
}
var net = new NeuralNetwork();
