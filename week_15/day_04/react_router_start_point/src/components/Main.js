import React, { Component } from "react";
import About from "./About.js";
import Home from "./Home.js";
import Pricing from "./Pricing.js";
import {BrowserRouter as Router, Route} from "react-router-dom";
import NavigationBar from './NavigationBar.js';

class Main extends Component {
  constructor (props) {
    super(props);
    this.state = {
      pricing: {
        hobby: 0,
        startup: 20,
        enterprise: 99
      }
    };
  }
  render() {
    return (
      <Router>
        <React.Fragment>
          <NavigationBar/>

          <Route exact path="/" component={Home}/>

          <Route path="/about" component={About}/>

          <Route
            path="/pricing"
            render={() => <Pricing prices={this.state.pricing}/>}
          />

        </React.Fragment>
      </Router>
    );
  }
}

export default Main;
