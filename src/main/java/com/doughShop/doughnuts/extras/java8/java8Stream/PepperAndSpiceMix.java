package com.doughShop.doughnuts.extras.java8.java8Stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PepperAndSpiceMix implements Comparable<PepperAndSpiceMix> {
    private int numsOfScotchBonnet;
    private int numsOfTomatoes;
    private int numsOfOnions;
    private int numsOfBellPepper;
    private int numsOfChilliPepper;
    private int spoonsOfCurryPowder;
    private int numsOfGarlicAndGinger;
    private int numsOfThyme;

    private float totalCost;


    public PepperAndSpiceMix() {
    }

    public PepperAndSpiceMix(int numsOfScotchBonnet, int numsOfTomatoes, int numsOfOnions,
                             int numsOfBellPepper, int numsOfChilliPepper, int spoonsOfCurryPowder,
                             int numsOfGarlicAndGinger, int numsOfThyme, float totalCost) {
        this.numsOfScotchBonnet = numsOfScotchBonnet;
        this.numsOfTomatoes = numsOfTomatoes;
        this.numsOfOnions = numsOfOnions;
        this.numsOfBellPepper = numsOfBellPepper;
        this.numsOfChilliPepper = numsOfChilliPepper;
        this.spoonsOfCurryPowder = spoonsOfCurryPowder;
        this.numsOfGarlicAndGinger = numsOfGarlicAndGinger;
        this.numsOfThyme = numsOfThyme;
        this.totalCost = totalCost;
    }

    public PepperAndSpiceMix(int numsOfScotchBonnet, int numsOfTomatoes, int numsOfOnions,
                             int numsOfBellPepper, int numsOfChilliPepper, int spoonsOfCurryPowder,
                             int numsOfGarlicAndGinger, int numsOfThyme) {
        this.numsOfScotchBonnet = numsOfScotchBonnet;
        this.numsOfTomatoes = numsOfTomatoes;
        this.numsOfOnions = numsOfOnions;
        this.numsOfBellPepper = numsOfBellPepper;
        this.numsOfChilliPepper = numsOfChilliPepper;
        this.spoonsOfCurryPowder = spoonsOfCurryPowder;
        this.numsOfGarlicAndGinger = numsOfGarlicAndGinger;
        this.numsOfThyme = numsOfThyme;
    }

    public static void main(String[] args) {
        PepperAndSpiceMix spice = new PepperAndSpiceMix();
//        Collections.sort(spice.pepperAndSpiceMixList(),((o1,o2)-> (int) (o1.totalCost - o2.totalCost)));
//        spice.pepperAndSpiceMixList().stream().forEach((c)-> System.out.println(c));

        Collections.sort(spice.pepperAndSpiceMixList());
        spice.pepperAndSpiceMixList().stream().forEach((c) -> System.out.println(c));
    }

    public List<PepperAndSpiceMix> pepperAndSpiceMixList() {
        List<PepperAndSpiceMix> mix = new ArrayList<>();
        mix.add(new PepperAndSpiceMix(12, 10, 5, 8, 4, 1, 3, 1 ));
        mix.add(new PepperAndSpiceMix(18, 15, 7, 10, 7, 2, 4, 2 ));
        mix.add(new PepperAndSpiceMix(10, 7, 6, 12, 3, 0, 4, 0 ));
        mix.add(new PepperAndSpiceMix(8, 5, 2, 2, 3, 1, 6, 2 ));
        mix.add(new PepperAndSpiceMix(15, 9, 4, 10, 7, 4, 7, 3));
        return mix;
    }

    public int getNumsOfScotchBonnet() {
        return numsOfScotchBonnet;
    }

    public void setNumsOfScotchBonnet(int numsOfScotchBonnet) {
        this.numsOfScotchBonnet = numsOfScotchBonnet;
    }

    public int getNumsOfTomatoes() {
        return numsOfTomatoes;
    }

    public void setNumsOfTomatoes(int numsOfTomatoes) {
        this.numsOfTomatoes = numsOfTomatoes;
    }

    public int getNumsOfOnions() {
        return numsOfOnions;
    }

    public void setNumsOfOnions(int numsOfOnions) {
        this.numsOfOnions = numsOfOnions;
    }

    public int getNumsOfBellPepper() {
        return numsOfBellPepper;
    }

    public void setNumsOfBellPepper(int numsOfBellPepper) {
        this.numsOfBellPepper = numsOfBellPepper;
    }

    public int getNumsOfChilliPepper() {
        return numsOfChilliPepper;
    }

    public void setNumsOfChilliPepper(int numsOfChilliPepper) {
        this.numsOfChilliPepper = numsOfChilliPepper;
    }

    public int getSpoonsOfCurryPowder() {
        return spoonsOfCurryPowder;
    }

    public void setSpoonsOfCurryPowder(int spoonsOfCurryPowder) {
        this.spoonsOfCurryPowder = spoonsOfCurryPowder;
    }

    public int getNumsOfGarlicAndGinger() {
        return numsOfGarlicAndGinger;
    }

    public void setNumsOfGarlicAndGinger(int numsOfGarlicAndGinger) {
        this.numsOfGarlicAndGinger = numsOfGarlicAndGinger;
    }

    public int getNumsOfThyme() {
        return numsOfThyme;
    }

    public void setNumsOfThyme(int numsOfThyme) {
        this.numsOfThyme = numsOfThyme;
    }

    @Override
    public int compareTo(PepperAndSpiceMix o) {
        return Integer.compare(this.numsOfBellPepper, o.numsOfBellPepper);
    }

    @Override
    public String toString() {
        return "PepperAndSpiceMix{" +
                "numsOfScotchBonnet=" + numsOfScotchBonnet +
                ", numsOfTomatoes=" + numsOfTomatoes +
                ", numsOfOnions=" + numsOfOnions +
                ", numsOfBellPepper=" + numsOfBellPepper +
                ", numsOfChilliPepper=" + numsOfChilliPepper +
                ", spoonsOfCurryPowder=" + spoonsOfCurryPowder +
                ", numsOfGarlicAndGinger=" + numsOfGarlicAndGinger +
                ", numsOfThyme=" + numsOfThyme +
                '}';
    }


}