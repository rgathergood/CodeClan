import React from 'react';
import '../styles/grid_elements.css';

class GridElements extends React.Component {

  render() {

    return (
      <div>
        <div
          id={this.props.grid[0].id}
          className={this.props.grid[0].class}
          onClick={this.props.handleCellClick}>1.1
        </div>
        <div
          id={this.props.grid[1].id}
          className={this.props.grid[1].class}
          onClick={this.props.handleCellClick}>1.2
        </div>
        <div
          id={this.props.grid[2].id}
          className={this.props.grid[2].class}
          onClick={this.props.handleCellClick}>1.3
        </div>
        <div
          id={this.props.grid[3].id}
          className={this.props.grid[3].class}
          onClick={this.props.handleCellClick}>2.1
        </div>
        <div
          id={this.props.grid[4].id}
          className={this.props.grid[4].class}
          onClick={this.props.handleCellClick}>2.2
        </div>
        <div
          id={this.props.grid[5].id}
          className={this.props.grid[5].class}
          onClick={this.props.handleCellClick}>2.3
        </div>
        <div
          id={this.props.grid[6].id}
          className={this.props.grid[6].class}
          onClick={this.props.handleCellClick}>3.1
        </div>
        <div
          id={this.props.grid[7].id}
          className={this.props.grid[7].class}
          onClick={this.props.handleCellClick}>3.2
        </div>
        <div
          id={this.props.grid[8].id}
          className={this.props.grid[8].class}
          onClick={this.props.handleCellClick}>3.3
        </div>
      </div>
    )
  }

}

export default GridElements;
