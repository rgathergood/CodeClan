const Request = require('../helpers/request.js');

const BeerData = function () {
  this.url = 'https://api.punkapi.com/v2/beers';
  this.data = null;
}

BeerData.prototype.getData = function (onComplete) {
  const request = new Request(this.url);
  request.get((data) => {
    console.log(data);
    this.data = data;
    onComplete(data);
  });
};

module.exports = BeerData;
