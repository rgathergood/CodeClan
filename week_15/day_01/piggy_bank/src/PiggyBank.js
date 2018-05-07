import React from 'react';

class PiggyBank extends React.Component {
  constructor (props) {
    super(props);

    this.state = {
      total: 0
    };
    this.deposit = this.deposit.bind(this);
    this.withdraw = this.withdraw.bind(this);
  }

  deposit() {
    this.setState((prevState) => {
      return {total: prevState.total + this.props.deposit}
    });
  }

  withdraw() {
    this.setState((prevState) => {
      return {total: prevState.total - this.props.deposit}
    });
  }

  render() {
    return (
      <div className="piggy-bank">
        {this.props.greeting}
        <p>I'm holding £{this.state.total} for {this.props.owner}</p>
        <button onClick={this.deposit.bind(this)}>Add Money</button>
        <button onClick={this.withdraw.bind(this)}>Remove Money</button>
      </div>
    );
  }
}

export default PiggyBank
