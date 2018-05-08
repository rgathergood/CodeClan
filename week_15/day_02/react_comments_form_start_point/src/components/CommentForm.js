import React from 'react';

class CommentForm extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      author: '',
      text: ''
    };
    this.handleAuthorChange = this.handleAuthorChange.bind(this); //<<constructor this
    this.handleTextChange = this.handleTextChange.bind(this);
    this.handleCommentSubmit = this.handleCommentSubmit.bind(this);
  }

  handleAuthorChange(event) {
    this.setState({author: event.target.value});
  }

  handleTextChange(event) {
    this.setState({text: event.target.value});
  }

  handleCommentSubmit(event) {
    event.preventDefault();
    const author = this.state.author.trim();
    const text = this.state.text.trim();

    if (text === '' || author === '') return //or bang it! (!text || !author)

    //Send comment to CommentBox
    this.props.handleSubmit({author: author, text: text});

    this.setState({author: '', text: ''});
  }

  render () {
    return (
      <form
        className="comment-form"
        onSubmit={this.handleCommentSubmit}>

        <input
          type="text"
          placeholder="Your Name"
          value ={this.state.author}
          onChange={this.handleAuthorChange}
        />

        <input
          type="text"
          placeholder="Say Something"
          value ={this.state.text}
          onChange={this.handleTextChange}
        />

        <input
          type="submit"
          value="Post Comment"
        />

      </form>
    );
  }
}

export default CommentForm;
