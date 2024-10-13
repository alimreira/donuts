package com.doughShop.doughnuts.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "waiter")
public class Waiter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private BigDecimal wage;
    private String shift;

    //The default fetch type for @OneToMany is Lazy. However, we will use Eager here
    //@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "waiter_id", referencedColumnName = "id")
    private List<Customer> customerList = new ArrayList<>();
}
