const sumar = (a, b) => {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      if (a < 0 || b < 0) {
        reject("Solo numero mayores a 0");
      } else {
        resolve(a + b);
      }
    }, 5000);
  });
};

const a = () => {
  sumar(5, 5)
    .then((val) => document.write(val))
    .catch((val) => document.write(val));
};

const b = () => {
  fetch('https://jsonplaceholder.typicode.com/todos/5')
  .then(response => response.json())
  .then(json => console.log(json))

}

const c = () => {
  axios.get('https://jsonplaceholder.typicode.com/todos/5')
  .then(json => console.log(json))
}

const d = async () => {
  setTimeout(()=>{
    console.log('Hola')
  },2000)
}

// promise
a();
// fetch
b();
// axios
c();
// async
d().then(console.log('Joseph'));

