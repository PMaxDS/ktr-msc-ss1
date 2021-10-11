package com.epitech;

import com.epitech.mobs.Character;
import com.epitech.mobs.implementations.TestCharacter;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Character perso = new TestCharacter("Jean-Luc");
        System.out.println(perso.getName ());
        System.out.println(perso.getLife ());
        System.out.println(perso.getAgility ());
        System.out.println(perso.getStrength ());
        System.out.println(perso.getWit ());
        System.out.println(perso.getRPGClass ());
        perso.attack("my weapon");
    }
}
