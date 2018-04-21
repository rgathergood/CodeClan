const ShipView = function(selectElement, shipContainer) {
  this.selectElement = selectElement;
  this.shipContainer = shipContainer;
}

ShipView.prototype.renderSelect = function (shipData) {
  shipData.forEach((ship, index) => {
    const shipOption = document.createElement('option');
    shipOption.value = index;
    shipOption.textContent = ship.name;
    this.selectElement.appendChild(shipOption);
  });
};

ShipView.prototype.renderDetail = function (ship) {
  this.shipContainer.innerHTML = "";

  const shipName = document.createElement('h3');
  shipName.textContent = ship.name;
  this.shipContainer.appendChild(shipName);

  console.log(ship);
};

module.exports = ShipView;
