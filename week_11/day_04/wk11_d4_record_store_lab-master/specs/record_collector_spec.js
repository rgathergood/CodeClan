const assert = require('assert');
const RecordCollector = require('../record_collector.js');
const Record = require('../record.js');

describe('RecordCollector', function() {
  let person;
  let recordA;
  let recordB;
  let recordC;

  beforeEach(function() {
    person = new RecordCollector(100);
    recordA = new Record('The White Stripes', 'Elephant', 'Garage Rock', 10);
    recordB = new Record('The White Stripes', 'Blue Orchid', 'Garage Rock', 10);
    recordC = new Record('Aerosmith', 'Big Ones', 'Classic Rock', 20);
    recordD = new Record('Spice Girls', 'Wannabe', 'Pop', 5);
    recordE = new Record('Ed Sheeran', 'x', 'Pop', 7);
  });

  it('has cash to start with', function() {
    assert.strictEqual(person.cash, 100);
  })

  it('begins with an empty record collection', function() {
    assert.deepStrictEqual(person.records, []);
  })

  it('can add record to collection', function() {
    person.addRecordToCollection(recordA);
    assert.deepStrictEqual(person.records, [recordA]);
  })

  it('can calculate total value of collection', function() {
    person.addRecordToCollection(recordA);
    person.addRecordToCollection(recordB);
    assert.strictEqual(person.totalValueOfCollection(), 20);
  })

  it('can calculate total value of collection by genre', function() {
    person.addRecordToCollection(recordA);
    person.addRecordToCollection(recordB);
    person.addRecordToCollection(recordC);
    assert.strictEqual(person.totalValueOfCollectionByGenre('Garage Rock'), 20);
  })

  it('can afford an amount', function() {
    assert.strictEqual(person.canAfford(30), true);
  })

  it('cant afford an amount', function() {
    assert.strictEqual(person.canAfford(310), false);
  })

  it('cant buy record', function() {
    person.buyRecord(recordA)
    assert.strictEqual(person.cash, 90);
  })

  it('can find most valuable record', function() {
    person.addRecordToCollection(recordA);
    person.addRecordToCollection(recordB);
    person.addRecordToCollection(recordC);
    assert.deepStrictEqual(person.findMostValuableRecord(), recordC);
  })

  it('can order records by value', function() {
    person.addRecordToCollection(recordB);
    person.addRecordToCollection(recordC);
    person.addRecordToCollection(recordD);
    person.addRecordToCollection(recordE);
    person.sortCollectionByPrice()
    const expected = [recordD, recordE, recordB, recordC];
    assert.deepStrictEqual(person.records, expected);
  })

  it('can compare value of record collection with another collector', function() {
    person2 = new RecordCollector(100);
    person.addRecordToCollection(recordB);
    person.addRecordToCollection(recordC);
    person.addRecordToCollection(recordD);
    person.addRecordToCollection(recordE);
    person.addRecordToCollection(recordB);
    person2.addRecordToCollection(recordC);
    assert.strictEqual(person.compare(person2), true);
  })
});
