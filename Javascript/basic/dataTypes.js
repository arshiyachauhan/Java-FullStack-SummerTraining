//Primitive data types- Number, String, boolean, undefined, null
//Reference(Complex) Types- object and array

//declaring an object
let person={
    first_name:"John",
    last_name:"Doe",
    age:30,
    isStudent:false,
    address:{
        street:"123 Main street",
        city:"Anonmous"
    }
};

console.log(person);
console.log(person.first_name);
console.log(person["last_name"]);


//Array- an ordered list of values.
let fruits=["Apple","Banana","Kiwi","Mangoe"];
let mixedData= [1,"Hello",true,{id:1}];//allows to store mixed data type
console.log(fruits);
console.log(mixedData);
