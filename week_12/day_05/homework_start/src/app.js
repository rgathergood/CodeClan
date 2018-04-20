const BeerData = require('./models/beer_data.js')
const BeerView = require('./views/beer_view.js')

document.addEventListener('DOMContentLoaded', () => {

  const beerSelect = document.querySelector('#beer-select');
  const beerContainer = document.querySelector('#beer-detail-view')
  const beerView = new BeerView(beerSelect, beerContainer);
  const beerData = new BeerData();

  beerSelect.addEventListener('change', (event) => {
    const selectedIndex = event.target.value
    const selectedBeer = beerData.data[selectedIndex];
    beerView.renderDetail(selectedBeer)
  });

  beerData.getData((data) => {
    beerView.renderSelect(data)
  });
});
