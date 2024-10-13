package com.doughShop.doughnuts.jpaRelationships.oneToOneBiRelations;

import com.doughShop.doughnuts.entity.Customer;
import com.doughShop.doughnuts.entity.DeliveryBike;
import com.doughShop.doughnuts.entity.OrderPastry;
import com.doughShop.doughnuts.entity.Waiter;
import com.doughShop.doughnuts.repository.OrderPastryRepository;
import com.doughShop.doughnuts.repository.WaiterRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
public class OneToOneBidirectionalMappingTestOrderSide {
    @Autowired
    private OrderPastryRepository orderPastryRepository;


    @Test
      void saveAnOrderMethod () {
        Customer customer = new Customer();
        customer.setName("Shine");
        customer.setAmount(new BigDecimal(2167f));

        DeliveryBike deliveryBike = new DeliveryBike();
        deliveryBike.setCostOfDelivery(new BigDecimal(500));
        deliveryBike.setDeliveryLocation("Gbagada");
        deliveryBike.setCustomerContact("231_789_000");
        customer.setDeliveryBike(deliveryBike);


        OrderPastry order = new OrderPastry();
        order.setItems("Meat pies");
        customer.setOrderPastry(order);
        order.setCustomer(customer);
        orderPastryRepository.save(order);
    }

    @Test
    void saveAllOrdersMethod () {
        List<OrderPastry> orderPastryList = new ArrayList<>();
        //first
        OrderPastry orderPastry = new OrderPastry();
        orderPastry.setItems("Doughnuts with jam");

        Customer customer = new Customer();
        customer.setAmount(new BigDecimal(3500f));
        customer.setName("Samuel");

        DeliveryBike deliveryBike = new DeliveryBike();
        deliveryBike.setCostOfDelivery(new BigDecimal(480));
        deliveryBike.setDeliveryLocation("Houston");
        deliveryBike.setCustomerContact("231_777_000");
        customer.setDeliveryBike(deliveryBike);

        orderPastry.setCustomer(customer);

        customer.setOrderPastry(orderPastry);
        orderPastryList.add(orderPastry);

        //second
        OrderPastry orderPastry1 = new OrderPastry();
        orderPastry1.setItems("Sausages and drinks");

        Customer customer1 = new Customer();
        customer1.setName("Dan");
        customer1.setAmount(new BigDecimal(4000f));

        DeliveryBike deliveryBike1 = new DeliveryBike();
        deliveryBike1.setCostOfDelivery(new BigDecimal(900));
        deliveryBike1.setDeliveryLocation("Michighan");
        deliveryBike1.setCustomerContact("221_777_000");
        customer1.setDeliveryBike(deliveryBike1);

        orderPastry1.setCustomer(customer1);

        customer1.setOrderPastry(orderPastry1);
        orderPastryList.add(orderPastry1);

        //third
        OrderPastry orderPastry2 = new OrderPastry();
        orderPastry2.setItems("Cupcakes and cookies");

        Customer customer2 = new Customer();
        customer2.setName("Khadijat");
        customer2.setAmount(new BigDecimal(4230f));
        DeliveryBike deliveryBike2 = new DeliveryBike();
        deliveryBike2.setCostOfDelivery(new BigDecimal(700));
        deliveryBike2.setDeliveryLocation("Chigago");
        deliveryBike2.setCustomerContact("291_707_000");
        customer2.setDeliveryBike(deliveryBike2);

        orderPastry2.setCustomer(customer2);
        customer2.setOrderPastry(orderPastry2);
        orderPastryList.add(orderPastry2);

        //fourth
        OrderPastry orderPastry3 = new OrderPastry();
        orderPastry3.setItems("Banana bread");

        Customer customer3 = new Customer();
        customer3.setName("Khalid");
        customer3.setAmount(new BigDecimal(5100f));

        DeliveryBike deliveryBike3 = new DeliveryBike();
        deliveryBike3.setCostOfDelivery(new BigDecimal(700));
        deliveryBike3.setDeliveryLocation("Indiana");
        deliveryBike3.setCustomerContact("298_704_000");
        customer3.setDeliveryBike(deliveryBike3);

        orderPastry3.setCustomer(customer3);
        customer3.setOrderPastry(orderPastry3);
        orderPastryList.add(orderPastry3);

        //fifth
        OrderPastry orderPastry4 = new OrderPastry();
        orderPastry4.setItems("Carrot bread and table water");
        Customer customer4 = new Customer();
        customer4.setName("Uriel");
        customer4.setAmount(new BigDecimal(5023f));

        DeliveryBike deliveryBike4 = new DeliveryBike();
        deliveryBike4.setCostOfDelivery(new BigDecimal(780));
        deliveryBike4.setDeliveryLocation("Maryland");
        deliveryBike4.setCustomerContact("218_754_000");
        customer4.setDeliveryBike(deliveryBike4);

        orderPastry4.setCustomer(customer4);
        customer4.setOrderPastry(orderPastry4);
        orderPastryList.add(orderPastry4);

        //sixth
        OrderPastry orderPastry5 = new OrderPastry();
        orderPastry5.setItems("Bread and mayonnaise");
        Customer customer5 = new Customer();
        customer5.setAmount(new BigDecimal(1500f));
        customer5.setName("Railey");

        DeliveryBike deliveryBike5 = new DeliveryBike();
        deliveryBike5.setCostOfDelivery(new BigDecimal(780));
        deliveryBike5.setDeliveryLocation("NewYork");
        deliveryBike5.setCustomerContact("618_754_000");
        customer5.setDeliveryBike(deliveryBike5);

        orderPastry5.setCustomer(customer5);

        customer5.setOrderPastry(orderPastry5);
        orderPastryList.add(orderPastry5);


        List<OrderPastry> orders = orderPastryRepository.saveAll(orderPastryList);
        orders.stream().forEach((c)-> System.out.println(c));


    }

