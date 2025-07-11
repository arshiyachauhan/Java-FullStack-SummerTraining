//hoisting works here
greet("Alice");
function greet(name){
    console.log(`Hello, ${name}!`);
}
greet("Bob");

//anonymous function
const sayGoodbye= function(name){
    console.log(`Goodbye, ${name}!`);
};
sayGoodbye("Charlie");
//eg of anonymous function
const factorial= function calculateFactorial(n){
    if(n <=1) return 1;
        return n* calculateFactorial(n-1);
};
console.log(factorial(5));


//arrow functions
const add=(a,b) =>{
    return a+b;
}
const multiply=(a,b)=> a*b;
const square= num=> num*num;
const hello=()=> console.log("Hello");


//multiple argument function
function sumAll(...numbers){
    return numbers.reduce((total, num)=>total + num,0);
}
console.log(sumAll(1,2,3,4));

//enclosing functions/closure - inner/outer functions
function outerFunction(){
    let outVar= "I am from outer";
    function innerFunction(){
        console.log(outVar);
    }
    return innerFunction;
}
const myinnerFunction= outerFunction();
myinnerFunction();
