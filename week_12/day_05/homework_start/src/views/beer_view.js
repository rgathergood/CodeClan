const BeerView = function(selectElement, beerContainer) {
  this.selectElement = selectElement; //html select element
  this.beerContainer = beerContainer //html div element
}

BeerView.prototype.renderSelect = function (beerData) {
  beerData.forEach((beer, index) => {
    const beerOption = document.createElement('option');
    beerOption.textContent = beer.name;
    beerOption.value = index;
    this.selectElement.appendChild(beerOption);
  });
};

BeerView.prototype.renderDetail = function (beer) {
  this.beerContainer.innerHTML = "";
  const beerName = document.createElement('p');
  beerName.textContent = beer.name;
  this.beerContainer.appendChild(beerName);
};

module.exports = BeerView;
