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

  function prettify(str) {
    return str.replace(/(-|^)([^-]?)/g, function(_, prep, letter) {
      return (prep && ' ') + letter.toUpperCase();
    });
  }

  function commafy( num ) {
    var str = num.toString().split('.');
    if (str[0].length >= 5) {
      str[0] = str[0].replace(/(\d)(?=(\d{3})+$)/g, '$1,');
    }
    if (str[1] && str[1].length >= 5) {
      str[1] = str[1].replace(/(\d{3})/g, '$1 ');
    }
    return str.join('.');
  }

  const shipName = document.createElement('h3');
  shipName.textContent = ship.name;
  this.shipContainer.appendChild(shipName);

  const shipImg = document.createElement('img');
  shipImg.src = `images/${ship.name}.png`;
  this.shipContainer.appendChild(shipImg);

  const shipModel = document.createElement('p');
  shipModel.textContent = `Model: ${ship.model}`;
  this.shipContainer.appendChild(shipModel);

  const shipManufacturer = document.createElement('p');
  shipManufacturer.textContent = `Manufacturer: ${ship.manufacturer}`;
  this.shipContainer.appendChild(shipManufacturer);

  const shipCost = document.createElement('p');
  let cost = ship.cost_in_credits;
  if (cost === 'unknown') {
    cost = prettify(cost)
  } else {
    cost = commafy(cost);
  }
  shipCost.textContent = 'Cost: ' + cost + ' Credits';
  this.shipContainer.appendChild(shipCost);

  console.log(ship);
};

module.exports = ShipView;
