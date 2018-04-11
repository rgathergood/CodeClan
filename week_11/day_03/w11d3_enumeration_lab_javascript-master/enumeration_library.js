const EnumerationLibrary = function(array) {
  this.array = array
}

EnumerationLibrary.prototype.find = function(callback) {
  // for (element of this.array) {
  //   if (callback(element)) return element;
  // }
  let found;
  this.array.forEach((element) => {
    if (callback(element) && found === undefined) {
      found = element;
    }
  });
  return found;
}

EnumerationLibrary.prototype.map = function(callback) {
  // newArray = [];
  // for (element of this.array) {
  //   newArray.push(callback(element));
  // }
  // return newArray;
  newArray = [];
  this.array.forEach((element) => {
    newArray.push(callback(element));
  })
  return newArray;
}

EnumerationLibrary.prototype.filter = function(callback) {
  // newArray = [];
  // for (element of this.array) {
  //   if (callback(element)) newArray.push(element);
  // }
  // return newArray;
  newArray = [];
  this.array.forEach((element) => {
    if (callback(element)) newArray.push(element);
  });
  return newArray;
}

EnumerationLibrary.prototype.some = function(callback) {
  // for (element of this.array) {
  //   if (callback(element)) return true;
  // }
  // return false;
  let found = false;
  this.array.forEach((element) => {
    if (callback(element)) found = true;
  });
  return found;
}

EnumerationLibrary.prototype.every = function(callback) {
  // for (element of this.array) {
  //   if (!callback(element)) return false;
  // }
  // return true;
  let condition = true;
  this.array.forEach((element) => {
    if (!callback(element)) condition = false;
  });
  return condition;
}


module.exports = EnumerationLibrary;
