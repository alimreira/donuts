package com.doughShop.doughnuts.repository;

import com.doughShop.doughnuts.entity.Shift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShiftRepository extends JpaRepository<Shift,Long> {
}
