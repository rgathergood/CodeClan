let beers = [];

document.addEventListener('DOMContentLoaded', () => {
  const url = 'https://api.punkapi.com/v2/beers';
  makeRequest(url, requestComplete);

  const select = document.querySelector('#beer-list');
  select.addEventListener('change', handleBeerSelection)
});

const makeRequest = function (url, callback) {
  const request = new XMLHttpRequest();
  request.open('GET', url);
  request.send();
  request.addEventListener('load', callback);
}

const requestComplete = function () {
  if (this.status != 200) return;
  const jsonString = this.responseText;
  beers = JSON.parse(jsonString);
  populateList(beers);
}

const populateList = function (beers) {
  const select = document.querySelector('#beer-list');
  beers.forEach((beer, index) => {
    const option = document.createElement('option');
    option.textContent = beer.name;
    const value = index;
    option.value = value;
    select.appendChild(option);
  });
}

const handleBeerSelection = function (event) {
  const beer = beers[this.value]
  displayBeerInformation(beer);
}

const displayBeerInformation = function (beer) {
  const mainDiv = document.querySelector('#beer-info');
  mainDiv.innerHTML = ''

  const div = document.createElement('div');
  const beerName = document.createElement('h2');
  const beerImg = document.createElement('img');
  const beerTagline = document.createElement('h5');
  const beerFoodPairing = document.createElement('h6');
  const beerBrewersTips = document.createElement('h6');
  const beerDescription = document.createElement('h5');
  const ingredientsDiv = document.createElement('div');
  const ingredientsDivTitle = document.createElement('h4');
  const malts = document.createElement('h5');
  const hops = document.createElement('h5');
  const yeast = document.createElement('h5');

  beerName.textContent = beer.name;
  beerImg.src = beer.image_url;
  beerTagline.textContent = beer.tagline;
  beerDescription.textContent = beer.description;
  beerFoodPairing.textContent = `Food Pairings: ${beer.food_pairing}`;
  beerBrewersTips.textContent = `Brewers Tips: ${beer.brewers_tips}`;
  ingredientsDivTitle.textContent = 'Ingredients';


  const maltNames =[]
  beer.ingredients.malt.forEach((malt) => maltNames.push(malt.name));
  malts.textContent = `Malt: ${maltNames.join(", ")}`;

  const hopNames =[]
  beer.ingredients.hops.forEach((hop) => hopNames.push(hop.name));
  hops.textContent = `Hops: ${hopNames.join(", ")}`;

  yeast.textContent = `Yeast: ${beer.ingredients.yeast}`


  mainDiv.appendChild(div);
  div.appendChild(beerName);
  div.appendChild(beerImg);
  div.appendChild(beerTagline);
  div.appendChild(beerDescription);
  div.appendChild(beerFoodPairing);
  div.appendChild(beerBrewersTips);
  div.appendChild(ingredientsDiv);
  ingredientsDiv.appendChild(ingredientsDivTitle);
  ingredientsDiv.appendChild(malts);
  ingredientsDiv.appendChild(hops);
  ingredientsDiv.appendChild(yeast);
}
