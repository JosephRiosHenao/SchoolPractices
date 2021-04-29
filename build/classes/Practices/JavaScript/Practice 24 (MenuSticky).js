const seccionesPagina = new fullpage('#fullpage',{
    autoScrolling:false,
    scrollHorizontally: true,
    navigation: false,
    navigationTooltips: ['Inicio','Informacion','Contacto'],
    slidesNavigation: true,
    slidesNavPosition: 'bottom',
    scrollHorizontally: false,
});
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

//FULLPAGE
