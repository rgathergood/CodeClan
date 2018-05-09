import React from 'react';
import GameGrid from '../components/GameGrid.jsx';

class GameContainer extends React.Component {
  constructor(props){
    super(props);
    this.state = {
      grid: [
        {id: 0, class: "cell"},
        {id: 1, class: "cell"},
        {id: 2, class: "cell"},
        {id: 3, class: "cell"},
        {id: 4, class: "cell"},
        {id: 5, class: "cell"},
        {id: 6, class: "cell"},
        {id: 7, class: "cell"},
        {id: 8, class: "cell"}
      ]
    };

    this.onCellClick = this.onCellClick().bind(this);
  }




  onCellClick(event){
    let clicked = true;
    return function (event) {


      const targetedDiv = event.target;
      console.log(targetedDiv.id);
      const id = targetedDiv.id;
      const liveState = this.state.grid;
      if (clicked === true){
        console.log(liveState[id]);
        liveState[id].class = "cell cross";
      } else {
        liveState[id].class = "cell nought";
      }
      this.setState({grid: liveState});
      clicked = !clicked;
    }
  }

  render(){
    return(
      <div>
        <GameGrid grid={this.state.grid} handleCellClick={this.onCellClick}/>
      </div>
    )
  }
}

export default GameContainer;
