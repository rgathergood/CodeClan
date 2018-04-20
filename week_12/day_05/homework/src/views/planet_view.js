const PlanetView = function(selectElement, planetContainer) {
  this.selectElement = selectElement; //html select element
  this.planetContainer = planetContainer //html div element
}

PlanetView.prototype.renderSelect = function (planetData) {
  planetData.forEach((planet, index) => {
    const planetOption = document.createElement('option');
    planetOption.value = index;
    planetOption.textContent = planet.name;
    this.selectElement.appendChild(planetOption);
  });
};

PlanetView.prototype.renderDetail = function (planet) {
  this.planetContainer.innerHTML = "";
  const planetName = document.createElement('p');
  planetName.textContent = planet.name;
  this.planetContainer.appendChild(planetName);
};

module.exports = PlanetView;
