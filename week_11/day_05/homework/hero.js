const Hero = function (name, health, favouriteFood) {
  this.name = name;
  this.health = health;
  this.favouriteFood = favouriteFood;
  this.tasksToComplete = [];
}

module.exports = Hero;
