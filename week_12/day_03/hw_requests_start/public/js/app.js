let beers = [];

document.addEventListener('DOMContentLoaded', () => {
  const url = 'https://api.punkapi.com/v2/beers';
  makeRequest(url, requestComplete);
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
  loopBeers();
}

const loopBeers = function () {
  beers.forEach((beer) => populateList(beer));
}

const populateList = function (beer) {
  const mainDiv = document.querySelector('#beer-list');

  const div = document.createElement('div');
  const beerName = document.createElement('h2');
  const beerImg = document.createElement('img');
  const beerTagline = document.createElement('h5');
  const beerDescription = document.createElement('h5');

  beerName.textContent = beer.name;
  beerImg.src = beer.image_url;
  beerTagline.textContent = beer.tagline;
  beerDescription.textContent = beer.description;

  mainDiv.appendChild(div);
  div.appendChild(beerName);
  div.appendChild(beerImg);
  div.appendChild(beerTagline);
  div.appendChild(beerDescription);
}
