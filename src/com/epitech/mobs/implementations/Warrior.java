package com.epitech.mobs.implementations;

import com.epitech.mobs.Character;

public class Warrior extends Character {

    public Warrior(String name){
        super(name);
        this.life = 100;
        this.strength = 10;
        this.agility = 8;
        this.wit = 3;

        System.out.println(this.name + ": My name will go down in history!");
    }

    public void attack(String weapon){
        if(weapon.equals("hammer") || weapon.equals("sword"))
            super.attack(weapon);
    }
}
