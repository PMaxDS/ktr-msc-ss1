package com.epitech;

import com.epitech.mobs.Character;
import com.epitech.mobs.implementations.Mage;
import com.epitech.mobs.implementations.Warrior;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Character warrior = new Warrior("Jean-Luc");
        Character mage = new Mage("Robert");

        warrior.attack("hammer");
        mage.attack("magic");
    }
}
