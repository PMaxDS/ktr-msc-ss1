package com.epitech.mobs.implementations;

import com.epitech.mobs.Character;

public class Mage extends Character {

    public Mage(String name){
        super(name);
        this.life = 70;
        this.strength = 3;
        this.agility = 10;
        this.wit = 10;

        System.out.println(this.name + ": May the gods be with me.");
    }

    public void attack(String weapon){
        if(weapon.equals("magic") || weapon.equals("wand"))
            super.attack(weapon);
    }
}
