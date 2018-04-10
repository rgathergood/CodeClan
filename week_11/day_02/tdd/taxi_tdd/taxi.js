const Taxi = function (manufacturer, model) {
  this.manufacturer = manufacturer;
  this.model = model;
  this.passengers = [];
};

Taxi.prototype.numberOfPassengers = function () {
  return this.passengers.length;
};

Taxi.prototype.addPassenger = function (passenger) {
  this.passengers.push(passenger);
};

Taxi.prototype.removePassengerByName = function (name) {
  const index = this.passengers.indexOf(name);
  this.passengers.splice(index, 1);
};

Taxi.prototype.removeAllPassengers = function () {
  // this.passengers = [];
  // this.passengers.length = 0;
  this.passengers.splice(0, this.numberOfPassengers());
};

module.exports = Taxi;



// Employing TDD, add the following methods to your taxi:

// - `numberOfPassengers`
// - `addPassenger`
// - `removePassengerByName`
// - `removeAllPassengers`
//
// A passenger should be represented as a `String` containing the passenger's name.
