package com.company;

public abstract class Karakter {
    public int attack;
    public int defense;
    public int hp;
    public int mana_regen;
    public int mana;
    public int special_attack;

    public Karakter(int attack, int defense, int hp, int mana_regen, int mana, int special_attack){
        this.attack = attack;
        this.defense = defense;
        this.hp = hp;
        this.mana_regen = mana_regen;
        this.mana = mana;
        this.special_attack = special_attack;
    }
}
