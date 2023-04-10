CREATE TABLE IF NOT EXISTS card (
    id serial PRIMARY KEY NOT NULL,
    number VARCHAR unique NOT NULL,
    discount double precision NOT NULL,
    customer_id INT NOT NULL references customer(id)
);