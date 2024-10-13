package com.doughShop.doughnuts.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "cash")
public class Cashier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameOfCashier;
    private BigDecimal salary;
    private int age;
    private String gender;

    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(
            name = "cashier_customer",
            joinColumns = @JoinColumn(
                    name = "cashier_id", referencedColumnName = "id"

            ),
            inverseJoinColumns = @JoinColumn(
                    name = "customer_id",referencedColumnName = "id"
            )
    )
    private List<Customer> customerList = new ArrayList<>();
}
