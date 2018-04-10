var sports = ['football', 'tennis', 'rugby'];

// console.log(sports[0]);

var secondSport = sports[1];

// console.log(secondSport);

sports.push('curling');

// console.log(sports);

sports.push('snooker');
sports.push('darts');

// console.log(sports);

var lastSport = sports[sports.length - 1];

// console.log(lastSport);

// console.log(sports.pop());

sports.unshift('basketball');

sports.shift();

sports.splice(3, 1);

for (var currentSport of sports) {
  var bigSport = currentSport.toUpperCase();
  // console.log(bigSport);
}

for (var i = 0; i < sports.length; i++) {
  // (start)starts at 1, (end/conditions)runs until i is longer than the array length, (what is executed)adds 1 everytime
  var currentSport = sports[i];
  var bigSport = currentSport.toUpperCase();
  // console.log(bigSport);
}

//runs from back to front
for (var i = sports.length - 1; i >= 0; i--) {
  var currentSport = sports[i];
  var bigSport = currentSport.toUpperCase();
  // console.log(bigSport);
}

// console.log(sports);

var movie = {
  title: 'It\'s a Wonderful Life ',
  year: 1946,
  rating: 94
};

// console.log(movie.title);
// console.log(movie.year);
// console.log(movie.rating);

movie.cast = [
  'Jimmy Stewart',
  'Donna Reed'
]

movie['rating'] = 90;

movie['critical-rating'] = 94;

movie.ratings = {
  critic: 94,
  audience: 95,
  personal: 90
};

// console.log(movie.ratings.personal);

for (var key in movie) {
  var value = movie[key];
  // console.log(`The ${key} is ${value}`);
}

var keys = Object.keys(movie);

// console.log(keys);

for (var i = 0; i < keys.length; i++) {
  var key = keys[i];
  var value = movie[key];
  console.log(`The ${key} is ${value}`);
}

// console.log(movie);
