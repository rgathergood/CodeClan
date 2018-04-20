const app = function () {
  const canvas = document.getElementById('main-canvas');
  const context = canvas.getContext('2d');
  context.strokeStyle = 'salmon';
  context.fillStyle = 'Blue';
  // context.strokeRect(10, 10, 50, 50);

  // context.beginPath();
  // context.moveTo(200, 100);
  // context.lineTo(150, 200);
  // context.stroke();

  // context.beginPath();
  // context.moveTo(300, 200);
  // context.lineTo(300, 300);
  // context.lineTo(200, 300);
  // context.closePath();
  // context.fill();
  //
  // context.beginPath();
  // context.moveTo(300, 300);
  // context.lineTo(300, 200);
  // context.lineTo(400, 300);
  // context.closePath();
  // context.fill();

  const drawCircle = function (x, y) {
    context.beginPath();
    context.arc(x, y, 50, 0, Math.PI * 2);
    context.fill();
  }

  const img = document.createElement('img');
  img.src = "http://emojis.slackmojis.com/emojis/images/1457563042/312/doge.png"

  const drawDoge = function(x, y) {
    context.drawImage(img, x, y, 50, 50);
  }

  img.addEventListener('click', drawDoge);

  canvas.addEventListener('click', function (event) {
    drawCircle(event.x, event.y);
  });

  const changeColor = function () {
    context.fillStyle = this.value;
  }

  const colorPicker = document.getElementById('input-color');
  colorPicker.addEventListener('change', changeColor)
}

document.addEventListener('DOMContentLoaded', app);
