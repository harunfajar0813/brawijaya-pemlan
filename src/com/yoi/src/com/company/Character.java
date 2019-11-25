package com.company;

public interface Character {
    int getHP();
    int getMana();
    double getDefense();
    void attack(Character c);
    void specialAttack(Character c);
    void takeDemage(int demage);
}
