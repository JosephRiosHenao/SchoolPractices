let myArray = [];
for (let i = 0; i < 10; i+=1){
  myArray.push(i);
}
myArray;

let myArray2 = [];
let control = 0;
while(control<10){
  myArray2.push(control);
  if ( control % 5 === 0 ) {
    control += 2;
  } else {
    control += 1;
  }
}

myArray2;