import React from 'react';
import GridElements from './GridElements.jsx';
import '../styles/game_grid.css';

class GameGrid extends React.Component {
  render(){

    return(
      <div id="game-grid">
        <button>Reset</button>
        <GridElements grid={this.props.grid} handleCellClick={this.props.handleCellClick}/>
      </div>
    )
  }
}

export default GameGrid;
