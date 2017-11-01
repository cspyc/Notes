/*declaring variables*/
var winners = 2;
var boilingPt = 212.1;
var name = "Dr.Evil";
var isEligible = false;

var tempC = 10;
var testExpression = (9/5) * tempC + 32;
var num = "Number" + " " +"2";
var level1 = 10;
var level2 = 5;
 
var color = "blue";
var r = 3;

var count = 0;
for(var i=0;i<5;i++){
    count = count + i;
}
alert("count is "+count);

var tops = 5;
while(tops > 0){
    for(var spins = 0;spins <3;spins++){
        alert("Top is spinning!");
    }
    tops = tops - 1;
}

for(var berries = 5;berries >0;berries--){
    alert("Eating a berry");
}
console.log(testExpression);
console.log(num);
console.log(level1 >= 5);
console.log(level2 >= 5);
/*console.log("when level is 10,the 'level>=5'/'result is "+ level1>=5 );
console.log("when level is 5,the 'level>=5'/'result is "+ level2>=5 );*/
console.log(color != "pink");
console.log((2 * Math.PI) * r);

console.log("3" + "4");
console.log("3" * "4");
