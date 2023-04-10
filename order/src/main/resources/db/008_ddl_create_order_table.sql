CREATE TABLE orders (
    id serial PRIMARY KEY NOT NULL,
    created TIMESTAMP NOT NULL,
    address VARCHAR unique NOT NULL,
    sum INT NOT NULL,
    status VARCHAR NOT NULL,
    customer_id INT NOT NULL references customer(id)
);