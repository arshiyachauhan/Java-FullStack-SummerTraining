//for loop
for(let i=0; i<5;i++){
    console.log("loop iteration:  ",i);
}

//while loop
let count=0;
while(count<3){
    console.log("Count: ",count);
    count++;
}

//do-while loop
do{
    console.log("count in do while loop", count);
}while(count<3);

const fruits=["Apple","Banana","Kiwi","Mangoe"];
for (const fruit of fruits){
    console.log(fruit);
}
const str="hello";
for(const char of str){//print the characters separately
    console.log(char);
}

//printing key-value pairs
const car={
    make: "Toyota",
    model: "Camry",
    year: 2022
};
for(const key in car){
    console.log(`${key}: ${car[key]}`);
}
