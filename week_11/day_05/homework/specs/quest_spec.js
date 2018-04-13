const assert = require('assert');
const Quest = require('../models/quest.js');
const Hero = require('../models/hero.js');

describe('Quest', function () {
  let quest1;

  beforeEach( function () {
    quest1 = new Quest('Bake a Cake', 4, 'Low', 100)
  });

  it('has name', function () {
    assert.strictEqual(quest1.name, 'Bake a Cake')
  });

  it('has difficulty', function () {
    assert.strictEqual(quest1.difficulty, 4)
  });

  it('has urgency', function () {
    assert.strictEqual(quest1.urgency, 'Low')
  });

  it('has reward', function () {
    assert.strictEqual(quest1.reward, 100)
  });

  it('has status', function () {
    assert.strictEqual(quest1.status, false)
  });

});
