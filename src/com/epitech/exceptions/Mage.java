package com.epitech.exceptions;

public class Mage extends Character {

    public Mage(String name){
        super(name);
        this.life = 70;
        this.strength = 3;
        this.agility = 10;
        this.wit = 10;

        System.out.println(this.name + ": May the gods be with me.");
    }

    public void attack(String weapon) throws WeaponException {
        super.attack(weapon);
    }

    @Override
    public void moveRight() {
        System.out.println(this.name + ": moves right furtively.");
    }

    @Override
    public void moveLeft() {
        System.out.println(this.name + ": moves left furtively.");
    }

    @Override
    public void moveForward() {
        System.out.println(this.name + ": moves forward furtively.");
    }

    @Override
    public void moveBack() {
        System.out.println(this.name + ": moves back furtively.");
    }
}
