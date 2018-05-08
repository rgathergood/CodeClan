const assert = require('assert');
const RecordStore = require('../record_store.js');
const Record = require('../record.js');
const RecordCollector = require('../record_collector.js');

describe('RecordStore', function () {
  let recordStore;
  let record1;
  let record2;
  let record3;
  let person;


  beforeEach( function () {
    recordStore = new RecordStore('Groovy Tunes', 'Edinburgh')
    record1 = new Record('The Beatles', 'White Album', 'Rock', 9.99)
    record2 = new Record('Muse', 'Supermassive Black Hole', 'Rock', 12.99)
    record3 = new Record('Rush', 'Chronicles', 'Prog', 11.99)
    person = new RecordCollector(100);
  })

  it('has a name', function () {
    assert.strictEqual(recordStore.name, 'Groovy Tunes');
  })

  it('has a city', function () {
    assert.strictEqual(recordStore.city, 'Edinburgh');
  })

  it('has an inventory', function () {
    assert.deepStrictEqual(recordStore.inventory, []);
  })

  it('can add new record to inventory', function () {
    recordStore.addRecordToInventory(record1);
    assert.deepStrictEqual(recordStore.inventory, [record1])
  })

  it('can add two new record to inventory', function () {
    recordStore.addRecordToInventory(record1);
    recordStore.addRecordToInventory(record2);
    assert.deepStrictEqual(recordStore.inventory, [record1, record2])
  })

  it('can remove record from inventory', function () {
    recordStore.addRecordToInventory(record1);
    recordStore.removeRecordFromInventory(record1)
    assert.deepStrictEqual(recordStore.inventory, [])
  })

  it('returns inventory total', function () {
    recordStore.addRecordToInventory(record1);
    recordStore.addRecordToInventory(record2);
    recordStore.addRecordToInventory(record3);
    const actual = 34.97;
    assert.deepStrictEqual(recordStore.totalInventoryValue(), actual);
  })

  it('return records by genre', function () {
    recordStore.addRecordToInventory(record1);
    recordStore.addRecordToInventory(record2);
    assert.deepStrictEqual(recordStore.viewRecordsByGenre('Rock'), [record1, record2]);
  })

  it('can sell record to customer', function () {
    recordStore.addRecordToInventory(record1);
    recordStore.sellRecord(record1, person);
    assert.deepStrictEqual(recordStore.inventory, [])
    assert.deepStrictEqual(recordStore.totalInventoryValue(), 0);
    assert.deepStrictEqual(recordStore.balance, record1.price);
  })

});
