import React from 'react';

const CountryDetail = ({country}) => { //destructuring props

  if (country === null) return null // or {
    //   return <p>No Country Selected</p>
    // }
    return (
      <div>
        <h3>{country.name}</h3>
        <h4>Capital: {country.capital}</h4>
        <p>Population: {country.population.toLocaleString()}</p>
        <p>Coordinates: Latitude: {Math.round(country.latlng[0])},  Longitude: {Math.round(country.latlng[1])}</p>
        <img src={country.flag}></img>
      </div>
    )
  }

  export default CountryDetail;
