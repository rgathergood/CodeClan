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
  const beers = JSON.parse(jsonString);
  populateList(beers);
}

const populateList = function (beers) {
  const mainDiv = document.querySelector('#beer-list');
  beers.forEach((beer) => {

    const div = document.createElement('div');
    const beerName = document.createElement('h3');
    const beerTagline = document.createElement('h5');
    const beerDescription = document.createElement('h5');
    const beerImg = document.createElement('img');

    beerName.textContent = beer.name;
    beerTagline.textContent = beer.tagline;
    beerDescription.textContent = beer.description;
    beerImg.src = beer.image_url;

    mainDiv.appendChild(div);
    div.appendChild(beerName);
    div.appendChild(beerTagline);
    div.appendChild(beerDescription);
    div.appendChild(beerImg);

  })
}
