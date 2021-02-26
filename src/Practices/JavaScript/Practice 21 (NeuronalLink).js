colorSelectorObject = document.getElementById("colorSelector");
colorSelectorObject.addEventListener("input",update,false);
colorSelectorObject.addEventListener("change",update,false);
function update(){
    console.log(colorSelectorObject.value);
}
//setInterval('update()',500)