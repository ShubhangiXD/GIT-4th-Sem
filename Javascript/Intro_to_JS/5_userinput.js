/*var que1 = prompt("What is your age?");
var que2 = prompt("What is your favourite colour");
console.log("Your are "+que1+" years old and your favourite colour is "+que2); 
//run on chrome console*/

function food(fud) {
    console.log("I love to eat "+fud);
}

function order(quantity, price) {
    console.log("I have ordered "+quantity+" slices of pizza.");
    price *= quantity;
    console.log("I have to pay "+price+" dollars.");
}

//var name = input("Enter pizza?");
food("Pizza");
order(4, 2.10);