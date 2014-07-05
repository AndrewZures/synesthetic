CREATE TABLE users (
  id SERIAL PRIMARY KEY,
  first_name TEXT,
  last_name TEXT,
  entry_id INT
);

CREATE TABLE entries (
  id SERIAL PRIMARY KEY,
  name TEXT
);
