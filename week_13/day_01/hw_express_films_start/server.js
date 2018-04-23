const express = require('express');
const app = express();
const bodyParser = require('body-parser');

const filmsRouter = require('./controllers/films_controller.js')
app.use('/films', filmsRouter);

const booksRouter = require('./controllers/books_controller.js')
app.use('/books', booksRouter);

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended: true}));

app.listen(3000, function () {
  console.log(`App running on port ${this.address().port}`);
});
