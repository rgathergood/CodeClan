document.addEventListener('DOMContentLoaded', () => {
  const save = document.querySelector('#book-form');
  save.addEventListener('submit', handleFormSubmit);

  const deleteButton = document.querySelector('#delete-all');
  deleteButton.addEventListener('click', deleteAll);
});

const handleFormSubmit = function(event) {
  event.preventDefault();
  const title = this.title.value;
  const author = this.author.value;
  const category = this.category.value;
  const genre = this.genre.value;
  addBookToList(title, author, category, genre);
  // clearForm();
  this.reset();
  console.log(title, author, category, genre);
}

const addBookToList = function (titleInput, authorInput, categoryInput, genreInput) {

  const books = document.querySelector('#book-list')
  const book = document.createElement('ul');

  const titleLi = document.createElement('li');
  const authorLi = document.createElement('li');
  const categoryLi = document.createElement('li');
  const genreLi = document.createElement('li');

  titleLi.textContent = titleInput;
  authorLi.textContent = authorInput;
  categoryLi.textContent = categoryInput;
  genreLi.textContent = genreInput;

  books.appendChild(book);
  book.appendChild(titleLi);
  book.appendChild(authorLi);
  book.appendChild(categoryLi);
  book.appendChild(genreLi);
}

const areAnyValuesEmpty = function (values) {
  return values.some((value) => value === '');
}

// const clearForm = function () {
//   const form = document.querySelector('#book-form');
//   form.reset();
// }

const deleteAll = function (event) {
  const list = document.querySelector('#book-list');
  list.innerHTML = '';
  console.log(event);
}
