package com.epitech.mobs.implementations;

import com.epitech.mobs.Character;

public class TestCharacter extends Character {

    public TestCharacter(String name){
        super(name);
    }

    public void attack(String weapon){
        super.attack(weapon);
    }

    @Override
    public void moveRight() {
        System.out.println(this.name + ": moves right");
    }

    @Override
    public void moveLeft() {
        System.out.println(this.name + ": moves left");
    }

    @Override
    public void moveForward() {
        System.out.println(this.name + ": moves forward");
    }

    @Override
    public void moveBack() {
        System.out.println(this.name + ": moves back");
    }
}
