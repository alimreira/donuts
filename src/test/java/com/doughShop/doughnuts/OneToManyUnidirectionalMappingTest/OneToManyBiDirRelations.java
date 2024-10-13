package com.doughShop.doughnuts.OneToManyUnidirectionalMappingTest;

import com.doughShop.doughnuts.entity.DeliveryBike;
import com.doughShop.doughnuts.entity.Rider;
import com.doughShop.doughnuts.repository.CustomerRepository;
import com.doughShop.doughnuts.repository.DeliveryBikeRepository;
import com.doughShop.doughnuts.repository.RiderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import javax.persistence.Table;
import java.math.BigDecimal;

@SpringBootTest
public class OneToManyBiDirRelations {

    @Autowired
    private DeliveryBikeRepository deliveryBikeRepository;

    @Autowired
    private RiderRepository riderRepository;

    @Test
    void saveARiderToMultipleDeliveryBikes () {
//       DeliveryBike delivery =  deliveryBikeRepository.findById(2L).get().getDeliveryBike();
//       delivery.getRiderName(delivery.getRiderName())
        Rider rider = new Rider();
        rider.setContact("78-125-000");
        rider.setName("Idris");
        rider.setRoute("Kosofe");
        riderRepository.save(rider);

        DeliveryBike deliveryBike = new DeliveryBike();
        deliveryBike.setDeliveryLocation(deliveryBikeRepository.findById(5L).get().getDeliveryLocation());
        deliveryBike.setCustomerContact(deliveryBikeRepository.findById(5L).get().getCustomerContact());
        deliveryBike.setRider(rider);
        deliveryBike.setCostOfDelivery(deliveryBikeRepository.findById(5L).get().getCostOfDelivery());


        DeliveryBike deliveryBike1 = new DeliveryBike();
        deliveryBike1.setRider(rider);
        deliveryBike1.setCostOfDelivery(deliveryBikeRepository.findById(2L).get().getCostOfDelivery());
        deliveryBike1.setDeliveryLocation(deliveryBikeRepository.findById(2L).get().getDeliveryLocation());
        deliveryBike1.setCustomerContact(deliveryBikeRepository.findById(2L).get().getCustomerContact());

        rider.getDeliveryBikeList().add(deliveryBike);
        rider.getDeliveryBikeList().add(deliveryBike1);

        deliveryBikeRepository.save(deliveryBike);
        deliveryBikeRepository.save(deliveryBike1);

    }

    @Test
    void saveMultipleRidersToMultipleDeliveryBikes () {
        Rider rider = new Rider();
        rider.setName("Farouk");
        rider.setContact("56-328-000");
        rider.setRoute("Lagos Island-West");

        DeliveryBike deliveryBike = new DeliveryBike();
        deliveryBike.setDeliveryLocation(deliveryBikeRepository.findById(8L).get().getDeliveryLocation());
        deliveryBike.setCostOfDelivery(deliveryBikeRepository.findById(8L).get().getCostOfDelivery());
        deliveryBike.setRider(rider);
        deliveryBike.setCustomerContact(deliveryBikeRepository.findById(8L).get().getCustomerContact());

        DeliveryBike  deliveryBike1 = new DeliveryBike();
        deliveryBike1.setRider(rider);
        deliveryBike1.setDeliveryLocation(deliveryBikeRepository.findById(10L).get().getDeliveryLocation());
        deliveryBike1.setCostOfDelivery(deliveryBikeRepository.findById(10L).get().getCostOfDelivery());
        deliveryBike1.setCustomerContact(deliveryBikeRepository.findById(10L).get().getCustomerContact());

        DeliveryBike deliveryBike2 = new DeliveryBike();
        deliveryBike2.setRider(rider);
        deliveryBike2.setCustomerContact(deliveryBikeRepository.findById(7L).get().getCustomerContact());
        deliveryBike2.setDeliveryLocation(deliveryBikeRepository.findById(7L).get().getDeliveryLocation());
        deliveryBike2.setCustomerContact(deliveryBikeRepository.findById(7L).get().getCustomerContact());

        DeliveryBike deliveryBike3 = new DeliveryBike();
        deliveryBike3.setRider(rider);
        deliveryBike3.setCustomerContact(deliveryBikeRepository.findById(9L).get().getCustomerContact());
        deliveryBike3.setDeliveryLocation(deliveryBikeRepository.findById(9L).get().getDeliveryLocation());
        deliveryBike3.setCostOfDelivery(deliveryBikeRepository.findById(9L).get().getCostOfDelivery());

        rider.getDeliveryBikeList().add(deliveryBike);
        rider.getDeliveryBikeList().add(deliveryBike1);
        rider.getDeliveryBikeList().add(deliveryBike2);
        rider.getDeliveryBikeList().add(deliveryBike3);
        riderRepository.save(rider);

        deliveryBikeRepository.saveAll(rider.getDeliveryBikeList());
    }
}



