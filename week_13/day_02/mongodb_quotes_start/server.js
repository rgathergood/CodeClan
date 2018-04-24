const express = require('express');
const parser = require('body-parser');
const server = express();

server.use(parser.json());
server.use(express.static('client/public'));

const MongoClient = require('mongodb').MongoClient;
const ObjectID = require('mongodb').ObjectID;

MongoClient.connect(
  'mongodb://localhost:27017', function (err, client) {
    if (err) {
      console.error(err);
      return;
    }
    const db = client.db('star_wars')

    console.log('Connected to DB');

    const quotesCollection = db.collection('quotes');

    //CREATE
    server.post('/api/quotes', function (req, res) {
      const newQuote = req.body;
      quotesCollection.save(newQuote, function (err, result) {
        if (err) {
          console.error(err);
          res.status(500);
          res.send();
        }
        console.log('Saved!');
        // console.log(result);

        res.status(201);
        res.json(result.ops[0]);
      });
    });

    //INDEX
    server.get('/api/quotes', function (req, res) {
      quotesCollection.find().toArray(function (err, allQuotes) {
        if (err) {
          console.error(err);
          res.status(500);
          res.send();
        }

        res.json(allQuotes);
      });
    });

    //FIND BY ID
    server.get('/api/quotes/:id', function (req, res) {
      const id = req.params.id;
      const objectID = ObjectID(id);

      quotesCollection.find({_id: objectID}).toArray(function (err, result) {
        if (err) {
          console.error(err);
          res.status(500);
          res.send();
        }

        res.json(result);
      });
    });

    //DELETE ONE
    server.delete('/api/quotes/:id', function (req, res) {
      const id = req.params.id;
      const objectID = ObjectID(id);

      quotesCollection.deleteOne({_id: objectID}, function (err, result) {
        if (err) {
          console.error(err);
          res.status(500);
          res.send();
        }

        res.send();
      });
    });

    //DELETE ALL
    server.delete('/api/quotes', function (req, res) {
      quotesCollection.deleteMany({}, function (err, result) { //can also pass null or no object at all (only callback)
        if (err) {
          console.error(err);
          res.status(500);
          res.send();
        }

        res.send();
      });
    });

    //UPDATE
    server.put('/api/quotes/:id', function (req, res) {
      const updatedQuote = req.body;

      const id = req.params.id;
      const objectID = ObjectID(id);

      quotesCollection.update({_id: objectID}, updatedQuote, function (err, result) {
        if (err) {
          console.error(err);
          res.status(500);
          res.send();
        }

        res.send(result);
      });
    });

    server.listen(3000, function(){
      console.log("Listening on port 3000");
    });
  });
