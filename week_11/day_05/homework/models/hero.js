const Hero = function (name, health, favouriteFood) {
  this.name = name;
  this.health = health;
  this.favouriteFood = favouriteFood;
  this.tasksToComplete = [];
  this.moneyBag = 0;
}

Hero.prototype.saysHello = function () {
  return (`Hello my name is ${this.name}!`)
};

module.exports = Hero;
