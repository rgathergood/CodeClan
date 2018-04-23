const express = require('express');
const dogRouter = new express.Router();

const dogs = ['Labradoodle', 'Cockapoo', "German Shepard", "Big Floof", "Good Boi"];

dogRouter.get('/', function(req, res) {
  res.json(dogs);
});

dogRouter.get('/:id', function(req, res) {
  res.json({dog: dogs[req.params.id]});
});

dogRouter.post('/', function (req, res) {
  const newDog = req.body.dog;
  dogs.push(newDog);
  res.json(dogs);
});

dogRouter.put('/:id', function (req, res) {
  const newDog = req.body.dog;
  const index = req.params.id;
  dogs[index] = newDog;
  res.json(dogs);
});

dogRouter.delete('/:id', function (req, res) {
  const index = req.params.id;
  dogs.splice(index, 1);
  res.json(dogs);
});

module.exports = dogRouter;
