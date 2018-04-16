console.log('first log');
document.addEventListener('DOMContentLoaded', () => {
  const intro = document.getElementById('intro');
  intro.textContent = "I'm afraid I can't do that Dave";

  console.log('second log');
});

console.log('third log');
