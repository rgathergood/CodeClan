const assert = require('assert');
const Dinosaur = require('../dinosaur.js');

describe('Dinosaur', function () {

  let dinosaur;

  beforeEach(function () {
    dinosaur = new Dinosaur("Tyrannosaurus", 2);
  })

  it('should have a type', function () {
    const actual = dinosaur.type;
    assert.strictEqual(actual, "Tyrannosaurus");
  });

  it('should have offspring', function () {
    const actual = dinosaur.offspring;
    assert.strictEqual(actual, 2);
  })

});
