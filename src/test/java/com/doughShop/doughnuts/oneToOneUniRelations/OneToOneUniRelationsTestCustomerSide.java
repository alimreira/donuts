package com.doughShop.doughnuts.oneToOneUniRelations;

import com.doughShop.doughnuts.entity.Customer;
import com.doughShop.doughnuts.entity.DeliveryBike;
import com.doughShop.doughnuts.entity.OrderPastry;
import com.doughShop.doughnuts.entity.Waiter;
import com.doughShop.doughnuts.repository.CustomerRepository;
import com.doughShop.doughnuts.repository.WaiterRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SpringBootTest
public class OneToOneUniRelationsTestCustomerSide {
    @Autowired
    private CustomerRepository customerRepository;


    @Test
    void saveACustomerMethod () {
        Customer customer = new Customer();
        customer.setName("Kevwe");
        customer.setAmount(new BigDecimal(4500));

        DeliveryBike deliveryBike = new DeliveryBike();
        deliveryBike.setCostOfDelivery(new BigDecimal(500));
        deliveryBike.setDeliveryLocation("Gbagada");
        deliveryBike.setCustomerContact("231_789_000");
        customer.setDeliveryBike(deliveryBike);

        OrderPastry orderPastry = new OrderPastry();
        orderPastry.setItems("muffins and eggrolls");
        orderPastry.setCustomer(customer);
        customer.setOrderPastry(orderPastry);
        customerRepository.save(customer);

    }

    @Test
    void saveAllCustomersMethod () {
        List<Customer> customerList = new ArrayList<>();
        Customer customer = new Customer();
        customer.setName("Vivian");
        customer.setAmount(new BigDecimal(3800));

        OrderPastry orderPastry = new OrderPastry();
        orderPastry.setCustomer(customer);
        orderPastry.setItems("puff puff and youghurt");
        customer.setOrderPastry(orderPastry);
        orderPastry.setCustomer(customer);

        DeliveryBike deliveryBike = new DeliveryBike();
        deliveryBike.setCostOfDelivery(new BigDecimal(3500));
        deliveryBike.setDeliveryLocation("Lekki");
        deliveryBike.setCustomerContact("432_400_000");
        customer.setDeliveryBike(deliveryBike);
        customerList.add(customer);
//        customerRepository.save(customer);


        Customer customer1 = new Customer();
        customer1.setName("Uriel");
        customer1.setAmount(new BigDecimal(2000));

        DeliveryBike deliveryBike1 = new DeliveryBike();
        deliveryBike1.setDeliveryLocation("Yaba");
        deliveryBike1.setCustomerContact("675_780_000");
        deliveryBike1.setCostOfDelivery(new BigDecimal(300));
        customer1.setDeliveryBike(deliveryBike1);

        OrderPastry orderPastry1 = new OrderPastry();
        orderPastry1.setItems("Ring doughnuts and burger");
        orderPastry1.setCustomer(customer1);
        customer1.setOrderPastry(orderPastry1);
        customerList.add(customer1);
//        customerRepository.save(customer1);

        Customer customer2 = new Customer();
        customer2.setAmount(new BigDecimal(4100));
        customer2.setName("Grace");
        OrderPastry orderPastry2 = new OrderPastry();
        orderPastry2.setCustomer(customer2);
        orderPastry2.setItems("meatpie and jam doughnuts");
        customer2.setOrderPastry(orderPastry2);
        orderPastry2.setCustomer(customer2);
        DeliveryBike deliveryBike2 = new DeliveryBike();
        deliveryBike2.setCostOfDelivery(new BigDecimal(340));
        deliveryBike2.setDeliveryLocation("Bariga");
        deliveryBike2.setCustomerContact("678_680_000");
        customer2.setDeliveryBike(deliveryBike2);
        customerList.add(customer2);
//        customerRepository.save(customer2);

        Customer customer3 = new Customer();
        customer3.setName("Ibrahim");
        customer3.setAmount(new BigDecimal(3200f));
        OrderPastry orderPastry3 = new OrderPastry();
        orderPastry3.setItems("spring rolls and chin-chin");
        orderPastry3.setCustomer(customer3);
        customer3.setOrderPastry(orderPastry3);
        DeliveryBike deliveryBike3 = new DeliveryBike();
        deliveryBike3.setCustomerContact("210_560_000");
        deliveryBike3.setDeliveryLocation("Ketu");
        deliveryBike3.setCostOfDelivery(new BigDecimal(430));
        customer3.setDeliveryBike(deliveryBike3);
        customerList.add(customer3);
//        customerRepository.save(customer3);

        Customer customer4 = new Customer();
        customer4.setAmount(new BigDecimal(2700));
        customer4.setName("Khalid");

        DeliveryBike deliveryBike4 = new DeliveryBike();
        deliveryBike4.setDeliveryLocation("Oshodi");
        deliveryBike4.setCustomerContact("345_213_000");
        deliveryBike4.setCostOfDelivery(new BigDecimal(450));
        customer4.setDeliveryBike(deliveryBike4);

        OrderPastry orderPastry4 = new OrderPastry();
        orderPastry4.setCustomer(customer4);
        orderPastry4.setItems("Burger and chips");
        customer4.setOrderPastry(orderPastry4);
        orderPastry4.setCustomer(customer4);
        customerList.add(customer4);
//        customerRepository.save(customer4);
        customerRepository.saveAll(customerList);


    }

