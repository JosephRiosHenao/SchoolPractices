let myArray = ['hola','buenos dias','buenas noches'];
function convertMayus(element,index,arrayObject){  
  console.log(index+" - "+element.toUpperCase());
  console.log(arrayObject);
}
myArray.forEach(convertMayus);

let myVar = myArray.map(convertMayus);

