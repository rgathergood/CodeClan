const assert = require('assert');
const Hero = require('../models/hero.js');

describe('Hero', function () {
  let hero;

  beforeEach( function () {
    hero = new Hero('Boromir', 75, 'Eggs')
  });

  it('has a name', function () {
    assert.strictEqual(hero.name, 'Boromir')
  });

  it('has health', function () {
    assert.strictEqual(hero.health, 75)
  });

  it('has a favouriteFood', function () {
    assert.strictEqual(hero.favouriteFood, 'Eggs')
  });

  it('can say their name', function () {
    assert.strictEqual(hero.saysHello(), 'Hello my name is Boromir!')
  });

});
