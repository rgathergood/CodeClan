const assert = require('assert');
const Enclosure = require('../enclosure.js');
const Dinosaur = require('../dinosaur.js');

describe('Enclosure', function () {

  let enclosure;
  let dinosaur;

  beforeEach(function () {
    enclosure = new Enclosure();
    dinosaur1 = new Dinosaur('Tyrannosaurus', 2);
    dinosaur2 = new Dinosaur('Tyrannosaurus', 1);
    dinosaur3 = new Dinosaur('Velociraptor', 3);
  });

  it('should start as empty', function () {
    const actual = enclosure.dinosaurs;
    assert.deepStrictEqual(actual, []);
  });

  it('should add dinosaur', function () {
    enclosure.addDinosaur(dinosaur1);
    const actual = enclosure.numberOfDinosaurs();
    assert.strictEqual(actual, 1);
  });

  it('should remove dinosaurs by type', function () {
    enclosure.addDinosaur(dinosaur1);
    enclosure.addDinosaur(dinosaur2);
    enclosure.addDinosaur(dinosaur3);
    enclosure.removeByType('Tyrannosaurus');
    const actual = enclosure.dinosaurs;
    assert.deepStrictEqual(actual, [dinosaur3]);
  });

  it('should return all dinosaurs if offspring > 2', function () {
    enclosure.addDinosaur(dinosaur1);
    enclosure.addDinosaur(dinosaur2);
    enclosure.addDinosaur(dinosaur3);
    const actual = enclosure.returnIfOffspringIsGreaterThanTwo();
    assert.deepStrictEqual(actual, [dinosaur3]);
  })

});
