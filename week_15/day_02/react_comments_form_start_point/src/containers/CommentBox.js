import React from 'react'
import CommentList from '../components/CommentList.js'
import CommentForm from '../components/CommentForm.js'

class CommentBox extends React.Component {

  constructor(props) {
    super(props)
    this.state = {
      data: []
    };
    this.addComment = this.addComment.bind(this);
  }

  addComment(comment) {
    comment.id = Date.now();

    const newComments = this.state.data.concat([comment]);

    this.setState({data: newComments});
  }

  render() {
     return (
      <div className="comment-box">
        <h2>Add a Comment</h2>

        <CommentForm handleSubmit={this.addComment}/>

        <CommentList data={this.state.data} />
      </div>
    );
  }
}

export default CommentBox;
