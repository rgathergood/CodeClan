DROP TABLE IF EXISTS bounty_list;

CREATE TABLE bounty_list (
  id SERIAL4 PRIMARY KEY,
  name VARCHAR(255),
  species VARCHAR(255),
  homeworld VARCHAR(255),
  bounty_value INT2
);    
