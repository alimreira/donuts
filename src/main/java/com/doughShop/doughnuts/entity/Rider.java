package com.doughShop.doughnuts.entity;

import lombok.Data;
import org.springframework.data.domain.PageRequest;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "ride")
public class Rider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String route;
    private String contact;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "rider")
    List<DeliveryBike> deliveryBikeList = new ArrayList<>();

    @Override
    public String toString() {
        return "Rider{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", route='" + route + '\'' +
                ", contact='" + contact + '\'' +
                ", deliveryBikeList=" + deliveryBikeList +
                '}';
    }
}
