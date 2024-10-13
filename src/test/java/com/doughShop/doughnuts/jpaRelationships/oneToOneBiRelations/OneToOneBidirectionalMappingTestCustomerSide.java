package com.doughShop.doughnuts.jpaRelationships.oneToOneBiRelations;

import com.doughShop.doughnuts.entity.Customer;
//import com.doughShop.doughnuts.entity.DeliveryBike;
import com.doughShop.doughnuts.entity.OrderPastry;
import com.doughShop.doughnuts.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@SpringBootTest
public class OneToOneBidirectionalMappingTestCustomerSide {
    @Autowired
    private CustomerRepository customerRepository;

    @Test
    void saveACustomer () {
//        Customer customer = new Customer();
//        customer.setName("Shine");
//        customer.setAmount(new BigDecimal(2167f));
//
//        DeliveryBike deliveryBike = new DeliveryBike();
//        deliveryBike.setCostOfDelivery(new BigDecimal(500));
//        deliveryBike.setDeliveryLocation("Gbagada");
//        deliveryBike.setCustomerContact("231_789_000");
//        deliveryBike.setRiderName("Ali");
//        customer.setDeliveryBike(deliveryBike);
//
//
//        OrderPastry order = new OrderPastry();
//        order.setItems("Meat pies");
//        customer.setOrderPastry(order);
//        order.setCustomer(customer);
//        customerRepository.save(customer);

    }

//    @Test
//    void updateCustomerMethod () {
//        Optional<Customer> op = customerRepository.findById(3L);
//        Customer customer = op.get();
//        customer.setName("April");
//        customer.getOrderPastry().setItems("Sausages and dinner rolls");
//        Customer cr = customerRepository.save(customer);
//        System.out.println(cr.toString());
//    }
//
//    @Test
//    void findAllCustomersMethod () {
//      List<Customer> customers = customerRepository.findAll();
//      customers.stream().forEach((c)-> System.out.println(c));
//    }
}
