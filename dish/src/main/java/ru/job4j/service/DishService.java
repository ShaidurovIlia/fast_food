package ru.job4j.service;

import ru.job4j.model.Dish;

import java.util.List;
import java.util.Optional;

public interface DishService {
    Optional<Dish> addDish(Dish Dish);

    Optional<Dish> editDish(Dish dish);

    boolean deleteDish(Dish dish);

    Optional<Dish> findById(int id);

    List<Dish> findAllDishes();
}
