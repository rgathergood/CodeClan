const assert = require('assert');
const Season = require('../season.js');

describe('Season', function () {

  it('Should have a number', function () {
    const season = new Season(1, 180)
    const actual = season.number;
    assert.strictEqual(actual, 1);
  });

  it('Should have a duration', function () {
    const season = new Season(1, 180)
    const actual = season.duration;
    assert.strictEqual(actual, 180);
  });

});
