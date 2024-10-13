package com.doughShop.doughnuts.repository;

import com.doughShop.doughnuts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

   List<Customer> findByName (String name);

    List<Customer> findByNameAndAmount (String name, BigDecimal amount);

    List<Customer> findByNameOrAmount (String name, BigDecimal amount);

    Customer findDistinctByName (String name);

    List<Customer> findByAmountGreaterThanOrderByAmountDesc (BigDecimal amount);

    List<Customer> findByAmountLessThan (BigDecimal amount);

    List<Customer> findByNameContaining (String name);

    List<Customer> findByNameLike (String name);

    List<Customer> findByAmountBetween (BigDecimal startPrice,BigDecimal endPrice);

//    List<Customer> findByDateCreatedBetween (LocalDateTime startDate, LocalDateTime endDate);
    List<Customer> findByAmountIn (List<BigDecimal> amountList);

    List<Customer> findTop3ByOrderByAmountDesc ();

    List<Customer> findFirst2ByOrderByAmountAsc ();

}
