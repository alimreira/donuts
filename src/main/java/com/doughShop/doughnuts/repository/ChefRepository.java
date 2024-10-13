package com.doughShop.doughnuts.repository;

import com.doughShop.doughnuts.entity.Chef;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface ChefRepository extends JpaRepository<Chef,Long> {
    Chef findByName (String name);

    Optional<Chef> findById (Long id);

    List<Chef> findByNameOrAge (String name, int age);

    List<Chef> findByNameAndAge (String name, int age);

    Chef findDistinctByAge (int age);

    List<Chef> findBySalaryGreaterThan (BigDecimal salary);

    List<Chef> findBySalaryLessThan (BigDecimal salary);

    List<Chef> findByShiftContaining (String shift);

    List<Chef> findByShiftLike (String shift);

    List<Chef> findBySalaryBetween (BigDecimal startSalary, BigDecimal endSalary);

//    List<Pastry> findByDateCreatedBetween (LocalDateTime startDate, LocalDateTime endDate);

    List<Chef> findByAgeIn (List<Integer> inn);

    List<Chef> findFirst2ByOrderByNameAsc ();

    List<Chef> findTop3ByOrderByAgeDesc ();



}


//    private long id;
//    private String name;
//    private String culinary;
//    private int age;
//    private float salary;
//    private String shift;
//    @Column(unique = true)
//    private String contact;