document.addEventListener('DOMContentLoaded', () => {

  // const heading = document.getElementById('heading');
  // console.dir(heading);
  //
  // const container = document.getElementsByClassName('container');
  // console.dir(container);
  //
  // const containerInArray = Array.from(container);
  // console.log(containerInArray);
  //
  // const images = document.getElementsByTagName('img');
  // console.dir(images);

  // const heading = document.querySelector('#heading');
  // console.dir(heading);
  //
  // const container = document.querySelector('.container');
  // console.dir(container);
  //
  // const images = document.querySelectorAll('img');
  // console.dir(images);
  //
  // const imagesArray = Array.from(images);
  // console.dir(imagesArray);

  // const user = {name: 'Rob'};
  //
  // heading.textContent = `Welcome to My Pets Webpage, ${user.name}!`;
  //
  // const images = document.querySelectorAll('img');
  // console.dir(images);
  //
  // const imagesArray = Array.from(images);
  // console.dir(imagesArray);
  //
  // const selectedImage = imagesArray[14];
  // console.dir(selectedImage);
  //
  // selectedImage.classList.add('selected');

  const container = document.querySelector('.container');
  container.innerHTML = '';

  // const image = document.createElement('img');
  // image.src = 'images/IMG15.JPG'
  // console.dir(image);
  //
  //
  // container.appendChild(image);

  const createImage = function (imgSrc, container) {
    const image = document.createElement('img');
    image.src = imgSrc
    container.appendChild(image)
  }

  let count;
  for (count = 1; count < 16; count ++)
  createImage(`images/IMG${count}.JPG`, container)

});
