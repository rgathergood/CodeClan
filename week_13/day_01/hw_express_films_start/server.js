const express = require('express');
const app = express();
const bodyParser = require('body-parser');

app.use(bodyParser.json());

const filmsRouter = require('./controllers/films_controller.js')
app.use('/films', filmsRouter);

const booksRouter = require('./controllers/books_controller.js')
app.use('/books', booksRouter);

// app.use(bodyParser.urlencoded({extended: true})); //form

app.listen(3000, function () {
  console.log(`App running on port ${this.address().port}`);
});
