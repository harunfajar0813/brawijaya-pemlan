package com.company;

public class Mage implements Character{
    public int attack;
    public double defense;
    public int hp;
    public int mana_regen;
    public int mana;
    public int special_attack;

    public Mage(int attack, double defense, int hp, int mana, int mana_regen, int special_attack, int mana_used){
        this.attack = attack;
        this.defense = defense;
        this.hp = hp;
        this.mana_regen = mana_regen;
        this.mana = mana;
        this.special_attack = special_attack;
        this.mana_regen = mana_regen;
    }

    @Override
    public double getDefense() {
        return defense;
    }

    @Override
    public int getHP() {
        return hp;
    }

    @Override
    public int getMana() {
        return 0;
    }

    @Override
    public void attack(Character c) {
        System.out.println("Mage Menyerang ke musuh objek");
        System.out.println("Nyawa Musuh dari " + c.getHP());
        System.out.println("berkurang menjadi " + (c.getHP() - (c.getDefense())));
    }

    @Override
    public void specialAttack(Character c) {

    }

    @Override
    public void takeDemage(int demage) {

    }
}
