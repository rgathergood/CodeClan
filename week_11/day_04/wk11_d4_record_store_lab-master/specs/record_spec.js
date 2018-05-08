const assert = require('assert');
const Record = require('../record.js')

describe('Record', function () {
  let record1;

  beforeEach( function () {
    record1 = new Record('The Beatles', 'White Album', 'Rock', 9.99)
  });

  it('should have an artist', function () {
    assert.strictEqual(record1.artist, 'The Beatles');
  })

  it('should have an title', function () {
    assert.strictEqual(record1.title, 'White Album');
  })

  it('should have an genre', function () {
    assert.strictEqual(record1.genre, 'Rock');
  })

  it('should have an price', function () {
    assert.strictEqual(record1.price, 9.99);
  })
});
