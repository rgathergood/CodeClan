const Traveller = function(journeys) {
  this.journeys = journeys;
};

Traveller.prototype.getJourneyStartLocations = function() {
  // startLocations = []
  // this.journeys.forEach((journey) => {
  //   startLocations.push(journey.startLocation);
  // });
  // return startLocations;
  return this.journeys.map((journey) => journey.startLocation);
};

Traveller.prototype.getJourneyEndLocations = function () {
  return this.journeys.map((journey) => journey.endLocation);
};

Traveller.prototype.getModesOfTransport = function () {
  return this.journeys.map((journey) => journey.transport);
};

Traveller.prototype.getJourneysByTransport = function (transport) {
  return this.journeys.filter((journey) => journey.transport === transport);
};

Traveller.prototype.getJourneysByMinDistance = function (minDistance) {
  return this.journeys.filter((journey) => journey.distance >= minDistance);
};

Traveller.prototype.calculateTotalDistanceTravelled = function () {
  return this.journeys.reduce((sum, journey) => sum + journey.distance, 0);
};

Traveller.prototype.getUniqueModesOfTransport = function () {
  let allArray = this.getModesOfTransport();
  // let uniqueArray = [];
  // allArray.forEach((type) => {
  //   if (uniqueArray.includes(type) === false) {
  //     uniqueArray.push(type)
  //   }
  // });
  // return uniqueArray;
  return Array.from(new Set(this.journeys.map((journey) => journey.transport)));
};

module.exports = Traveller;
