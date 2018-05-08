import React from 'react';

const CountrySelector = (props) => {

  const options = props.countries.map((country, index) => {
    return <option value={index} key={index}>{country.name}</option>
  });

  return (
    <select
      id="country-selector"
      defaultValue="default"
      onChange={props.handleChange}
      >
      <option disabled value="default">Choose a country...</option>
      {options}
    </select>
  );
}

export default CountrySelector;
