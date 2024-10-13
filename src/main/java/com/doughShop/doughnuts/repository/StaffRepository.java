package com.doughShop.doughnuts.repository;

import com.doughShop.doughnuts.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff,Long> {
}
