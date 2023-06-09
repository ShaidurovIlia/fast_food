package ru.job4j.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @EqualsAndHashCode.Include
    private long id;
    private LocalDateTime created = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    private String address;

    @OneToMany
    @JoinTable(name = "order_dishes",
            joinColumns = { @JoinColumn(name = "order_id") },
            inverseJoinColumns = { @JoinColumn(name = "dish_id") })
    private List<Dish> dishes;
    private int sum;
    @Enumerated(EnumType.STRING)
    private Status status;
}
