const numbers = [1, 2, 3, 4, 5];

for (const number of numbers) {
  // console.log(`The number is ${number}`);
}

numbers.forEach((number) => {
  // console.log(`The number is ${number}`);
});

numbers.forEach((number, index) => {
  // console.log(`The number is ${number} at position ${index}`);
});

// const multiplyByTwo = function (array) {
//    array.forEach((number) => console.log((number * 2)));
// }
//
// multiplyByTwo(numbers);

const multiplyByTwo = function (array) {
  // multipliedArray = [];
  // array.forEach((number) => {
  //   multipliedArray.push(number * 2)
  // });
  // return multipliedArray;
  return array.map((number) => number * 2);
}

console.log(multiplyByTwo(numbers));

// Write a function called multiplyByTwo that uses the forEach and:
//
// takes in a array of numbers as an argument.
// returns a new array with each element of the original array multiplied by two.
// Hint: If you get stuck, start by writing the function using a for of loop, then refactor, replacing the for loop with the forEach.

const getEvens = function (array) {
  // evenArray = [];
  // array.forEach((number) => {
  //   if (number % 2 === 0) {
  //     evenArray.push(number)
  //   }
  // });
  // return evenArray;
  return array.filter((number) => number % 2 === 0);
}

console.log(getEvens(numbers));

const sumElements = function (array) {
  // let total = 0;
  // array.forEach((number) => {
  //    total += number;
  // });
  // return total
  return array.reduce((total, number) => total + number);
}

console.log(sumElements([numbers]));

// Using the forEach enumeration method, complete the following tasks:
//
// Write a function called getEvens that returns a new array containing all the even numbers from the original array.
// Write a function called sumElements that returns the sum total of all the elements of the original array.


const ourForEach = function (array, callback) {
  for (const item of array) {
    callback(item);
  }
}

ourForEach([5, 6, 7, 8], function (number) {
  console.log('number:', number);
});
