var movies = [
  {
    title: 'It\'s a Wonderful Life',
    year: 1946,
    director: 'Frank Capra',
    cast: [
      'James Stewart',
      'Donna Reed'
    ],
    ratings: {
      critic: 94,
      audience: 95
    }
  },
  {
    title: 'Black Panther',
    year: 2018,
    director: 'Ryan Coogler',
    cast: [
      'Chadwick Boseman',
      'Michael B. Jordan'
    ],
    ratings: {
      critic: 97,
      audience: 77
    }
  },
  {
    title: 'Star Wars: The Last Jedi',
    year: 2017,
    director: 'Rian Johnson',
    cast: [
      'Mark Hamill',
      'Carrie Fisher'
    ],
    ratings: {
      critic: 91,
      audience: 48
    }
  },
  {
    title: 'Citizen Kane',
    year: 1941,
    director: 'Orson Welles',
    cast: [
      'Joseph Cotten',
      'Dorothy Comingore'
    ],
    ratings: {
      critic: 100,
      audience: 90
    }
  },
];

// 1. Make a new file. - array_of_movies.js
// 2. Copy in the start code below.
// 3. Access and console.log the last movie in the array's year of release.
var lastMovie = movies[movies.length - 1]
console.log(lastMovie.year);

// 4. Loop through the array of movies and make each movie's title all capital letters (Hint: Documentation for String's toUpperCase method)
for (var i = 0; i < movies.length; i++) {
  console.log(movies[i].title.toUpperCase());
}

for (var movie of movies) {
  var title = movie.title;
  var capsTitle = movie.title.toUpperCase();
  movie.title = capsTitle;
}

// 5. Loop through them again, using a different type of loop, and console.log the movie's audience rating
for (var i = 0; i < movies.length; i++) {
  // console.log(movies[i].ratings.audience);
  var movie = movies[i];
  var audienceRating = movie.ratings.audience;
  console.log(audienceRating);
}


// Extensions
//
// 1. Loop through the array, and for each movie object:
// 1a. Iterate through it's ratings object and console.log each individual rating
// 1b. Calculate the average of the ratings, and console.log the average
for (var movie of movies) {
  var ratings = movie.ratings;
  for (var ratingType in ratings) {
    var score = ratings[ratingType];
    console.log(`The ${ratingType} score of ${movie.title} is ${score}`);
  }

var averageRating = (ratings.audience + ratings.critic) / 2
console.log(`average rating of ${movie.title} is ${averageRating}`)

}
