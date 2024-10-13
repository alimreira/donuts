package com.doughShop.doughnuts.entity;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "doughnuts")
public class DoughnutMaking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name ="cups_of_flour")
    private int cupsOfFlour;
    @Column(name="grams_of_milk")
    private int gramsOfMilk;
    @Column(name ="grams_of_butter")
    private int gramsOfButter;
    @Column(name="grams_of_yeast")
    private int gramsOfYeast;
    @Column(name="grams_of_salt")
    private int gramsOfSalt;
    @Column(name="grams_of_sugar")
    private int gramsOfSugar;
}
