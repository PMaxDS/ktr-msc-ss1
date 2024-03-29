package com.epitech.exceptions;

public class Warrior extends Character {

    public Warrior(String name){
        super(name);
        this.life = 100;
        this.strength = 10;
        this.agility = 8;
        this.wit = 3;

        System.out.println(this.name + ": My name will go down in history!");
    }

    public void attack(String weapon) throws WeaponException{
        super.attack(weapon);
    }

    @Override
    public void moveRight() {
        System.out.println(this.name + ": moves right like a bad boy.");
    }

    @Override
    public void moveLeft() {
        System.out.println(this.name + ": moves left like a bad boy.");
    }

    @Override
    public void moveForward() {
        System.out.println(this.name + ": moves forward like a bad boy.");
    }

    @Override
    public void moveBack() {
        System.out.println(this.name + ": moves back like a bad boy.");
    }
}
