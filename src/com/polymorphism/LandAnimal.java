package com.polymorphism;

public class LandAnimal extends Animal {
    private String name;

    public LandAnimal(String name){
        super(true);
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
