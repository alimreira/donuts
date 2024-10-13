package com.doughShop.doughnuts.manyToManyUniDirRelations;

import com.doughShop.doughnuts.entity.Shift;
import com.doughShop.doughnuts.entity.Staff;
import com.doughShop.doughnuts.repository.ShiftRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class ManyToManyBiDirRelations {
    @Autowired
    private ShiftRepository shiftRepository;

    @Test
     void saveAShift () {
        Shift shift = new Shift();
        shift.setShiftType("Mid day");
        shift.setNumsOfShiftWeekly(3);

        Staff staff = new Staff();
        staff.setDepartment("Baking");
        staff.setEmpId("QR381");
        staff.getShiftList().add(shift);

        Staff staff1 = new Staff();
        staff1.setDepartment("Account");
        staff1.setEmpId("QR513");
        staff.getShiftList().add(shift);

        Staff staff2 = new Staff();
        staff2.setDepartment("Delivery");
        staff2.setEmpId("QR118");
        staff.getShiftList().add(shift);

        shift.getStaffList().add(staff);
        shift.getStaffList().add(staff1);
        shift.getStaffList().add(staff2);

        shiftRepository.save(shift);

    }

    @Transactional
    @Test
    void fetchShift () {
       Shift shift =  shiftRepository.findById(1L).get();
        System.out.println(shift.getShiftType());
        shift.getStaffList().stream().forEach((c)-> System.out.println(c));
    }
}
