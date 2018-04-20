const Request = require('../helpers/request.js');

const PlanetData = function () {
      this.url = 'https://swapi.co/api/planets/?page=1';
      this.data = [];
    }

PlanetData.prototype.getData = function (onComplete) {
  const request = new Request(this.url);
  request.get((data) => {
    this.data = data.results;
    onComplete(this.data);
    console.log(this.data);
  });
};

module.exports = PlanetData;
