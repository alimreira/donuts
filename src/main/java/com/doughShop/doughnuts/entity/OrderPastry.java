package com.doughShop.doughnuts.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sales")
public class OrderPastry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String items;
    @CreationTimestamp
    private LocalDateTime orderCreation;
    @UpdateTimestamp
    private LocalDateTime orderUpdate;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;


    @Override
    public String toString() {
        return "OrderPastry{" +
                "id=" + id +
                ", items='" + items + '\'' +
                ", orderCreation=" + orderCreation +
                ", orderUpdate=" + orderUpdate +
                ", customer=" + (customer != null ? customer.getId() : null) +
                '}';
    }
}
