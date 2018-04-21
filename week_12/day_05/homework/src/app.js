const PlanetData = require('./models/planet_data.js')
const PlanetView = require('./views/planet_view.js')
const ShipData = require('./models/ship_data.js')
const ShipView = require('./views/ship_view.js')

document.addEventListener('DOMContentLoaded', () => {

  //planet

  const planetSelect = document.querySelector('#planet-select');
  const planetContainer = document.querySelector('#planet-detail-view')
  const planetView = new PlanetView(planetSelect, planetContainer);
  const planetData = new PlanetData();

  planetSelect.addEventListener('change', (event) => {
    const selectedPlanetIndex = event.target.value
    const selectedPlanet = planetData.data[selectedPlanetIndex];
    planetView.renderDetail(selectedPlanet)
  });

  planetData.getData((data) => {
    planetView.renderSelect(data)
  });

  //ship

  const shipSelect = document.querySelector('#ship-select');
  const shipContainer = document.querySelector('#ship-detail-view')
  const shipView = new ShipView(shipSelect, shipContainer);
  const shipData = new ShipData();

  shipSelect.addEventListener('change', (event) => {
    const selectedShipIndex = event.target.value
    const selectedShip = shipData.data[selectedShipIndex];
    shipView.renderDetail(selectedPlanet)
  });

  shipData.getData((data) => {
    shipView.renderSelect(data)
  });
});
