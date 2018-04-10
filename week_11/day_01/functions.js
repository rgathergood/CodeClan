// function sayHello() {
//   return 'Hello World!';
// }
// console.log(sayHello());

// function sayHello(greeting = 'Hello', name = 'World') {
//   return `${greeting} ${name}!`;
// }
// console.log('sayHello with name not passed:',sayHello());
// console.log('sayHello with name:', sayHello('Good morning', 'Rob'));
//
// console.log('custom greeting:', sayHello(undefined, 'Yo'));

var add = function (firstNumber, secondNumber) {
  return firstNumber + secondNumber;
}
// ^ Anonymous function (no name)

// console.log('1 + 2 =', add(1, 2));

var multiply = (firstNumber, secondNumber) => firstNumber * secondNumber;

console.log('3 x 6 =', multiply(3, 6));
