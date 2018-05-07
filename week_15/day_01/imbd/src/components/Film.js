import React, {Component} from 'react';

class Film extends Component {
  render () {
    return (
      <div className="film">
        <h4>{this.props.title}</h4>
        {this.props.children}
      </div>
    );
  }
}

export default Film;
