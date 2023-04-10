CREATE TABLE IF NOT EXISTS dish (
    id SERIAL PRIMARY KEY,
    name VARCHAR unique NOT NULL,
    description VARCHAR,
    photo bytea,
    price INT NOT NULL
);