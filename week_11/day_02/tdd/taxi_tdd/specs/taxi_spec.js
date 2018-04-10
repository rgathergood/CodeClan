const assert = require('assert');
const Taxi = require('../taxi.js');

describe('Taxi', function () {

  let taxi;

  beforeEach(function () {
    taxi = new Taxi('Toyota', 'Prius');
  });

  it('should have a manufacturer', function () {
    // const taxi = new Taxi('Toyota', 'Prius');
    const result = taxi.manufacturer;
    assert.strictEqual(result, 'Toyota');
  });

  it('should have a model', function () {
    // const taxi = new Taxi('Toyota', 'Prius');
    const result = taxi.model;
    assert.strictEqual(result, 'Prius');
  });

  describe('passengers', function () {

    it('should start with no passengers', function () {
      const actual = taxi.passengers;
      assert.deepStrictEqual(actual, []);
    })

    it('should return the number of passengers', function () {
      const actual = taxi.numberOfPassengers();
      assert.strictEqual(actual, 0);
    });

    it('should add a passenger', function () {
      taxi.addPassenger('Larry');
      const actual = taxi.passengers;
      assert.deepStrictEqual(actual, ['Larry']);
    });

    it('should remove a passenger by name', function () {
      taxi.addPassenger('Larry');
      taxi.addPassenger('Mark');
      taxi.removePassengerByName('Larry');
      const actual = taxi.passengers;
      assert.deepStrictEqual(actual, ['Mark']);
    })

    it('should remove all passengers', function () {
      taxi.addPassenger('Larry');
      taxi.addPassenger('Mark');
      taxi.removeAllPassengers();
      const actual = taxi.numberOfPassengers();
      assert.strictEqual(actual, 0);
    })

  });

});
