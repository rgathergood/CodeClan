const express = require('express');
const catRouter = new express.Router();

const cats = ['Bengal', 'Ragdoll', "Fluffy", "Siamse", "Egyptian"];

catRouter.get('/', function(req, res) {
  res.json(cats);
});

catRouter.get('/:id', function(req, res) {
  res.json({cat: cats[req.params.id]});
});

catRouter.post('/', function (req, res) {
  const newCat = req.body.cat;
  cats.push(newCat);
  res.json(cats);
});

catRouter.put('/:id', function (req, res) {
  const newCat = req.body.cat;
  const index = req.params.id;
  cats[index] = newCat;
  res.json(cats);
});

catRouter.delete('/:id', function (req, res) {
  const index = req.params.id;
  cats.splice(index, 1);
  res.json(cats);
});

module.exports = catRouter;
