package ru.job4j.model.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
