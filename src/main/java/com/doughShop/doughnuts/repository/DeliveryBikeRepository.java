package com.doughShop.doughnuts.repository;

import com.doughShop.doughnuts.entity.DeliveryBike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryBikeRepository extends JpaRepository<DeliveryBike,Long> {

}
