import React from "react";

const Pricing = (props) => (
  <div>
    <h4>Pricing</h4>
    <p>Hobby tier price: ${props.prices.hobby} per month</p>
    <p>StartUp tier price: ${props.prices.startup} per month</p>
    <p>Enterprise tier price: ${props.prices.enterprise} per month</p>
  </div>
);

export default Pricing;
