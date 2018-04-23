const express = require('express');
const app = express();

app.use(express.static(`${__dirname}/public`));

app.get('/', function (req, res) { //request and response
  // res.json({data: 'Hello World!'});
  res.sendFile('index.html');
});

app.get('/data', function (req, res) {
  const jsonData = {name: "Saturn", size: 90876}
  res.json(jsonData);
});


app.listen(3000, function () {
  console.log('Example app running on port', this.address().port);
})
