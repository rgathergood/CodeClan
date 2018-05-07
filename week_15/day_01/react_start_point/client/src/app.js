import React from 'react';
import ReactDOM from 'react-dom';

document.addEventListener('DOMContentLoaded', function () {

  const rootDiv = document.getElementById('root');

  const helloWorld = <h1>Hello World!</h1>;
  const helloWorld = React.createElement('h1', null, 'Hello World!');

  ReactDOM.render(helloWorld, rootDiv);

});
