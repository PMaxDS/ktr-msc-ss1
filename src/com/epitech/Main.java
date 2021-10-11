package com.epitech;

import com.epitech.exceptions.Character;
import com.epitech.exceptions.Mage;
import com.epitech.exceptions.Warrior;
import com.epitech.exceptions.WeaponException;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Character warrior = new Warrior("Jean-Luc");
        Character mage = new Mage("Robert");

        warrior.tryToAttack("screwdriver");
        mage.tryToAttack("hammer");
        warrior.tryToAttack("hammer");
        try {
            mage.attack("");
        } catch (WeaponException e){
            System.out.println(e.getMessage());
        }
    }
}
