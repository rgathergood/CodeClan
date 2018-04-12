// const setupAddFunction = function (modifier) {
//   let counter = 0; //local variable only exists inside this function
//   return function () {
//     counter += modifier;
//     console.log(counter);
//   }
// }

// const add = setupAddFunction();
// console.log('The value of add is:', add); //add holds a function
//
// add();
// add();
// add();

// const addFive = setupAddFunction(5);
// addFive();
// addFive();
// addFive();
//
// const addTen = setupAddFunction(10);
// addTen();
// addTen();
// addTen();
//
// const addMessage = setupConversation();



// - Create a setupConversation function that contains an array local variable within it, which will hold our messages.
// - Have setupConversation return a function that allows us to add a new message to the array.
// - Make your exported function also iterate over the array and console.log() each message after the new message has been added.

// const setupConversation = function () {
//   const conversation = []; //const so this can't be redefined
//
//   return function (newMessage) {
//     conversation.push(newMessage);
//     conversation.forEach((message) => console.log(message))
//     console.log('\n');
//   };
// };
//
// const addMessage = setupConversation();
//
// addMessage("I've got something very important to tell you that must never be forgotten");
// addMessage('Oh yeah?');
// addMessage("Oh, no. Wait... It's fine.");

const Person = function (name) {
  // this.name = name;

  this.getName = function () {
    return name;
  }

  this.setName = function (newName) {
    name = newName;
  }
}

Person.prototype.greet = function () {
  console.log(`Hi! My name is ${this.getName()}`);
};

const shaggy = new Person('Shaggy Rogers');

console.log(shaggy);
console.log(shaggy.getName());
shaggy.setName('Fred');
shaggy.greet();

const velma = new Person('Velma Rogers');
console.log(velma);
