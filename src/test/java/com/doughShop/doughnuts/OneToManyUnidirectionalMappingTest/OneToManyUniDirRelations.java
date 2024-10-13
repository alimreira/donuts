package com.doughShop.doughnuts.ManyToOneUnidirectionalMappingTest;

import com.doughShop.doughnuts.entity.Customer;
import com.doughShop.doughnuts.entity.DeliveryBike;
import com.doughShop.doughnuts.entity.OrderPastry;
import com.doughShop.doughnuts.entity.Waiter;
import com.doughShop.doughnuts.repository.CustomerRepository;
import com.doughShop.doughnuts.repository.OrderPastryRepository;
import com.doughShop.doughnuts.repository.WaiterRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class OneToManyUniDirRelations {
    @Autowired
    private WaiterRepository waiterRepository;

    @Autowired
    private OrderPastryRepository orderPastryRepository;

//    @Autowired
//    private CustomerRepository customerRepository;



    @Test
    void saveAWaiterMethod () {
        Waiter waiter = new Waiter();
        waiter.setWage(new BigDecimal(340));
        waiter.setName("Jane");
        waiter.setShift("Morning");
        //create multiple customers and add to the waiter object
//
        Customer customer = new Customer();
        customer.setName(orderPastryRepository.findById(4L).get().getCustomer().getName());
        customer.setAmount(orderPastryRepository.findById(4L).get().getCustomer().getAmount());
//        customer.setName(customerRepository.findById(8L).get().getName());
//        customer.setAmount(customerRepository.findById(9L).get().getAmount());

        OrderPastry order = new OrderPastry();
        order.setItems(orderPastryRepository.findById(4L).get().getItems());
        //order.setItems(customerRepository.findById(8L).get().getOrderPastry().getItems());
        customer.setOrderPastry(order);
        order.setCustomer(customer);
        DeliveryBike deliveryBike = new DeliveryBike();
        deliveryBike.setCostOfDelivery(orderPastryRepository.findById(4L).get().getCustomer().getDeliveryBike().getCostOfDelivery());
        deliveryBike.setDeliveryLocation(orderPastryRepository.findById(4L).get().getCustomer().getDeliveryBike().getDeliveryLocation());
        deliveryBike.setCustomerContact(orderPastryRepository.findById(4L).get().getCustomer().getDeliveryBike().getCustomerContact());
        customer.setDeliveryBike(deliveryBike);

//
        waiter.getCustomerList().add(customer);

        Customer customer1 = new Customer();
        customer1.setName(orderPastryRepository.findById(5L).get().getCustomer().getName());
        customer1.setAmount(orderPastryRepository.findById(5L).get().getCustomer().getAmount());
        OrderPastry orderPastry1 = new OrderPastry();
        orderPastry1.setCustomer(customer);
        orderPastry1.setItems(orderPastryRepository.findById(5L).get().getItems());
        customer1.setOrderPastry(orderPastry1);
        DeliveryBike deliveryBike1 = new DeliveryBike();
        deliveryBike1.setCostOfDelivery(orderPastryRepository.findById(5L).get().getCustomer().getDeliveryBike().getCostOfDelivery());
        deliveryBike1.setDeliveryLocation(orderPastryRepository.findById(5L).get().getCustomer().getDeliveryBike().getDeliveryLocation());
        deliveryBike1.setCustomerContact(orderPastryRepository.findById(5L).get().getCustomer().getDeliveryBike().getCustomerContact());
        customer1.setDeliveryBike(deliveryBike1);

//        waiter.getCustomerList().add(customer1);
//        for(Customer cus : waiter.getCustomerList()){
//            if(cus.)
//        }
        waiterRepository.save(waiter);
    }

    @Test
    void saveAllWaitersMethod () {
        List<Waiter> waiterList = new ArrayList<>();
        Waiter waiter = new Waiter();
        //create multiple customers and add to the waiter object
//
        Customer customer = new Customer();
        customer.setName(orderPastryRepository.findById(1L).get().getCustomer().getName());
        customer.setAmount(orderPastryRepository.findById(1L).get().getCustomer().getAmount());
        OrderPastry order = new OrderPastry();
        order.setItems(orderPastryRepository.findById(1L).get().getItems());
        customer.setOrderPastry(order);
        order.setCustomer(customer);
        DeliveryBike deliveryBike = new DeliveryBike();
        deliveryBike.setCostOfDelivery(orderPastryRepository.findById(1L).get().getCustomer().getDeliveryBike().getCostOfDelivery());
        deliveryBike.setDeliveryLocation(orderPastryRepository.findById(1L).get().getCustomer().getDeliveryBike().getDeliveryLocation());
        deliveryBike.setCustomerContact(orderPastryRepository.findById(1L).get().getCustomer().getDeliveryBike().getCustomerContact());
        customer.setDeliveryBike(deliveryBike);


        Customer customer1 = new Customer();
        customer1.setName(orderPastryRepository.findById(3L).get().getCustomer().getName());
        customer1.setAmount(orderPastryRepository.findById(3L).get().getCustomer().getAmount());
        OrderPastry orderPastry1 = new OrderPastry();
        orderPastry1.setCustomer(customer);
        orderPastry1.setItems(orderPastryRepository.findById(3L).get().getItems());
        customer1.setOrderPastry(orderPastry1);
        DeliveryBike deliveryBike1 = new DeliveryBike();
        deliveryBike1.setCostOfDelivery(orderPastryRepository.findById(3L).get().getCustomer().getDeliveryBike().getCostOfDelivery());
        deliveryBike1.setDeliveryLocation(orderPastryRepository.findById(3L).get().getCustomer().getDeliveryBike().getDeliveryLocation());
        deliveryBike1.setCustomerContact(orderPastryRepository.findById(3L).get().getCustomer().getDeliveryBike().getCustomerContact());
        customer1.setDeliveryBike(deliveryBike1);

        waiter.setWage(new BigDecimal(450));
        waiter.setName("Andrew");
        waiter.setShift("Afternoon");
        waiter.getCustomerList().add(customer);
        waiter.getCustomerList().add(customer1);
        waiterList.add(waiter);

        //create multiple customers and add to the waiter object
//

        Waiter waiter1 = new Waiter();

        Customer customer2 = new Customer();
        customer2.setName(orderPastryRepository.findById(6L).get().getCustomer().getName());
        customer2.setAmount(orderPastryRepository.findById(6L).get().getCustomer().getAmount());
        OrderPastry order1 = new OrderPastry();
        order1.setItems(orderPastryRepository.findById(6L).get().getItems());
        customer2.setOrderPastry(order1);
        order1.setCustomer(customer);
        DeliveryBike deliveryBike2 = new DeliveryBike();
        deliveryBike2.setCostOfDelivery(orderPastryRepository.findById(6L).get().getCustomer().getDeliveryBike().getCostOfDelivery());
        deliveryBike2.setDeliveryLocation(orderPastryRepository.findById(6L).get().getCustomer().getDeliveryBike().getDeliveryLocation());
        deliveryBike2.setCustomerContact(orderPastryRepository.findById(6L).get().getCustomer().getDeliveryBike().getCustomerContact());
        customer2.setDeliveryBike(deliveryBike2);
//
        Customer customer3 = new Customer();
        customer3.setName(orderPastryRepository.findById(7L).get().getCustomer().getName());
        customer3.setAmount(orderPastryRepository.findById(7L).get().getCustomer().getAmount());
        OrderPastry orderPastry2 = new OrderPastry();
        orderPastry2.setCustomer(customer3);
        orderPastry2.setItems(orderPastryRepository.findById(7L).get().getItems());
        customer3.setOrderPastry(orderPastry1);
        DeliveryBike deliveryBike3 = new DeliveryBike();
        deliveryBike3.setCostOfDelivery(orderPastryRepository.findById(7L).get().getCustomer().getDeliveryBike().getCostOfDelivery());
        deliveryBike3.setDeliveryLocation(orderPastryRepository.findById(7L).get().getCustomer().getDeliveryBike().getDeliveryLocation());
        deliveryBike3.setCustomerContact(orderPastryRepository.findById(7L).get().getCustomer().getDeliveryBike().getCustomerContact());
        customer3.setDeliveryBike(deliveryBike3);

        waiter1.setWage(new BigDecimal(680));
        waiter1.setName("Yinka");
        waiter1.setShift("Afternoon");
        waiter1.getCustomerList().add(customer3);
        waiter1.getCustomerList().add(customer2);
        waiterList.add(waiter1);


        //create multiple customers and add to the waiter object
//
        Waiter waiter2 = new Waiter();

        Customer customer4 = new Customer();
        customer4.setName(orderPastryRepository.findById(11L).get().getCustomer().getName());
        customer4.setAmount(orderPastryRepository.findById(11L).get().getCustomer().getAmount());
        OrderPastry order2 = new OrderPastry();
        order2.setItems(orderPastryRepository.findById(11L).get().getItems());
        customer4.setOrderPastry(order2);
        order2.setCustomer(customer4);
        DeliveryBike deliveryBike4 = new DeliveryBike();
        deliveryBike4.setCostOfDelivery(orderPastryRepository.findById(11L).get().getCustomer().getDeliveryBike().getCostOfDelivery());
        deliveryBike4.setDeliveryLocation(orderPastryRepository.findById(11L).get().getCustomer().getDeliveryBike().getDeliveryLocation());
        deliveryBike4.setCustomerContact(orderPastryRepository.findById(11L).get().getCustomer().getDeliveryBike().getCustomerContact());
        customer4.setDeliveryBike(deliveryBike4);


        Customer customer5 = new Customer();
        customer5.setName(orderPastryRepository.findById(12L).get().getCustomer().getName());
        customer5.setAmount(orderPastryRepository.findById(12L).get().getCustomer().getAmount());
        OrderPastry orderPastry3 = new OrderPastry();
        orderPastry3.setCustomer(customer);
        orderPastry3.setItems(orderPastryRepository.findById(12L).get().getItems());
        customer5.setOrderPastry(orderPastry3);
        DeliveryBike deliveryBike5 = new DeliveryBike();
        deliveryBike5.setCostOfDelivery(orderPastryRepository.findById(12L).get().getCustomer().getDeliveryBike().getCostOfDelivery());
        deliveryBike5.setDeliveryLocation(orderPastryRepository.findById(12L).get().getCustomer().getDeliveryBike().getDeliveryLocation());
        deliveryBike5.setCustomerContact(orderPastryRepository.findById(12L).get().getCustomer().getDeliveryBike().getCustomerContact());
        customer5.setDeliveryBike(deliveryBike5);

        waiter2.setWage(new BigDecimal(680));
        waiter2.setName("Mary");
        waiter2.setShift("Evening");
        waiter2.getCustomerList().add(customer5);
        waiter2.getCustomerList().add(customer4);
        waiterList.add(waiter2);



        //create multiple customers and add to the waiter object
//
        Waiter waiter3 = new Waiter();

        Customer customer6 = new Customer();
        customer6.setName(orderPastryRepository.findById(8L).get().getCustomer().getName());
        customer6.setAmount(orderPastryRepository.findById(8L).get().getCustomer().getAmount());
        OrderPastry order4 = new OrderPastry();
        order4.setItems(orderPastryRepository.findById(8L).get().getItems());
        customer6.setOrderPastry(order4);
        order.setCustomer(customer);
        DeliveryBike deliveryBike6 = new DeliveryBike();
        deliveryBike6.setCostOfDelivery(orderPastryRepository.findById(8L).get().getCustomer().getDeliveryBike().getCostOfDelivery());
        deliveryBike6.setDeliveryLocation(orderPastryRepository.findById(8L).get().getCustomer().getDeliveryBike().getDeliveryLocation());
        deliveryBike6.setCustomerContact(orderPastryRepository.findById(8L).get().getCustomer().getDeliveryBike().getCustomerContact());
        customer6.setDeliveryBike(deliveryBike6);
//
        Customer customer7 = new Customer();
        customer7.setName(orderPastryRepository.findById(9L).get().getCustomer().getName());
        customer7.setAmount(orderPastryRepository.findById(9L).get().getCustomer().getAmount());
        OrderPastry orderPastry4 = new OrderPastry();
        orderPastry4.setCustomer(customer);
        orderPastry4.setItems(orderPastryRepository.findById(9L).get().getItems());
        customer.setOrderPastry(orderPastry4);
        DeliveryBike deliveryBike7 = new DeliveryBike();
        deliveryBike7.setCostOfDelivery(orderPastryRepository.findById(9L).get().getCustomer().getDeliveryBike().getCostOfDelivery());
        deliveryBike7.setDeliveryLocation(orderPastryRepository.findById(9L).get().getCustomer().getDeliveryBike().getDeliveryLocation());
        deliveryBike7.setCustomerContact(orderPastryRepository.findById(9L).get().getCustomer().getDeliveryBike().getCustomerContact());
        customer7.setDeliveryBike(deliveryBike7);

        waiter3.setWage(new BigDecimal(340));
        waiter3.setName("Trey");
        waiter3.setShift("Evening");
        waiter3.getCustomerList().add(customer6);
        waiter3.getCustomerList().add(customer7);
        waiterList.add(waiter3);
        waiterRepository.saveAll(waiterList);

    }

    @Test
    void fetchWaiterMethod () {
      Waiter waiter = waiterRepository.findById(5L).get();
      System.out.println(waiter.getName());
      waiter.getCustomerList().stream().forEach((c)-> System.out.print(c.getId() + " "));

    }



}
