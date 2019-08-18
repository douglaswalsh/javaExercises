package codingBatPractice;

import java.util.Arrays;
import java.util.Random;

class DnDCharacter2 {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitpoints;

    //learn more about using constructors on an object
    DnDCharacter2() {
        strength = ability();
        dexterity = ability();
        constitution = ability();
        intelligence = ability();
        wisdom = ability();
        charisma = ability();
        hitpoints = 10 + modifier(constitution);
    }

    int ability() {
        int[] dices = new int[]{getDice(), getDice(), getDice(), getDice()};
        return Arrays.stream(dices).sum() - Arrays.stream(dices).min().getAsInt();
    }

    int modifier(int input) {
        return (int) Math.floor(((double) input - 10) / 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hitpoints;
    }

    private static int getDice() {
        return random.nextInt(6) + 1;
    }

    private static Random random = new Random();
}