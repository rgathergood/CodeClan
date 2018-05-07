import React, {Component} from 'react';
import FilmList from '../components/FilmList.js';


class FilmBox extends Component {
  constructor(props) {
    super(props);

    this.state = {
      data: [
        {id: 1, title: 'Avengers: Infinity War', opening: '£30.1M'},
        {id: 2, title: 'The Guernsey Literary and Potato Peel Pie Society', opening: '£1.0M'},
        {id: 3, title: 'A Quiet Place', opening: '£0.9M'},
        {id: 4, title: 'Rampage', opening: '£0.7M'},
        {id: 5, title: 'Peter Rabbit', opening: '£0.6M'}
      ]
    };
  }

  render () {
    return (
      <div className="film-box">
        Now Playing (UK Box Office)
        <FilmList data={this.state.data}/>
      </div>
    );
  }
}

export default FilmBox;
