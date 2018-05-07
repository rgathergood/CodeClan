var Calculator = require('../../public/js/calculator.js')
var assert = require('assert')

describe('calculator', function () {
  beforeEach(function () {
    calculator = new Calculator()
  });

  // write unit tests here in the form of "it should do something..."
  it('it has a sample test', function(){
    assert.equal(true, true)
  });

  it('should add', function () {
    calculator.previousTotal = 1;
    calculator.add(4);
    assert.equal(calculator.runningTotal, 5);
  });

  it('should subtract', function () {
    calculator.previousTotal = 7;
    calculator.subtract(4);
    assert.equal(calculator.runningTotal, 3);
  });

  it('should multiply', function () {
    calculator.previousTotal = 3;
    calculator.multiply(5);
    assert.equal(calculator.runningTotal, 15);
  });

  it('should divide', function () {
    calculator.previousTotal = 21;
    calculator.divide(7);
    assert.equal(calculator.runningTotal, 3);
  });

  it('should register numberClick', function () {
    calculator.numberClick(1);
    calculator.numberClick(2);
    calculator.numberClick(3);
    assert.strictEqual(calculator.runningTotal, 123);
  });

  it('should register operatorClick', function () {
    calculator.numberClick(1);
    calculator.operatorClick('+');
    calculator.numberClick(1);
    calculator.operatorClick('=');
    assert.strictEqual(calculator.runningTotal, 2);
  });

  it('should clearClick', function () {
    calculator.numberClick(1);
    calculator.clearClick()
    assert.strictEqual(calculator.runningTotal, 0);
  });

});
