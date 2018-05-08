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
        <p><a href="https://www.imdb.com/chart/boxoffice?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=d120b30e-f0de-4d19-a67b-80c0ca1f8c6e&pf_rd_r=T571TMZ6AKZY0K59YB00&pf_rd_s=right-6&pf_rd_t=15061&pf_rd_i=homepage&ref_=hm_cht_sm">See more box office results >></a></p>
      </div>
    );
  }
}

export default FilmBox;
