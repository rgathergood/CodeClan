let counter = 0;
const handleButtonClick = function() {
  counter ++
  const resultParagraph = document.querySelector('#button-result');
  resultParagraph.textContent = `That button has been clicked ${counter} times!`;
}

const handleKeyPress = function () {
  const resultParagraph = document.querySelector('#input-result');
  resultParagraph.textContent = `Your input: ${this.value}`;
}

const handleChange = function () {
  const resultParagraph = document.querySelector('#select-result');
  resultParagraph.textContent = `You chose: ${this.value}`
}

const handleFormSubmit = function (event) {
  event.preventDefault(); //Stops submit from refreshing page
  const resultParagraph = document.querySelector('#form-result');
  resultParagraph.textContent = `Hello ${this.first_name.value} ${this.last_name.value}!`;

}

document.addEventListener('DOMContentLoaded', () => {
  const button = document.querySelector('#button');
  button.addEventListener('click', handleButtonClick);

  const input = document.querySelector('#input');
  input.addEventListener('input', handleKeyPress); //keyup can be used instead of input

  const select = document.querySelector('#select');
  select.addEventListener('change', handleChange);

  const form = document.querySelector('#form');
  form.addEventListener('submit', handleFormSubmit);
});
