package com.polymorphism;

public class Animal {
    private boolean liveIn;

    public Animal(boolean liveIn){
        this.liveIn = liveIn;
    }

    public void setLiveIn(boolean liveIn) {
        this.liveIn = liveIn;
    }

    public boolean getLiveIn(){
        return liveIn;
    }
}
