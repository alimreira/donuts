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
@Table(name = "buyer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private BigDecimal amount;
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "customer")
    private OrderPastry orderPastry;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "delivery_id", referencedColumnName = "id")
    private DeliveryBike deliveryBike;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", orderPastry=" + orderPastry +
                ", deliveryBike=" + deliveryBike +
                '}';
    }
}
