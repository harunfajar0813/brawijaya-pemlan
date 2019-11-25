package com.company;

public class Main {

    public static void main(String[] args) {
        Character a1 = new Assasin(17, 3, 92, 87, 21, 30, 55);
        Character m1 = new Mage(15, 2, 83, 149, 28, 50, 100);

        a1.attack(m1);
    }
}
