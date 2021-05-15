let score = 0;
let seconds = 10;
let scoreMin = 20;

document.getElementById("time").textContent = seconds;

const incrementScore = () => {
    if (score >= scoreMin){
        alert("Ganastes el juego");
        score = 0;
        seconds = 10;
    }else score ++;
    document.getElementById("score").textContent = score;
}
const moveBot = () => {
    const bot = document.querySelector(".bot");
    randomX = Math.random()*500;
    randomY = Math.random()*500;
    bot.style.top = `${randomY}px`;
    bot.style.left = `${randomX}px`;
}
document.querySelector(".bot").addEventListener("mouseenter",()=>{
    incrementScore();
    moveBot();
});
setInterval(() => {
    seconds--;
    document.getElementById("time").textContent = seconds;
    if (seconds == 0){
        alert("Se te acabo el tiempo");
        score = 0;
        document.getElementById("score").textContent = score;
        seconds = 10;
    }
},1000)


/*
	document.getElementById("tiempo").textContent = segundos;

const sumarPuntos = ()=>{
	if (puntos >= puntosNecesarios) {
		alert("ganaste el juego");
		puntos = 0;
		segundos = 10;
    }
	else puntos ++;
	document.getElementById("puntos").textContent = puntos
}
const moverPersonaje = ()=>{
	const bot = document.querySelector(".bot");
	randomX = Math.random()*500;
	randomY = Math.random()*500;
	bot.style.top = `${randomY}px`;
	bot.style.left = `${randomX}px`;
}
document.querySelector(".bot").addEventListener("mouseenter",()=>{
	sumarPuntos();
	moverPersonaje();
});*/
