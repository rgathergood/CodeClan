import React, {Component} from 'react';
import CommentList from '../components/CommentList.js';

class CommentBox extends Component {
  constructor(props) {
    super(props);

    this.state = {
      data: [
        {id: 1, author: 'Tony', text: "Why are you all looking at me, look forward!"},
        {id: 2, author: 'Tommy', text: "I did not hit her! I did naaht!"}
      ]
    };
  }

  render () {
    return (
      <div className="comment-box">
        Hello World! I am a comment box.
        <CommentList data={this.state.data}/>
      </div>
    );
  }
}

export default CommentBox;
