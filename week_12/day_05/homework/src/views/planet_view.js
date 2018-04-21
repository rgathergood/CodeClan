const PlanetView = function(selectElement, planetContainer) {
  this.selectElement = selectElement;
  this.planetContainer = planetContainer;
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

  const planetName = document.createElement('h3');
  planetName.textContent = planet.name;
  this.planetContainer.appendChild(planetName);

  console.log(planet);

  const planetImg = document.createElement('img');
  planetImg.src = `images/${planet.name}.png`;
  this.planetContainer.appendChild(planetImg);

  const planetClimate = document.createElement('p');
  displayClimate = prettify(planet.climate);
  planetClimate.textContent = 'Climate: ' + displayClimate;
  this.planetContainer.appendChild(planetClimate);

  const planetTerrain = document.createElement('p');
  const terrains = planet.terrain.replace(/\b\w/g, l => l.toUpperCase())
  planetTerrain.textContent = 'Terrain: ' + terrains;
  this.planetContainer.appendChild(planetTerrain);

  const planetPopulation = document.createElement('p');
  let population = planet.population;

  if (population === 'unknown') {
    population = prettify(population)
  } else {
    population = commafy(population);
  }

  planetPopulation.textContent = 'Population: ' + population;
  this.planetContainer.appendChild(planetPopulation);

};

module.exports = PlanetView;
