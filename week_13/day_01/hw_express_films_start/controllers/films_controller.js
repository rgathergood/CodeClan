const express = require('express');
const FilmsData = require('../data/films_data.js');
const filmsData = new FilmsData();

const filmsRouter = new express.Router();

filmsRouter.get('/', function (req, res) {
  const allFilms = filmsData.all();
  res.json({films: allFilms});
});

filmsRouter.get('/:id', function (req, res) {
  const film = filmsData.find(req.params.id)
  res.json(film);
});

filmsRouter.post('/', function (req, res) {
  const newFilm = req.body.film;
  filmsData.add(newFilm);
  res.json({films: filmsData.all()});
});

filmsRouter.put('/:id', function (req, res) {
  const index = req.params.id;
  const updatedFilm = req.body.film;
  filmsData.update(index, updatedFilm)
  // res.send() //no response
  res.json({films: filmsData.all()});
});

filmsRouter.delete('/:id', function (req, res) {
  const index = req.params.id;
  filmsData.delete(index)
  res.json({films: filmsData.all()});
});

module.exports = filmsRouter;
