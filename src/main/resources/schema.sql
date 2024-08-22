DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS authorities;

CREATE TABLE users
(
    id       SERIAL PRIMARY KEY,
    username VARCHAR(45) NOT NULL,
    password VARCHAR(45) NOT NULL,
    enabled  BOOLEAN     NOT NULL
);

CREATE TABLE authorities
(
    id        SERIAL PRIMARY KEY,
    username  VARCHAR(45) NOT NULL,
    authority VARCHAR(45) NOT NULL
);