    @Test
    void findByNameMethod () {
       List<Customer> customer = customerRepository.findByName("Khalid");
        Iterator it = customer.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    @Test
    void findByNameAndAmountTestMethod () {
        List<Customer> customers = customerRepository.findByNameAndAmount("Uriel",new BigDecimal(2000));
        customers.stream().forEach((c)-> System.out.println(c));
    }

    @Test
    void findByNameOrAmountTestMethod () {
        List<Customer> customers = customerRepository.findByNameOrAmount("April",new BigDecimal(1500));
        customers.stream().forEach((c)-> System.out.println(c));
    }

    @Test
    void findDistinctByNameMethod () {
        Customer customer = customerRepository.findDistinctByName("Michael");
        System.out.println(customer);
    }

    @Test
    void findfindByAmountGreaterThanOrderByAmountDescMethod () {
        List<Customer> customers = customerRepository.findByAmountGreaterThanOrderByAmountDesc(new BigDecimal(3000));
        customers.stream().forEach((c)-> System.out.println(c));
    }

    @Test
    void findByAmountLessThanMethod () {
        List<Customer> customers = customerRepository.findByAmountLessThan(new BigDecimal(2000));
        customers.stream().forEach((c)-> System.out.println(c));
    }

    @Test
    void findByNameContainingMethod () {
       List<Customer> customers =  customerRepository.findByNameContaining("Kha");
       customers.stream().forEach((c)-> System.out.println(c));
    }

    @Test
    void findByNameLikeMethod () {
        List<Customer> customers = customerRepository.findByNameLike("Uriel");
        customers.stream().forEach((c)-> System.out.println(c));
    }

    @Test
    void findByAmountBetweenTestMethod () {
        List<Customer> customers = customerRepository.findByAmountBetween(new BigDecimal(3000), new BigDecimal(5000));
        customers.stream().forEach((c)-> System.out.println(c));
    }


@Test
void findByAmountInTestMethod() {
    List<BigDecimal> amountList = List.of(new BigDecimal(1500), new BigDecimal(2100), new BigDecimal(3200), new BigDecimal(2700));
    List<Customer> customers = customerRepository.findByAmountIn(amountList);
    customers.stream().forEach((c)-> System.out.println(c));
}

    @Test
    void findTop3ByOrderByAmountDescMethod() {
        List<Customer> customers = customerRepository.findTop3ByOrderByAmountDesc();
        customers.forEach(System.out::println);
    }

    @Test
    void findFirst2ByAmounMethod () {
        List<Customer> customer = customerRepository.findFirst2ByOrderByAmountAsc();
        System.out.println(customer);
    }
}
