package com.company;

public class Assasin implements Character{
    public int attack;
    public double defense;
    public int hp;
    public int mana_regen;
    public int mana;
    public int mana_used;
    public int special_attack;

    public Assasin(int attack, double defense, int hp, int mana, int mana_regen, int special_attack, int mana_used){
        this.attack = attack;
        this.defense = defense;
        this.hp = hp;
        this.mana_regen = mana_regen;
        this.mana = mana;
        this.mana_used = mana_used;
        this.special_attack = special_attack;
    }

    public double getDefense() {
        return defense;
    }

    @Override
    public int getHP() {
        return 0;
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public void attack(Character c) {
        System.out.println("Assasin Menyerang ke musuh objek");
        System.out.println("Nyawa Musuh dari " + c.getHP());
        System.out.println("Berkurang menjadi " + (c.getHP() - (attack - c.getDefense())));
    }

    @Override
    public void specialAttack(Character c) {
        if (mana >= mana_used){
            this.mana -= mana_used;
            System.out.println("Assasin melakukan special attack ke musuh");
            System.out.println("Nyawa musuh dari " + c.getHP());
            System.out.println("Berkuang menjadi " + (c.getHP() - (special_attack - c.getDefense()));
        } else {
            attack(c);
        }
    }

    @Override
    public void takeDemage(int demage) {

    }
}
