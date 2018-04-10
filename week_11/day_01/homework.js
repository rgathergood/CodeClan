//Episode 1
// const name = 'Keith';
//
// const printName = function () {
//   console.log(`My name is ${ name }`);
// }
//
// printName();
//output: My name is Keith
//Method uses variable name, interpolates this with String

//Episode 2
// const score = 5;
//
// const result = function () {
//   const score = 3;
//   return score;
// }
//
// console.log(result());
//output: 3
//Method returns const score within the method

//Episode 3
const myAnimals = ['Chickens', 'Cats', 'Rabbits'];

const listAnimals = function () {
   myAnimals = ['Ducks', 'Dogs', 'Lions'];

  for (const i = 0; i < myAnimals.length; i++) {
    console.log(`${ i }: ${ myAnimals[i] }`);
  }
}

listAnimals();
//output: expected: 0: Chickens, actual: Fails due to assignment to constant variable(28)
// Should return every item in the array, make i let instead of const then loop will work

//Episode 4
// const suspectOne = 'Jay';
// const suspectTwo = 'Val';
// const suspectThree = 'Keith';
// const suspectFour = 'Rick';
//
// const allSuspects = function () {
//   const suspectThree = 'Harvey';
//   console.log('Suspects include:', suspectOne, suspectTwo, suspectThree, suspectFour);
// }
//
// allSuspects();
// console.log(`Suspect three is: ${ suspectThree }`);
//output: Suspects include: Jay Val Keith Rick//Suspect three is Keith
//

//Episode 5
// const detective = {
//   name: 'Ace Ventura',
//   pet: 'monkey'
// };
//
// const printName = function (detective) {
//   return detective.name;
// }
//
// const detectiveInfo = function () {
//   detective['name'] = 'Poirot';
//   return printName(detective);
// }
//
// console.log(detectiveInfo());
//output: Poirot
//Method sets name within function detectiveInfo

//Episode 6
// const murderer = 'rick';
//
// const outerFunction = function () {
//   const murderer = 'marc';
//
//   const innerFunction = function () {
//      murderer = 'valerie';
//   }
//
//   innerFunction();
// }
//
// outerFunction();
// console.log(`The murderer is: ${ murderer }`);
//ouput: Expected: The murderer is: Rick, Actual: Fails as the murder variable is not definwd as a const in the innerFunction

//Episode 7
