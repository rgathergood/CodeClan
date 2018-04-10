const Person = function (name, pet) {
   this.name = name;
   this.pet = pet;
}

Person.prototype.greet = function () {
  console.log(`Hi! My name is ${this.name}!`);
}

Person.prototype.feedPet = function (food) {
  console.log(`${this.name} fed ${this.pet.name} a ${food}!`);
  this.pet.eat(food);
};

module.exports = Person;

// const shaggy = new Person('Shaggy Rogers');
// shaggy.greet();
//
// const velma = new Person('Velma Dinkley');
// velma.greet();
//
// console.log('shaggy:', shaggy);
// console.log('velma:', velma);
//
// console.log("shaggy's prototype:", Object.getPrototypeOf(shaggy));
// console.log("velma's prototype:", Object.getPrototypeOf(velma));
