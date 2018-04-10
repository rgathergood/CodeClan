const assert = require('assert');
const BingeWatch = require('../bingewatch_app.js');
const TVShow = require('../tvshow.js');
const Season = require('../season.js');

describe('BingeWatch', function () {

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
      bingewatch = new BingeWatch(tvshow, 4);
    });

    it('should have a show', function () {
      const actual = bingewatch.tvshow;
      assert.strictEqual(actual, tvshow);
    })

    it('should have number of hours', function () {
      const actual = bingewatch.hours;
      assert.strictEqual(actual, 4);
    });

    it('should calculate time to finish show', function() {
      const actual = bingewatch.calculateTimeToFinish();
      assert.strictEqual(actual, 19);
    });

});
