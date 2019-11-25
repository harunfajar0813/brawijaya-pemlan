package com.polymorphism;

public class Buaya extends LandAnimal {
    public Buaya(String name){
        super(name);
    }
    @Override
    public void setLiveIn(boolean liveIn) {
        super.setLiveIn(liveIn);
    }

    public void show(){
        System.out.println("Buaya tinggal di " + ((getLiveIn() == true)?"Darat":"False"));
    }
}
