window.onload = init;

function init(){
    var button = document.getElementById("getAnwser");
    button.onclick = alertAnswer;  
   
}

function alertAnswer(){
    var guess = document.getElementById("guess");
    var guessValue = guess.value;
    var answer = checkGuess(guessValue);
    alert(answer);
}



function checkGuess(guess){
    var answers = ["red","green","blue"];

    var index = Math.floor(Math.random() * answers.length);

    if(guess == answers[index]){
        answer = "You're right! I was thinking of "+answers[index];
    }else{
        answer = "Sorry,I was thinking of "+answers[index];
    }

    return answer;
}

  var barLink = document.createElement("a");
        barLink.href
        var optionValue = new Array();