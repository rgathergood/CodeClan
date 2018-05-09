import React, { Component } from 'react';
import './styles/main.css';
import GameContainer from './containers/GameContainer.jsx';

class App extends Component {
  render() {
    return (
      <div>
        <h1>Noughts & Crosses</h1>
        <GameContainer/>
      </div>
    );
  }
}

export default App;
