package com.epitech.exceptions;

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

    public void tryToAttack(String weapon){
        try {
            this.attack(weapon);
        } catch (WeaponException e){
            System.out.println(e.getMessage());
        }

    }

    public void attack(String weapon) throws WeaponException{
        if(weapon.equals(""))
            throw new WeaponException(this.name+": I refuse to fight with my bare hands.");
        switch (RPGClass) {
            case ("Warrior"):
                if(weapon.equals("hammer") || weapon.equals("sword")){
                    System.out.println(this.name + ": Rrrrrrrrr....");
                    System.out.println(this.name + ": I'll crush you with my " + weapon);
                }
                else
                    throw new WeaponException(this.name+": A "+weapon+"?? What should I do with this?!");
                break;
            case ("Mage"):
                if(weapon.equals("magic") || weapon.equals("wand")){
                    System.out.println(this.name + ": Rrrrrrrrr....");
                    System.out.println(this.name + ": Feel the power of my " + weapon);
                }
                else
                    throw new WeaponException(this.name+": I don't need this stupid "+weapon+"! Don't misjudge my powers!");
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
