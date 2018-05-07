import React, {Component} from 'react';
import Film from './Film.js';

class FilmList extends Component {
  render () {
    const filmNodes = this.props.data.map ((film) => {
      return (
        <Film title = {film.title} key={film.id}>
          {film.opening}
        </Film>
      );
    });

    return (
      <div className="film-list">
        {filmNodes}
      </div>
    );
  }
}

export default FilmList;
