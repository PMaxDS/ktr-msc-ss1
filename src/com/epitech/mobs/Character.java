package com.epitech.mobs;

public abstract class Character {

    protected String name;
    protected Integer life = 50;
    protected Integer agility = 2;
    protected Integer strength = 2;
    protected Integer wit = 2;
    protected String RPGClass = this.getClass().getSuperclass().getSimpleName();

    public Character(String name){
        this.name = name;
    }

    public void attack(String weapon){
        System.out.println(this.name + ": Rrrrrrrrr....");
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
}
