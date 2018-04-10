const Person = require('./person.js');
const Pet = require('./pet.js');

const scooby = new Pet('Scooby Doo', 'Dog');
// scooby.eat('Scooby Snack');

const shaggy = new Person('Shaggy Rogers', scooby);
// shaggy.greet();
shaggy.feedPet('Scooby Snack');


// *Task*
// ```Assign a pet property in the Person constructor via a parameter
// Add a feedPet method to Person.prototype which:
// Accepts a food parameter
// Outputs a string containing the person and pet's names and the food. For example: 'Shaggy Rogers fed Scooby Doo a Scooby Snack'
// Invokes the pet's eat method and passes the food to it```
