import React from 'react';
import CountrySelector from '../components/CountrySelector';
import CountryDetail from '../components/CountryDetail';

class CountryContainer extends React.Component {
  constructor(props){
    super(props);
    this.state = {
      countries: [],
      currentCountry: null
    };
    this.handleCountrySelected = this.handleCountrySelected.bind(this);
  }

  handleCountrySelected(event) {
    const index = event.target.value;
    const country = this.state.countries[index];
    this.setState({currentCountry: country});
  }

  componentDidMount() {
    const url = 'https://restcountries.eu/rest/v2/all';
    const request = new XMLHttpRequest();

    request.open('GET', url);

    request.addEventListener('load', () => {
      if(request.status !== 200) return;

      const jsonString = request.responseText;
      const countriesData = JSON.parse(jsonString);

      this.setState({countries: countriesData});
    });

    request.send();
  }

  render(){
    return (
      <div>
        <h2>Country Container</h2>
        <CountrySelector
          countries={this.state.countries}
          handleChange={this.handleCountrySelected}
        />
        <CountryDetail
          country={this.state.currentCountry}
        />
      </div>
    );
  }
}

export default CountryContainer;
