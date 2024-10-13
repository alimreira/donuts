package com.doughShop.doughnuts.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name ="calendar")
public class Shift {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String shiftType;
    private int numsOfShiftWeekly;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinTable(
        name = "shift_staff",
            joinColumns = @JoinColumn (
                    name = "shift_id", referencedColumnName = "id"
            ),
            inverseJoinColumns = @JoinColumn (
                    name = "staff_id",referencedColumnName = "id"
            )
    )
    private List<Staff> staffList = new ArrayList<>();

    @Override
    public String toString() {
        return "Shift{" +
                "id=" + id +
                ", shiftType='" + shiftType + '\'' +
                ", numsOfShiftWeekly=" + numsOfShiftWeekly +
                ", staffList=" + staffList +
                '}';
    }
}
