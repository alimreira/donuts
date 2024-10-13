package com.doughShop.doughnuts.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "kitchen_staff")
public class Chef {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String culinary;
    private int age;
    private BigDecimal salary;
    private String shift;
    @Column(unique = true)
    private String contact;


}
