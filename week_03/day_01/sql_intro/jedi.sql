DROP TABLE lightsabers;
DROP TABLE jedi;

-- Syntax for table is
-- CREATE TABLE {name} (
-- {columnName} {columnType}
-- );

CREATE TABLE jedi (
  id SERIAL8 PRIMARY KEY,
  name VARCHAR(255), --max length of name
  age INT2, --upd to ~36,000
  darkside BOOLEAN
);

CREATE TABLE lightsabers (
  id SERIAL8 PRIMARY KEY,
  hilt_metal VARCHAR(255) NOT NULL,
  colour VARCHAR(255) NOT NULL,
  jedi_id INT8 REFERENCES jedi(id) --INT8 links to jedi_id because SERIAL8
);

--SELECT * FROM jedi;

INSERT INTO jedi (name, age, darkside)
VALUES ('Luke', 21, false);

INSERT INTO jedi (name, darkside, age)
VALUES ('Darth Vader', true, 100);

INSERT INTO jedi (name, age)
VALUES ('Obi Wan', 33);

-- SELECT * FROM jedi;
-- SELECT name FROM jedi;
-- SELECT COUNT(*) FROM jedi;
-- SELECT * FROM jedi WHERE name = 'Obi Wan';

-- UPDATE jedi
-- SET darkside = true;
--
-- UPDATE jedi
-- SET darkside = false
-- WHERE name = 'Luke' OR name = 'Obi Wan';
--
-- UPDATE jedi
-- SET darkside = false
-- WHERE name = 'Obi Wan' AND age = 33;

-- INSERT INTO jedi (name, darkside, age)
-- VALUES ('Anakin', false, 12);
--
-- UPDATE jedi
-- SET age = 22
-- WHERE name = 'Anakin';
--
-- UPDATE jedi
-- SET darkside = true
-- WHERE name = 'Anakin';

DELETE FROM jedi WHERE name = 'Luke' AND age = 21;

INSERT INTO jedi (name, age, darkside)
VALUES ('Obi Wan', 32, false);

-- SELECT * FROM jedi;

INSERT INTO lightsabers (colour, hilt_metal, jedi_id)
VALUES ('green', 'gold', 3);

INSERT INTO lightsabers (colour, hilt_metal, jedi_id)
VALUES ('blue', 'iron', 4);

-- INSERT INTO lightsabers (colour)
-- VALUES ('red'); --returns error (no hilt_metal)

-- UPDATE lightsabers
-- SET id = 1;

SELECT * FROM jedi;
