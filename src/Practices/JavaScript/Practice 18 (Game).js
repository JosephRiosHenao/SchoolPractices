let score = 0;
let seconds = 120;
let scoreMin = 10;

document.querySelector(".bot").addEventListener("click",incrementScore);
const incrementScore = () => {
    if (score >= scoreMin){
        alert("Ganastes el juego");
        score = 0;
        seconds = 120;
    }else{ 
        score ++;
        document.getElementById("score").textContent = score;
    }
}
const moveBot = () => {
    const bot = do
}