const PlanetData = require('./models/planet_data.js')
const PlanetView = require('./views/planet_view.js')

document.addEventListener('DOMContentLoaded', () => {

  const planetSelect = document.querySelector('#planet-select');
  const planetContainer = document.querySelector('#planet-detail-view')
  const planetView = new PlanetView(planetSelect, planetContainer);
  const planetData = new PlanetData();

  planetSelect.addEventListener('change', (event) => {
    const selectedIndex = event.target.value
    const selectedPlanet = planetData.data[selectedIndex];
    planetView.renderDetail(selectedPlanet)
  });

  planetData.getData((data) => {
    planetView.renderSelect(data)
  });
});
