import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import PiggyBank from './PiggyBank.js';

class App extends Component {
  render() {
    return (
      <PiggyBank greeting="Oink! I'm Rob's pitiful piggy bank" owner="Rob" deposit={3}>
      </PiggyBank>
    );
  }
}

export default App;
