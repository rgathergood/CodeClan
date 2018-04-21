const Request = require('../helpers/request.js');

const ShipData = function () {
      this.url = 'https://swapi.co/api/starships/?page=1&format=json';
      this.data = [];
    }

ShipData.prototype.getData = function (onComplete) {

  const request = new Request(this.url);
  request.get((data) => {
    this.data = data.results;
      onComplete(this.data);
    console.log(this.data);
  });
};

module.exports = ShipData;
