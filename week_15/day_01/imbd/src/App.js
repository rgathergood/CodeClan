import React, { Component } from 'react';
import FilmBox from './containers/FilmBox.js';
import './App.css';

class App extends Component {
  render() {
    return (
      <div>
        <h1>IMBD</h1>
        <FilmBox/>
      </div>
    );
  }
}

export default App;
