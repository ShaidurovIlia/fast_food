CREATE TABLE IF NOT EXISTS customer (
    id SERIAL PRIMARY KEY,
    username VARCHAR unique NOT NULL,
    password VARCHAR NOT NULL,
    phone VARCHAR unique NOT NULL,
    email VARCHAR unique NOT NULL
 );