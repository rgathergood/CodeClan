// var name = 'Rob';
//
// var secretFunction = function () {
//   var pinCode = [1, 2, 3, 4];
//   console.log('pincode inside function:', pinCode)
//   console.log('name inside function:', name);
// }
// secretFunction()
// console.log('pincode after function:', pinCode)
//
// console.log('name oustide function:', name);

var filterNames = function (names, letter) {
  var filteredNames = [];
  for (let name of names) {
    if (name[0] === letter) {
      filteredNames.push(name);
    }
  }
  // console.log('name after loop:', name); returns 'Babs' with var name of names, breaks when let is used
  return filteredNames;
}

var people = ['Alice', 'Bob', 'Artem', 'Alex', 'Amy', 'Babs'];

var filteredPeople = filterNames(people, 'A');

console.log('A name people:', filteredPeople);

let calculateEnergy = function(mass) {
  const speedOfLight = 3 * 10**8;
  return mass * speedOfLight**2;
}

console.log(calculateEnergy(80));
