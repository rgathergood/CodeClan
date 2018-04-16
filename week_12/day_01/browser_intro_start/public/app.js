// console.log('Hello E19!');
const Wizard = function (name) {
  this.name = 'Harry';
}

Wizard.prototype.defend = function () {
  return 'Expecto Patronum!';
};

const harry = new Wizard('Harry');
console.log(harry.defend());
