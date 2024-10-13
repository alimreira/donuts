package com.doughShop.doughnuts.manyToManyUniDirRelations;

import com.doughShop.doughnuts.entity.*;
import com.doughShop.doughnuts.repository.CashierRepository;
import com.doughShop.doughnuts.repository.CustomerRepository;
import com.doughShop.doughnuts.repository.RiderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
public class ManyToManyUniTest {
    @Autowired
    private CashierRepository cashierRepository;

    @Autowired
    private RiderRepository riderRepository;


    @Test
    void saveACashier () {
        Cashier cashier = new Cashier();
        cashier.setNameOfCashier("Elizabeth");
        cashier.setAge(18);
        cashier.setGender("Female");
        cashier.setSalary(new BigDecimal(670));

        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setAmount(new BigDecimal(3400));
        customer.setName("Mirinda");
        OrderPastry orderPastry = new OrderPastry();
        orderPastry.setItems("Hotdogs and salad");
        orderPastry.setCustomer(customer);
        customer.setOrderPastry(orderPastry);

        List<DeliveryBike> deliveryBikeList = new ArrayList<>();
        DeliveryBike deliveryBike = new DeliveryBike();
        deliveryBike.setCostOfDelivery(new BigDecimal(450));
        deliveryBike.setDeliveryLocation("Lekki");
        deliveryBike.setCustomerContact("786_213_000");
        deliveryBikeList.add(deliveryBike);

        DeliveryBike deliveryBike1 = new DeliveryBike();
        deliveryBike.setCostOfDelivery(new BigDecimal(340));
        deliveryBike.setDeliveryLocation("Akure");
        deliveryBike.setCustomerContact("786_459_000");
        deliveryBikeList.add(deliveryBike1);
        customer.setDeliveryBike(deliveryBike);
        customer.setDeliveryBike(deliveryBike1);

        Optional<Rider> riding = riderRepository.findById(1L);
        Rider rider = new Rider();
        rider.setContact(riding.get().getContact());
        rider.setRoute(riding.get().getRoute());
        rider.setContact(riding.get().getContact());
        rider.setName(riding.get().getName());
        rider.setDeliveryBikeList(deliveryBikeList);
        System.out.println(riding.get());
        System.out.println(riding.get().getName());
        System.out.println(riding.get().getContact());
        System.out.println(riding.get().getRoute());
        deliveryBike.setRider(rider);
        deliveryBike1.setRider(rider);


        Customer customer1 = new Customer();
        customer1.setName("Martins");
        customer1.setAmount(new BigDecimal(3020));

        OrderPastry orderPastry1 = new OrderPastry();
        orderPastry1.setItems("Meat pie and chicken pie");
        orderPastry1.setCustomer(customer1);
        customer1.setOrderPastry(orderPastry1);

        List<DeliveryBike> list = new ArrayList<>();
        DeliveryBike deliveryBike2 = new DeliveryBike();
        deliveryBike2.setDeliveryLocation("Lagos_Island");
        deliveryBike2.setCostOfDelivery(new BigDecimal(340));
        deliveryBike2.setCustomerContact("671-321_000");

        DeliveryBike deliveryBike3 = new DeliveryBike();
        deliveryBike3.setDeliveryLocation("Opebi");
        deliveryBike3.setCostOfDelivery(new BigDecimal(550));
        deliveryBike3.setCustomerContact("891-450-000");
        list.add(deliveryBike2);
        list.add(deliveryBike3);

        Optional<Rider> op = riderRepository.findById(2L);
        Rider rider1 = new Rider();
        rider1.setContact(op.get().getContact());
        rider1.setName(op.get().getName());
        rider1.setRoute(op.get().getRoute());
        rider1.setDeliveryBikeList(list);

        deliveryBike2.setRider(op.get());
        deliveryBike3.setRider(op.get());
        customer.setDeliveryBike(deliveryBike2);
        customer.setDeliveryBike(deliveryBike3);
        customers.add(customer);
        customers.add(customer1);
        cashier.setCustomerList(customers);

        cashierRepository.save(cashier);
    }

    @Test
    void upDateACashier () {
      Optional<Cashier> op =  cashierRepository.findById(1L);
      Cashier cashier = op.get();
      cashier.setSalary(new BigDecimal(890));

        cashier.getCustomerList().get(1).setName("Matthew");

        //        for (Customer customer1 :cashier.getCustomerList()) {
//            DeliveryBike deliveryBike = customer1.getDeliveryBike();
//            if (cashier.getCustomerList().get(1).equals(customer1.getDeliveryBike())) {
//                    customer1.setDeliveryBike(deliveryBike);
//                }
//            }
            cashierRepository.save(cashier);
        }

     @Test
     @Transactional
    void fetchCashier () {
        Cashier cash = cashierRepository.findById(1L).get();
         System.out.println(cash.getNameOfCashier());
        List<Customer> cc = cash.getCustomerList();
         System.out.println(cc);
    }


}
