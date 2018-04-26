const express = require('express');
const parser = require('body-parser');
const server = express();

server.use(parser.json());
server.use(express.static(`${__dirname}/client/public`));

const MongoClient = require('mongodb').MongoClient;
const ObjectID = require('mongodb').ObjectID;

MongoClient.connect('mongodb://localhost:27017', function (err, client) {
  if (err) {
    console.error(err);
    return;
  }
  const db = client.db('bucket_list');
  console.log('Connect to DB');
  const countriesCollection = db.collection('countries');
})

server.get('/countries', (req, res) => {
  countriesCollection.find().toArray(function (err, allCountries) {
    if (err) {
      console.error(err);
      res.status(500);
      res.send();
    }
    res.send(allCountries);
  });
});

server.listen(3000, function () {
  console.log('Listening on port 3000');
})
