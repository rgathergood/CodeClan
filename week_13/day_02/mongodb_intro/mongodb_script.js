use farm;
db.dropDatabase();

db.animals.insert({name: 'Erik', species: 'Polar Bear'});
db.animals.insert({species: 'Cat', mood: 'Evil'});


db.animals.update(
  {name: 'Erik'},
  {
    $set: {species: 'Chicken'}
  }
);

db.animals.update(
  {species: 'Cat'},
  {
    $set: {mood: 'Okay'}
  }
);

db.animals.remove({name: 'Erik'})

db.animals.find();
