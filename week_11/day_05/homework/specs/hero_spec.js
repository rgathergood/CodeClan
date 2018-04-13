const assert = require('assert');
const Hero = require('../hero.js');

describe('Hero', function () {
  let hero;

  beforeEach( function () {
    hero = new Hero('Boromir', 75, 'eggs')
  });

  it('has a name', function () {
    assert.strictEqual(hero.name, 'Boromir')
  });

});
