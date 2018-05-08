const RecordStore = function(name, city) {
  this.name = name;
  this.city = city;
  this.inventory = [];
  this.balance = 0;
}

RecordStore.prototype.addRecordToInventory = function (newRecord) {
this.inventory.push(newRecord);
};

RecordStore.prototype.removeRecordFromInventory = function (newRecord) {
const index = this.inventory.indexOf(newRecord)
this.inventory.splice(index, 1);
};

RecordStore.prototype.sellRecord = function (record, customer) {
  if (customer.canAfford(record.price)){
  customer.buyRecord(record)
  this.removeRecordFromInventory(record)
  this.balance += record.price
  }
};

RecordStore.prototype.totalInventoryValue = function () {
  return this.inventory.reduce((sum, record) => sum += record.price, 0)
};

RecordStore.prototype.viewRecordsByGenre = function (genre) {
  return this.inventory.filter((record) => record.genre === genre)
};

module.exports = RecordStore;
