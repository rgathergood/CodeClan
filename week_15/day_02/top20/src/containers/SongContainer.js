import React from 'react';
import SongList from '../components/SongList.js';
import Request from '../helpers/request';

class SongContainer extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      songs: []
    };
  }

  componentDidMount() {
    const url = "https://itunes.apple.com/gb/rss/topsongs/limit=20/json"
    const songRequest = new Request(url);
    songRequest.get((data) => {
      this.setState({songs: data.feed.entry});
    });
  }

  render() {
    return (
      <div>
        <h2>Top Twenty</h2>
        <SongList
          songs={this.state.songs}
        />
      </div>
    );
  }
}

export default SongContainer;
