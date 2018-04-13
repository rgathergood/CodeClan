const Rat = function () {}

Rat.prototype.touchFood = function (food) {
  food.healthPoints -= (food.healthPoints * 2)
};

module.exports = Rat;
