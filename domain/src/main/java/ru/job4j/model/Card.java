package ru.job4j.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;

import javax.persistence.*;

@Data
@AutoConfigureAfter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "card")
public class Card {

    @Id
    @EqualsAndHashCode.Include
    private long id;
    private String number;
    private double discount;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
