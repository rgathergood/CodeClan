document.addEventListener('DOMContentLoaded', () => {
  const url = 'https://restcountries.eu/rest/v2/all';
  // makeRequest(url, requestComplete); //displays list on load

  const addDataButton = document.querySelector('#get-data');
  addDataButton.addEventListener('click', () => {
    makeRequest(url, requestComplete);
  });
});

const makeRequest = function (url, callback) {
  const request = new XMLHttpRequest();
  request.open('GET', url);
  request.send();

  request.addEventListener('load', callback);
}

const requestComplete = function () {
  if (this.status !== 200) return;
  const jsonString = this.responseText;
  const countries = JSON.parse(jsonString);
  populateList(countries);
}

const populateList = function (countries) {
  const ul = document.querySelector('#country-list');
  countries.forEach((country) => {
    const li = document.createElement('li');
    li.textContent = country.name;
    ul.appendChild(li);
    console.log(country);
  });
}
