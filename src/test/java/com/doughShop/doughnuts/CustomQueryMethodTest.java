package com.doughShop.doughnuts;

import com.doughShop.doughnuts.entity.Chef;
import com.doughShop.doughnuts.repository.ChefRepository;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

@SpringBootTest
public class CustomQueryMethodTest {
    @Autowired
    private ChefRepository chefRepository;

    @Test
    void findByNameMethod () {
       Chef chef = chefRepository.findByName("Kelvin");
        System.out.println(chef);
    }

    @Test
    void findByIdMethod () {
        Chef chef = chefRepository.findById(3L).get();
        System.out.println(chef);
    }

    @Test
    void findByNameOrAgeMethod () {
        List<Chef> chefs = chefRepository.findByNameOrAge("Mufti",18);
        System.out.println(chefs);
        chefs.stream().forEach((c)-> System.out.println(c));
    }

    @Test
    void findByNameAndAgeMethod () {
        List<Chef> chefs = chefRepository.findByNameAndAge("Kate",31);
        Iterator<Chef> it = chefs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    @Test
    void findDistinctByNameMethod () {
        Chef chef = chefRepository.findDistinctByAge(25);
        System.out.println(chef);
    }


    @Test
    void findBySalaryGreaterThanMethod () {
        List<Chef> chefs = chefRepository.findBySalaryGreaterThan(new BigDecimal(3210f));
        chefs.stream().forEach((c)-> System.out.println(c));
    }

    @Test
    void findBySalaryLessThanMethod () {
        List<Chef> chefs = chefRepository.findBySalaryLessThan(new BigDecimal(3000));
        chefs.stream().forEach((c)-> System.out.println(c));
    }


    @Test
    void findByShiftContaining () {
        List<Chef> chefs = chefRepository.findByShiftContaining("Even");
        chefs.stream().forEach((c)-> System.out.println(c));
    }

    @Test
    void findByShiftLikeMethod () {
        List<Chef> chefs = chefRepository.findByShiftLike("Afternoon");
        chefs.stream().forEach((c)-> System.out.println(c));
    }

    @Test
    void findBySalaryBetweenMethod () {
        List<Chef> chefs = chefRepository.findBySalaryBetween(new BigDecimal(1500),new BigDecimal(4000));
        chefs.stream().forEach((c)-> System.out.println(c));
    }

    @Test
    void findByAgeInMethod () {
        List<Chef> chefs = chefRepository.findByAgeIn(List.of(29,31,32));
        chefs.stream().forEach((c)-> System.out.println(c));
    }

    @Test
    void findFirst2ByOrderByNameTest () {
        List<Chef> chefs = chefRepository.findFirst2ByOrderByNameAsc();
        chefs.stream().forEach((c)-> System.out.println(c));
    }

    @Test
    void findTop3ByOrderByAgeMethod () {
       List<Chef> chefs = chefRepository.findTop3ByOrderByAgeDesc();
       chefs.stream().forEach((c)-> System.out.println(c));
    }

}
