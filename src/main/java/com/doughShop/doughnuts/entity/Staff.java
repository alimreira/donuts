package com.doughShop.doughnuts.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String department;
    private String empId;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER, mappedBy = "staffList")
    private List<Shift> shiftList = new ArrayList<>();

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", department='" + department + '\'' +
                ", empId='" + empId + '\'' +
                '}';
    }
}
