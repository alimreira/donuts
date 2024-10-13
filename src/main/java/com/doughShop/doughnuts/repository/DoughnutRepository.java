package com.doughShop.doughnuts.repository;

import com.doughShop.doughnuts.entity.DoughnutMaking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoughnutRepository extends JpaRepository<DoughnutMaking,Long> {

}
