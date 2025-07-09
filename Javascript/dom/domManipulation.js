//DOM-
//Element nodes, text nodes, html elermnts, attribute nodes, document node
/*selectors- accessing DOM elements-
document.getElementById();
document.getElementsByClassName();
document.getElementsByTagName();*/

const title= document.getElementById('main-title');
console.log(title);

const para1= document.getElementsByClassName('para');
console.log("first para", para1);

const para2= document.getElementsByClassName('special para');
console.log("second para", para2);

const ele= document.getElementById('my-list');
console.log("list", ele);

const list= document.getElementsByClassName('list-item');
console.log("items",list);

//DOM manipulation and event handling
element.setAtt
