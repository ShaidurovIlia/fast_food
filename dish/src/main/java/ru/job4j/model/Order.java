package ru.job4j.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Order {

    @EqualsAndHashCode.Include
    private long id;
    private LocalDateTime created = LocalDateTime.now();
    private Customer customer;
    private String address;
    private String status;
    private List<Dish> dishes = new ArrayList<>();
    private BigDecimal sum;
}
