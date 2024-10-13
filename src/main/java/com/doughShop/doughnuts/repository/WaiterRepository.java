package com.doughShop.doughnuts.repository;

import com.doughShop.doughnuts.entity.Waiter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WaiterRepository extends JpaRepository<Waiter,Long> {

}
