package com.doughShop.doughnuts.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name ="bike")
public class DeliveryBike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String deliveryLocation;
    private BigDecimal costOfDelivery;
    private String customerContact;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rider_id", referencedColumnName = "id")
    private Rider rider;

    @Override
    public String toString() {
        return "DeliveryBike{" +
                "id=" + id +
                ", deliveryLocation='" + deliveryLocation + '\'' +
                ", costOfDelivery=" + costOfDelivery +
                ", customerContact='" + customerContact + '\'' +
                ", rider=" + (rider != null ? rider.getId() : "null") +
                '}';
    }
}
