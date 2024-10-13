package com.doughShop.doughnuts.repository;

import com.doughShop.doughnuts.entity.Cashier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CashierRepository extends JpaRepository<Cashier,Long> {


}
