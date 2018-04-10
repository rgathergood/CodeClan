const assert = require('assert');
const TVShow = require('../tvshow.js');
const Season = require('../season.js');

describe('TVShow', function () {

let season1, season2, season3, season4, season5, season6, season7, season8, season9;
let seasons;
let tvshow;

  beforeEach(function () {
    season1 = new Season(1, 132);
    season2 = new Season(2, 484);
    season3 = new Season(3, 550);
    season4 = new Season(4, 418);
    season5 = new Season(5, 616);
    season6 = new Season(6, 616);
    season7 = new Season(7, 572);
    season8 = new Season(8, 528);
    season9 = new Season(9, 550);
    seasons = [season1, season2, season3, season4, season5, season6, season7, season8, season9];
    tvshow = new TVShow('The Office', seasons);
  });

  it('should have a name', function () {
    const actual = tvshow.name;
    assert.strictEqual(actual, 'The Office');
  });

  it('should have seasons', function () {
    const actual = tvshow.seasons;
    assert.deepStrictEqual(actual, seasons);
  });

  it('should calculate total duration', function () {
    const actual = tvshow.calculateTotalDuration();
    assert.strictEqual(actual, 4466)
  });

});
