package ru.job4j.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Dish {

    @EqualsAndHashCode.Include
    private long id;
    private String name;
    private String description;
    private byte[] photo;
    private BigDecimal price;
}
