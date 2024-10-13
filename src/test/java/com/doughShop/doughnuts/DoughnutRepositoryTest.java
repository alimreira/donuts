package com.doughShop.doughnuts;

import com.doughShop.doughnuts.entity.DoughnutMaking;
import com.doughShop.doughnuts.repository.DoughnutRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
public class DoughnutRepositoryTest {
    @Autowired
    private DoughnutRepository doughnutRepository;

    @Test
    void saveADoughnut () {
        DoughnutMaking doughnutMaking = new DoughnutMaking();
        doughnutMaking.setCupsOfFlour(5);
        doughnutMaking.setGramsOfButter(70);
        doughnutMaking.setGramsOfMilk(75);
        doughnutMaking.setGramsOfSalt(5);
        doughnutMaking.setGramsOfYeast(15);
        doughnutMaking.setGramsOfSugar(120);
        doughnutRepository.save(doughnutMaking);
        System.out.println(doughnutMaking.getId());
        System.out.println(doughnutMaking.toString());
    }

    @Test
    void saveAllDoughnuts () {
        List<DoughnutMaking> doughnutMakingList = new LinkedList<>();
        DoughnutMaking doughnutMaking = new DoughnutMaking();
        doughnutMaking.setCupsOfFlour(7);
        doughnutMaking.setGramsOfButter(84);
        doughnutMaking.setGramsOfMilk(90);
        doughnutMaking.setGramsOfSalt(5);
        doughnutMaking.setGramsOfYeast(30);
        doughnutMaking.setGramsOfSugar(150);
        doughnutMakingList.add(doughnutMaking);

        DoughnutMaking doughnutMaking2 = new DoughnutMaking();
        doughnutMaking2.setCupsOfFlour(9);
        doughnutMaking2.setGramsOfButter(100);
        doughnutMaking2.setGramsOfMilk(110);
        doughnutMaking2.setGramsOfSalt(10);
        doughnutMaking2.setGramsOfYeast(45);
        doughnutMaking2.setGramsOfSugar(170);
        doughnutMakingList.add(doughnutMaking2);

        DoughnutMaking doughnutMaking1 = new DoughnutMaking();
        doughnutMaking1.setCupsOfFlour(7);
        doughnutMaking1.setGramsOfButter(84);
        doughnutMaking1.setGramsOfMilk(90);
        doughnutMaking1.setGramsOfSalt(5);
        doughnutMaking1.setGramsOfYeast(30);
        doughnutMaking1.setGramsOfSugar(150);
        doughnutMakingList.add(doughnutMaking1);

        DoughnutMaking doughnutMaking4 = new DoughnutMaking();
        doughnutMaking4.setCupsOfFlour(15);
        doughnutMaking4.setGramsOfButter(154);
        doughnutMaking4.setGramsOfMilk(150);
        doughnutMaking4.setGramsOfSalt(15);
        doughnutMaking4.setGramsOfYeast(75);
        doughnutMaking4.setGramsOfSugar(250);
        doughnutMakingList.add(doughnutMaking4);

        DoughnutMaking doughnutMaking5 = new DoughnutMaking();
        doughnutMaking5.setCupsOfFlour(20);
        doughnutMaking5.setGramsOfButter(280);
        doughnutMaking5.setGramsOfMilk(180);
        doughnutMaking5.setGramsOfSalt(25);
        doughnutMaking5.setGramsOfYeast(90);
        doughnutMaking5.setGramsOfSugar(270);
        doughnutMakingList.add(doughnutMaking5);

        DoughnutMaking doughnutMaking3 = new DoughnutMaking();
        doughnutMaking3.setCupsOfFlour(10);
        doughnutMaking3.setGramsOfButter(140);
        doughnutMaking3.setGramsOfMilk(120);
        doughnutMaking3.setGramsOfSalt(10);
        doughnutMaking3.setGramsOfYeast(60);
        doughnutMaking3.setGramsOfSugar(210);
        doughnutMakingList.add(doughnutMaking3);
        List<DoughnutMaking> multiple = doughnutRepository.saveAll(doughnutMakingList);
        System.out.println(multiple.toString());
        System.out.println(multiple.size());

        //multiple.stream().forEach((c)-> System.out.println(c));

    }

    @Test
    void updateADoughnut () {
        Optional<DoughnutMaking> dm = doughnutRepository.findById(4L);
        DoughnutMaking nut = dm.get();
        nut.setCupsOfFlour(3);
        nut.setGramsOfMilk(30);
        nut.setGramsOfButter(42);
        nut.setGramsOfYeast(10);
        nut.setGramsOfSalt(5);
        nut.setGramsOfSugar(45);
        doughnutRepository.save(nut);
        System.out.println(nut.toString());
        System.out.println(nut.getId());
    }

    @Test
    void findADoughnut () {
        DoughnutMaking doughnutMaking =doughnutRepository.findById(5l).get();
        System.out.println(doughnutMaking.getId());
        System.out.println(doughnutMaking.getGramsOfSugar());
    }

    @Test
    void findAllDoughnuts () {
        List<DoughnutMaking> doughnutMakingList = doughnutRepository.findAll();
        Iterator<DoughnutMaking> it = doughnutMakingList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    @Test
    void countDoughnuts () {
        Long counter = doughnutRepository.count();
        System.out.println(counter);
    }

    @Test
    void checkIfDoughnutExistById () {
        boolean bl = doughnutRepository.existsById(10L);
        System.out.println(bl);
    }
}
