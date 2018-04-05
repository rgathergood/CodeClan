DROP TABLE hogwarts_students;
DROP TABLE hogwarts_houses;

CREATE TABLE hogwarts_houses (
  id serial4 primary key,
  name varchar(255),
  crest varchar(255)
);

CREATE TABLE hogwarts_students (
  id serial4 primary key,
  first_name varchar(255),
  last_name varchar(255),
  house_id INT4 REFERENCES hogwarts_houses(id) ON DELETE CASCADE,
  age int2
);
