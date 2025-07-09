//The call stack is a LIFO(Last-in, first-out)
//When script starts, the GEC is pushed onto the stack. 
//When the function is called, a new FEC is created and pushed into the top of the stack.
//When a function finishes , its FEC is popped off the stack. The script finishes when the stack is empty.

console.log("Hello World !!");

//var- (legacy)- function scoped. if declared inside 
myVar= 10;
console.log(myVar);

var myVar= 20;
console.log(myVar);

//block has global scope
//var is blockscope wheresas let is not
if(true){
    var blockVar=20;
    console.log(blockVar);
}

console.log(blockVar);

//can be redefined
var myVar="Hello";
console.log(myVar);

//let- block-scoped, variables declared with let are limited to block, are hoisted but placed in temporal dead zone(TDZ).
// console.log(myLet);- can't run before initializartion, gives refernce error
let myLet=10;
console.log(myLet);
if(true){
    let blockLet=20;
    console.log(blockLet);
}
//block scoped- can't run outside the block 
// console.log(blockLet);

//const- have fixed value and cannot be changed later
const PI=3.14;
console.log(PI);
