package com.doughShop.doughnuts.PaginationAndSortingTheTest;

import com.doughShop.doughnuts.entity.DoughnutMaking;
import com.doughShop.doughnuts.repository.DoughnutRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import javax.persistence.Table;
import java.util.List;

import static org.springframework.data.domain.Sort.*;

@SpringBootTest
public class Paginating {
    @Autowired
    private DoughnutRepository doughnutRepository;

    @Test
    void doughnutsPagination () {
        int pageNum = 0;
        int pageSize = 3;
        Page page = doughnutRepository.findAll(PageRequest.of(pageNum,pageSize));
        List<DoughnutMaking> doughnutMakingList = page.getContent();
        int total = page.getTotalPages();
        long elements = page.getTotalElements();
        int numsElements = page.getNumberOfElements();
        int size = page.getSize();
        boolean bl = page.isLast();
        boolean bl1 = page.isFirst();
        System.out.println(total);
        System.out.println(elements);
        System.out.println(numsElements);
        System.out.println(size);
        System.out.println(bl);
        System.out.println(bl1);
        doughnutMakingList.stream().forEach((c)-> System.out.println(c));

    }

    @Test
    void doughnutsSorting () {
        String sortBy = "gramsOfButter";
        String sortDir = "desc";
        List<DoughnutMaking> doughnutMakingList = doughnutRepository.findAll(Sort.by(Sort.Direction.fromString(sortDir),sortBy));
        doughnutMakingList.stream().forEach((c)-> System.out.println(c));
    }

    //sort by multiple fields
    @Test
    void doughnutSortingWithMultipleFields () {
        String sortBy = "cupsOfFlour";
        String sortDescription = "gramsOfSugar";
        String sortDir = "asc";

        List<DoughnutMaking> dm = doughnutRepository.findAll(Sort.by(Sort.Direction.fromString(sortDir),sortBy,sortDescription));
        dm.stream().forEach((c)-> System.out.println(c));
    }
    //paging and sorting together
    @Test
    void doughnutsPaginationAndSorting () {
        int pageNo = 0;
        int pageSize = 2;
        String sortBy = "gramsOfMilk";
        String sortDir = "desc";
        Page pg = doughnutRepository.findAll(PageRequest.of(pageNo,pageSize,Sort.by(Sort.Direction.fromString(sortDir),sortBy)));
        System.out.println(pg);
    }

}
