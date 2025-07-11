//Comparison operators: ==, ===
console.log('5'+2);
console.log('5'- 2);//string 5 is coerced
console.log(5 == '5');//true(type coersion)
console.log(5 === '5');//false(strict equality)
console.log(true+ 1);//2 (true becomes 1)
console.log(false == 0);//true(false becomes 0)
console.log(null== undefined);//true
console.log(null === undefined);//false
console.log(7 !== 7);//false
console.log(10 > 5);//true


//Checking the data types of variables
console.log(typeof('5'));
console.log(typeof(5));
console.log(typeof 42);
console.log(typeof true);
console.log(typeof "Hello");
console.log(typeof undefined);//undefined
console.log(typeof null);//object
console.log(typeof Symbol('foo'));//symbol
console.log(typeof {});//object
console.log(typeof []);//object
console.log(typeof function() {});//function
