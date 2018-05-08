const RecordCollector = function(cash) {
  this.cash = cash;
  this.records = [];
}

RecordCollector.prototype.addRecordToCollection = function (record) {
  this.records.push(record);
};

RecordCollector.prototype.totalValueOfCollection = function () {
  return this.records.reduce((runningTotal, currentRecord) => runningTotal + currentRecord.price, 0)
};

RecordCollector.prototype.totalValueOfCollectionByGenre = function (genre) {
  let total = 0;
  this.records.forEach(record => {
    if(record.genre === genre) {
      total += record.price;
    }
  });
  return total;
}

RecordCollector.prototype.canAfford = function(amount) {
  return this.cash >= amount;
}

RecordCollector.prototype.buyRecord = function (record) {
  this.cash -= record.price;
  this.addRecordToCollection(record);
};

RecordCollector.prototype.findMostValuableRecord = function () {
  let value = 0;
  let mostValuable;

  this.records.forEach(record => {
    if(record.price > value) {
      mostValuable = record;
      value = record.price;
    }
  });

  return mostValuable;
};

RecordCollector.prototype.sortCollectionByPrice = function () {
  this.records.sort((recorda, recordb) => {
    if(recorda.price < recordb.price) {
      return -1;
    }
    if (recorda.price > recordb.price) {
      return 1;
    }
    return 0;
  });
};

RecordCollector.prototype.compare = function (person) {
  return this.totalValueOfCollection() > person.totalValueOfCollection();
};

module.exports = RecordCollector;
