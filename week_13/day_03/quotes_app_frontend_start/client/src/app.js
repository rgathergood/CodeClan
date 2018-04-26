const QuoteView = require('./views/quoteView');
const Request = require('./services/request.js');

const quoteView = new QuoteView();
const request = new Request('http://localhost:3000/api/quotes');

const getQuotesRequestComplete = function (allQuotes) {
  allQuotes.forEach((quote) => {
    quoteView.addQuote(quote);
  });
};

const createQuoteRequestComplete = function (addedQuote) {
  // console.log(addedQuote);
  quoteView.addQuote(addedQuote);
}

const onFormSubmit = function (event) {
  event.preventDefault();
  console.log('form submitted');
  const nameValue = event.target.name.value;
  const quoteValue = event.target.quote.value;

  const newQuote = {
    name: nameValue,
    quote: quoteValue
  };
  request.post(newQuote, createQuoteRequestComplete);
  this.reset();
}

const onDeleteButtonClicked = function () {
  request.deleteAll(deleteAllComplete);
}

const deleteAllComplete = function () {
  quoteView.clear();
}

//Keep appStart at the bottom
const appStart = function(){
  request.get(getQuotesRequestComplete);
  const addQuoteForm = document.querySelector('form');
  addQuoteForm.addEventListener('submit', onFormSubmit);

  const deleteAllButton = document.querySelector('#deleteButton');
  deleteAllButton.addEventListener('click', onDeleteButtonClicked);
}

document.addEventListener('DOMContentLoaded', appStart);
