package com.doughShop.doughnuts;

import com.doughShop.doughnuts.entity.Chef;
import com.doughShop.doughnuts.repository.ChefRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@SpringBootTest
public class ChefRepositoryTest {
    @Autowired
    private ChefRepository chefRepository;

    @Test
    void safeAChef() {
        Chef chef = new Chef();
        chef.setName("Ade");
        chef.setCulinary("local culinary");
        chef.setAge(21);
        chef.setSalary(new BigDecimal(345f));
        chef.setShift("Evening");
        chef.setContact("417-599-000");
        chefRepository.save(chef);
    }

    @Test
    void saveAllChefs() {
        List<Chef> chefList = new ArrayList<>();
        Chef chef = new Chef();
        chef.setName("Jane");
        chef.setCulinary("pastry");
        chef.setAge(34);
        chef.setSalary(new BigDecimal(4563f));
        chef.setShift("Morning");
        chef.setContact("213-458-000");
        chefList.add(chef);

        Chef chef1 = new Chef();
        chef1.setName("Kelvin");
        chef1.setCulinary("sea food");
        chef1.setAge(32);
        chef1.setSalary(new BigDecimal(5432f));
        chef1.setShift("Evening");
        chef1.setContact("234-732-000");
        chefList.add(chef1);

        Chef chef2 = new Chef();
        chef2.setName("Williams");
        chef2.setCulinary("Grills");
        chef2.setAge(18);
        chef2.setSalary(new BigDecimal(1234f));
        chef2.setShift("Afternoon");
        chef2.setContact("119-867-000");
        chefList.add(chef2);

        Chef chef3 = new Chef();
        chef3.setName("Mufti");
        chef3.setCulinary("Supervisor");
        chef3.setAge(29);
        chef3.setSalary(new BigDecimal(6110f));
        chef3.setShift("Full day");
        chef3.setContact("919-652-000");
        chefList.add(chef3);

        Chef chef4 = new Chef();
        chef4.setName("Kate");
        chef4.setCulinary("Intercontinental");
        chef4.setAge(31);
        chef4.setSalary(new BigDecimal(3210f));
        chef4.setShift("Afternoon");
        chef4.setContact("672-129-000");
        chefList.add(chef4);

        Chef chef5 = new Chef();
        chef5.setName("Tony");
        chef5.setCulinary("Grills");
        chef5.setAge(34);
        chef5.setSalary(new BigDecimal(2154f));
        chef5.setShift("Evening");
        chef5.setContact("871-867-000");
        chefList.add(chef5);

        Chef chef6 = new Chef();
        chef6.setName("April");
        chef6.setCulinary("Soups");
        chef6.setAge(25);
        chef6.setSalary(new BigDecimal(2467f));
        chef6.setShift("Afternoon");
        chef6.setContact("254-890-000");
        chefList.add(chef6);
        chefRepository.saveAll(chefList);
    }

    @Test
    void updateAChef() {
        Optional<Chef> op = chefRepository.findById(4L);
        Chef chef = op.get();
        chef.setSalary(new BigDecimal(1500f));
        chef.setCulinary("Day time grill");
        chefRepository.save(chef);
    }

    @Test
    void countChefs() {
        Long hl = chefRepository.count();
        System.out.println(hl);
    }

    @Test
    void findAChef() {
        Optional<Chef> op = chefRepository.findById(7L);
        Chef chef = op.get();
        System.out.println(chef);
    }

    @Test
    void findAllChefs() {
        List<Chef> allChefs = chefRepository.findAll();
        Iterator<Chef> it = allChefs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    @Test
    void findAllChefsInPages() {
        int pageNum = 0;
        int pageSize = 2;
        Page pg = chefRepository.findAll(PageRequest.of(0, 2));
        List<Chef> chef = pg.getContent();
        System.out.println(pg.isFirst());
        System.out.println(pg.isLast());
        System.out.println(pg.getTotalPages());
        System.out.println(pg.getSize());
        System.out.println(pg.getNumberOfElements());
        System.out.println(pg.getNumber());
        System.out.println(pg.getTotalElements());

        chef.stream().forEach((c) -> System.out.println(c));
    }

    @Test
    void findAllChefsSorted() {
        //Sorting with a single attrbute
        String sortBy = "name";
        String sortDir = "desc";
        List<Chef> chefs = chefRepository.findAll(Sort.by(Sort.Direction.fromString(sortDir), sortBy));
        chefs.stream().forEach((c) -> System.out.println(c));
    }

    @Test
    void findAllChefsSortedByMultiples() {
        String sortBy = "name";
        String sortDescription = "culinary";
        String sortDir = "desc";
        List<Chef> chefs = chefRepository.findAll(Sort.by(Sort.Direction.fromString(sortDir), "name", sortBy, sortDescription));
        List<Chef> chefs1 = chefRepository.findAll(Sort.by(Sort.Direction.fromString(sortDir), "culinary", sortBy, sortDescription));
        for (int i = 0; i <= chefs.size() - 1; ++i) {
            System.out.println(chefs.get(i));
        }

        System.out.println();
        chefs1.stream().forEach((c) -> System.out.println(c));
    }

    @Test
    void findAllChefsWithPagingAndSorting() {
        String sortBy = "salary";
        String sortDescription = "name";
        String sortDir = "desc";

        int pageNo = 0;
        int pageSize = 2;

        Page pg = chefRepository.findAll(PageRequest.of(pageNo, pageSize, Sort.by(Sort.Direction.fromString(sortDir), sortDescription, sortBy)));
        List<Chef> chefs = pg.getContent();
        chefs.stream().forEach((c) -> System.out.println(c));
    }

}

