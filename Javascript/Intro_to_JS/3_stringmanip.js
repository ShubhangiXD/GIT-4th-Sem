var car = "redblueyellow";
var count = car.length;
console.log(count);

var str2 = "I am a student in KIIT";
count = str2.length;
var stud = str2.indexOf("student"); //starting index of the word
console.log(count); //counts the whitespaces
console.log(stud);

var str2 = "bus, car, plane, boat";
var try1 = str2.slice(0, 3);
console.log(try1);

var str3 = "complete your assignment";
console.log(str3);
var try2 = str3.replace("assignment","homework");
console.log(try2);