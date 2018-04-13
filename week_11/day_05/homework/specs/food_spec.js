const assert = require('assert');
const Food = require('../models/food.js');

describe('Food', function () {
  let food1;

  beforeEach( function () {
    food1 = new Food('Cheese', 20)
  });

  it('has name', function () {
    assert.strictEqual(food1.name, 'Cheese')
  });

  it('has healthPoints', function () {
    assert.strictEqual(food1.healthPoints, 20)
  });

});
