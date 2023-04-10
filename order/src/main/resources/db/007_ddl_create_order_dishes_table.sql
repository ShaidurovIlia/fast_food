CREATE TABLE order_dishes (
    id serial PRIMARY KEY,
    order_id INT references orders(id),
    dish_id INT references dish(id)
);