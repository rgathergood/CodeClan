const assert = require('assert');
const Rat = require('../models/rat.js');
const Food = require('../models/food.js');

describe('Food', function () {
  let rat;
  let food1;

  beforeEach( function () {
    rat = new Rat
    food1 = new Food('Cheese', 20)
  });

  it('can touchFood', function () {
    rat.touchFood(food1);
    assert.strictEqual(food1.healthPoints, -20)
  });

});
