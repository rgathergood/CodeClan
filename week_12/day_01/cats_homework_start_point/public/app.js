const Cat = function (name, favouriteFood, imageSource) {
  this.name = name;
  this.favouriteFood = favouriteFood;
  this.imageSource = imageSource;
}

const catsArray = [
  new Cat('Boba', 'Sock fluff', 'http://66.media.tumblr.com/d1f01bbe0150fda0c40d2151c5eaeac8/tumblr_odlqqskjj61v9cejwo1_400.jpg'),
  new Cat('Barnaby', 'Tuna', 'https://68.media.tumblr.com/88d0fcf2b84a7b098dda839130597569/tumblr_okuo4teiql1uhevdso1_1280.jpg'),
  new Cat('Max', 'Whiskas Temptations', 'http://66.media.tumblr.com/7c5784ea89369c780e782bf10c60315a/tumblr_npb0hlYwhV1u63jaco1_1280.jpg'),
  new Cat('Cheshire', 'Caterpillars', 'https://i0.wp.com/chartcons.com/wp-content/uploads/cheshire-2.png?resize=1021%2C580&ssl=1'),
  new Cat('Jackie', 'Cats', "images/IMG8.JPG")
]

const addCat = function (cat, container) {
  const cats = document.createElement('ul');

  const name = document.createElement('li');
  name.textContent = `Name: ${cat.name}`;

  const favouriteFood = document.createElement('li');
  favouriteFood.textContent = `Favourite food: ${cat.favouriteFood}`;

  const imgLi = document.createElement('li');
  const image = document.createElement('img');
  image.src = cat.imageSource;

  container.appendChild(cats);
  cats.appendChild(name);
  cats.appendChild(favouriteFood);
  cats.appendChild(imgLi);
  imgLi.appendChild(image);
}

document.addEventListener('DOMContentLoaded', () => {
  const container = document.querySelector('#cats');
  container.innerHTML = '';
  catsArray.forEach(cat => addCat(cat, container));
});
