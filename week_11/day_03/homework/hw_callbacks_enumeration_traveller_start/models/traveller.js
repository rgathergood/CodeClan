const Traveller = function(journeys) {
  this.journeys = journeys;
};

Traveller.prototype.getJourneyStartLocations = function() {
  return this.journeys.map((journey) => journey.startLocation);
  // startLocations = []
  // this.journeys.forEach((journey) => {
  //   startLocations.push(journey.startLocation);
  // });
  // return startLocations;
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
  return this.journeys.reduce((sum, journey) => {
    return sum + journey.distance;
  }, 0)
};

Traveller.prototype.getUniqueModesOfTransport = function () {
  let allArray = this.getModesOfTransport();
  let uniqueArray = [];
  allArray.forEach((type) => {
    if (uniqueArray.includes(type) === false) {
      uniqueArray.push(type)
    }
  });
  return uniqueArray;
};

module.exports = Traveller;
