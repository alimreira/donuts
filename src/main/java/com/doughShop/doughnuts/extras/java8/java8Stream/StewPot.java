package com.doughShop.doughnuts.extras.java8.java8Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StewPot {
    private PepperAndSpiceMix pepperAndSpiceMix;
    private int pieceOfBeef;
    private int pieceOfFish;
    private int pieceOfChicken;
    private int mlOfOil;
    private int gramsOfSalt;
    private int cubesOfSeasoning;
    private int mlOfBrooth;

    public StewPot() {
    }

    public StewPot(PepperAndSpiceMix pepperAndSpiceMix, int pieceOfBeef,
                   int pieceOfFish, int pieceOfChicken, int mlOfOil,
                   int gramsOfSalt, int cubesOfSeasoning, int mlOfBrooth) {
        this.pepperAndSpiceMix = pepperAndSpiceMix;
        this.pieceOfBeef = pieceOfBeef;
        this.pieceOfFish = pieceOfFish;
        this.pieceOfChicken = pieceOfChicken;
        this.mlOfOil = mlOfOil;
        this.gramsOfSalt = gramsOfSalt;
        this.cubesOfSeasoning = cubesOfSeasoning;
        this.mlOfBrooth = mlOfBrooth;
    }



    public PepperAndSpiceMix getPepperAndSpiceMix() {
        return pepperAndSpiceMix;
    }

    public void setPepperAndSpiceMix(PepperAndSpiceMix pepperAndSpiceMix) {
        this.pepperAndSpiceMix = pepperAndSpiceMix;
    }

    public int getPieceOfBeef() {
        return pieceOfBeef;
    }

    public void setPieceOfBeef(int pieceOfBeef) {
        this.pieceOfBeef = pieceOfBeef;
    }

    public int getPieceOfFish() {
        return pieceOfFish;
    }

    public void setPieceOfFish(int pieceOfFish) {
        this.pieceOfFish = pieceOfFish;
    }

    public int getPieceOfChicken() {
        return pieceOfChicken;
    }

    public void setPieceOfChicken(int pieceOfChicken) {
        this.pieceOfChicken = pieceOfChicken;
    }

    public int getMlOfOil() {
        return mlOfOil;
    }

    public void setMlOfOil(int mlOfOil) {
        this.mlOfOil = mlOfOil;
    }

    public int getGramsOfSalt() {
        return gramsOfSalt;
    }

    public void setGramsOfSalt(int gramsOfSalt) {
        this.gramsOfSalt = gramsOfSalt;
    }

    public int getCubesOfSeasoning() {
        return cubesOfSeasoning;
    }

    public void setCubesOfSeasoning(int cubesOfSeasoning) {
        this.cubesOfSeasoning = cubesOfSeasoning;
    }

    public int getMlOfBrooth() {
        return mlOfBrooth;
    }

    public void setMlOfBrooth(int mlOfBrooth) {
        this.mlOfBrooth = mlOfBrooth;
    }

    public static void main(String[] args) {
        //sorting collection with custom method
        StewPot stewPot = new StewPot();
        List<StewPot> stew = stewPot.stewPots().stream().sorted((o1,o2)->o1.pieceOfChicken- o2.pieceOfChicken).collect(Collectors.toList());
        stew.stream().forEach((c)-> System.out.println(c));
        System.out.println();
        System.out.println();
        //sorting collection with anonymous impl
        stewPot.stewPots().stream().sorted((new Comparator<StewPot>(){
            @Override
            public int compare (StewPot o1,StewPot o2) {
                return o2.getMlOfOil() - o1.getMlOfOil();
            }
        })).forEach((c)-> System.out.println(c));
        System.out.println();
        System.out.println();
        //sorting with Comparator.comparing()
        stewPot.stewPots().stream().sorted(Comparator.comparing(StewPot::getMlOfBrooth).reversed()).forEach((c)-> System.out.println(c));

        System.out.println();
        System.out.println();
        //filter the list of stewPot objects
        //  Traditional filtering
        for(int i = 0; i <= stewPot.stewPots().size()-1; ++i){
            StewPot sp = stewPot.stewPots().get(i);
            if(sp.getPepperAndSpiceMix().getNumsOfTomatoes() <= 5){
                System.out.println(sp);
            }
        }

//        for (int i = 0; i < stewPot.stewPots().size(); ++i) {
//            StewPot currentPot = stewPot.stewPots().get(i);
//            if (currentPot.getPepperAndSpiceMix().getNumsOfTomatoes() <= 5) {
//                System.out.println(currentPot);
//            }

    }

    public List<StewPot> stewPots () {

        List<StewPot> pots = new ArrayList<>();
        pots.add(new StewPot(new PepperAndSpiceMix(12,10,5,10,8,2,5,2),
                10,7,8,250,25,5,400));
        pots.add(new StewPot(new PepperAndSpiceMix(15,10,7,12,7,1,6,0),
                16,0,10,300,35,3,320));
        pots.add(new StewPot(new PepperAndSpiceMix(8,5,1,7,5,1,0,1),
                4,2,3,150,10,1,100));
        pots.add(new StewPot(new PepperAndSpiceMix(5,10,2,5,4,1,2,1),
                2,2,1,75,8,1,75));
        pots.add(new StewPot(new PepperAndSpiceMix(10,15,7,10,5,2,3,2),
                6,6,8,180,30,4,195));

        return pots;
    }

    @Override
    public String toString() {
        return "StewPot{" +
                "pepperAndSpiceMix=" + pepperAndSpiceMix +
                ", pieceOfBeef=" + pieceOfBeef +
                ", pieceOfFish=" + pieceOfFish +
                ", pieceOfChicken=" + pieceOfChicken +
                ", mlOfOil=" + mlOfOil +
                ", gramsOfSalt=" + gramsOfSalt +
                ", cubesOfSeasoning=" + cubesOfSeasoning +
                ", mlOfBrooth=" + mlOfBrooth +
                '}';
    }
}
