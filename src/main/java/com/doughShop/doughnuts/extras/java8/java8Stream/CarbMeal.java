package com.doughShop.doughnuts.extras.java8.java8Stream;

import com.doughShop.doughnuts.oop.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarbMeal {
    private int spoonsOfRice;
    private int pieceOfFriedPlantain;
    private int spoonsOfBeans;
    private String nameOfProtein;
    private int piecesOfProtein;
    private String deliveryLocation;
    private float totalCostEstimate;

    public CarbMeal() {
    }

    public CarbMeal(int spoonsOfRice, int pieceOfFriedPlantain, int spoonsOfBeans,
                    String nameOfProtein, int piecesOfProtein, String deliveryLocation,
                    float totalCostEstimate) {
        this.spoonsOfRice = spoonsOfRice;
        this.pieceOfFriedPlantain = pieceOfFriedPlantain;
        this.spoonsOfBeans = spoonsOfBeans;
        this.nameOfProtein = nameOfProtein;
        this.piecesOfProtein = piecesOfProtein;
        this.deliveryLocation = deliveryLocation;
        this.totalCostEstimate = totalCostEstimate;
    }

    public int getSpoonsOfRice() {
        return spoonsOfRice;
    }

    public void setSpoonsOfRice(int spoonsOfRice) {
        this.spoonsOfRice = spoonsOfRice;
    }

    public int getPieceOfFriedPlantain() {
        return pieceOfFriedPlantain;
    }

    public void setPieceOfFriedPlantain(int pieceOfFriedPlantain) {
        this.pieceOfFriedPlantain = pieceOfFriedPlantain;
    }

    public int getSpoonsOfBeans() {
        return spoonsOfBeans;
    }

    public void setSpoonsOfBeans(int spoonsOfBeans) {
        this.spoonsOfBeans = spoonsOfBeans;
    }

    public String getNameOfProtein() {
        return nameOfProtein;
    }

    public void setNameOfProtein(String nameOfProtein) {
        this.nameOfProtein = nameOfProtein;
    }

    public int getPiecesOfProtein() {
        return piecesOfProtein;
    }

    public void setPiecesOfProtein(int piecesOfProtein) {
        this.piecesOfProtein = piecesOfProtein;
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public float getTotalCostEstimate() {
        return totalCostEstimate;
    }

    public void setTotalCostEstimate(float totalCostEstimate) {
        this.totalCostEstimate = totalCostEstimate;
    }

    public static void main(String[] args) {
        //sort the carbmeal with custom method
        CarbMeal carb = new CarbMeal();
        List<CarbMeal> cm = carb.meals().stream().sorted((o1,o2)-> o1.spoonsOfRice - o1.spoonsOfRice).collect(Collectors.toList());
        Iterator<CarbMeal> it = cm.iterator();
        while (it.hasNext()){
            CarbMeal cm1 = it.next();
            System.out.println(cm1);
        }
        //with anonymous impl
        System.out.println();
        System.out.println();
        carb.meals().stream().sorted((o1,o2)-> o1.deliveryLocation.compareTo(o2.deliveryLocation)).forEach((c)-> System.out.println(c));
        System.out.println();
        System.out.println();
        carb.meals().stream().sorted(new Comparator<CarbMeal>() {
            @Override
            public int compare (CarbMeal o1, CarbMeal o2){
               return o1.nameOfProtein.compareTo(o2.nameOfProtein);
            }
        }).forEach((c)-> System.out.println(c));
        System.out.println();
        System.out.println();
        //with comparator.comparing()
        carb.meals().stream().sorted((Comparator.comparing(CarbMeal::getPieceOfFriedPlantain))).forEach((c)-> System.out.println(c));
        System.out.println();
        System.out.println();



    }


    public List<CarbMeal> meals () {
        List<CarbMeal> dish = new ArrayList<>();
        dish.add(new CarbMeal(6,10,3,"turkey",1,"Ketu",2500f));
        dish.add(new CarbMeal(10,5,0,"fish",2,"Somolu",1200f));
        dish.add(new CarbMeal(7,7,5,"Turkey and fish",3,"Lekki",4500f));
        dish.add(new CarbMeal(3,5,1,"chicken",2,"Yaba",3000f));
        dish.add(new CarbMeal(12,6,5,"beef and fish",2,"Ikeja",3400f));
        return dish;
    }

    @Override
    public String toString() {
        return "CarbMeal{" +
                "spoonsOfRice=" + spoonsOfRice +
                ", pieceOfFriedPlantain=" + pieceOfFriedPlantain +
                ", spoonsOfBeans=" + spoonsOfBeans +
                ", nameOfProtein='" + nameOfProtein + '\'' +
                ", piecesOfProtein=" + piecesOfProtein +
                ", deliveryLocation='" + deliveryLocation + '\'' +
                ", totalCostEstimate=" + totalCostEstimate +
                '}';
    }
}
