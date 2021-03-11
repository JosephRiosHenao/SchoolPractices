const btnSwitch = document.querySelector("#switch")

btnSwitch.addEventListener('click', () => {
    document.body.classList.toggle('dark');
    btnSwitch.classList.toggle('active');

    //LOCAL STORAGE
    if (document.body.classList.contains('dark')){
        localStorage.setItem('dark-theme','true')
    }else{
        localStorage.setItem('dark-theme','false')
    }
});

//LOCAL STORAGE INICIAL
if (localStorage.getItem('dark-theme') === 'true'){
    document.body.classList.add('dark');
    btnSwitch.classList.add('active');
}else{
    document.body.classList.remove('dark');
    btnSwitch.classList.remove('active');
}

particlesJS.load('particles-js', '../JSON/particlesjs-config.json', function() {
  console.log('callback - particles.js config loaded');
});