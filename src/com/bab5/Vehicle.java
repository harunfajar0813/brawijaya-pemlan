package com.bab5;

public class Vehicle {
    private double load;  private final double maxLoad = 10000;
//    public Vehicle (double max){
//        this.maxLoad = max;
//    }
    public double getLoad(){
        return this.load;
    }

    public double getMaxLoad(){
        return this.maxLoad;
    }

    public boolean addBox(double weight){
        double temp = 0.0D;
        temp = this.load + weight;
        if(temp <= maxLoad){
            this.load = this.load + weight;
            return true;
        } else {
            return false;
        }
    }
}
