package com.epitech.mobs;

import com.epitech.interfaces.Movable;

public abstract class Character implements Movable {

    protected String name;
    protected Integer life = 50;
    protected Integer agility = 2;
    protected Integer strength = 2;
    protected Integer wit = 2;
    protected String RPGClass = this.getClass().getSimpleName();

    public Character(String name){
        this.name = name;
    }

    public void attack(String weapon) {
        System.out.println(this.name + ": Rrrrrrrrr....");
        switch (RPGClass) {
            case ("Warrior"):
                System.out.println(this.name + ": I'll crush you with my " + weapon);
                break;
            case ("Mage"):
                System.out.println(this.name + ": Feel the power of my " + weapon);
                break;
            default:
                break;
        }
    }

    public String getName() {
        return name;
    }

    public Integer getLife() {
        return life;
    }

    public Integer getAgility() {
        return agility;
    }

    public Integer getStrength() {
        return strength;
    }

    public Integer getWit() {
        return wit;
    }

    public String getRPGClass() {
        return RPGClass;
    }

    public void moveRight() {
        System.out.println(this.name + ": moves right");
    }

    public void moveLeft() {
        System.out.println(this.name + ": moves left");
    }

    public void moveForward() {
        System.out.println(this.name + ": moves forward");
    }

    public void moveBack() {
        System.out.println(this.name + ": moves back");
    }

    public final void unsheathe(){
        System.out.println(this.name+ ": unsheathes his weapon.");
    }
}