    @Test
    void updateOrderMethod () {
        Optional<OrderPastry> op = orderPastryRepository.findById(3L);
        OrderPastry orderPastry = op.get();
        orderPastry.setItems("fruit cakes and lemon cake");
        orderPastry.getCustomer().setAmount(new BigDecimal(5000));
        OrderPastry cr = orderPastryRepository.save(orderPastry);
        System.out.println(cr.toString());
    }

    @Test
    void findAllCustomersMethod () {
        List<OrderPastry> customers = orderPastryRepository.findAll();
        customers.stream().forEach((c)-> System.out.println(c));
    }

    @Test
    void paginationOfOrderMethod () {
        int pageNo = 0;
        int pageSize = 2;
        Page pg = orderPastryRepository.findAll(PageRequest.of(pageNo,pageSize));
        List<OrderPastry> orderPastryList = pg.getContent();
        System.out.println(orderPastryList);

        System.out.println("Total pages " + pg.getTotalPages());
        System.out.println("Is first? " + pg.isFirst());
        System.out.println("Is last? " + pg.isLast());
        System.out.println("size " + pg.getSize());
        System.out.println("total pages " + pg.getTotalPages());
        System.out.println("number of elements "+ pg.getNumberOfElements());
        System.out.println("total elements " + pg.getTotalElements());
    }

    @Test
    void sortOrderMethod () {
        String sortBy ="items";
        String sortDir = "desc";
        List<OrderPastry> orderPastryList = orderPastryRepository.findAll(Sort.by(Sort.Direction.fromString(sortDir),sortBy));
        orderPastryList.stream().forEach((c)-> System.out.println(c));
    }

    @Test
    void paginateAndSort () {
        int pageNo = 0;
        int pageSize = 2;
        String sortDir ="asc";
        String sortBy = "items";

        Page pg  = orderPastryRepository.findAll(PageRequest.of(pageNo,pageSize,Sort.by(Sort.Direction.fromString(sortDir),sortBy)));
        pg.stream().forEach((c)-> System.out.println(c));

    }
}
