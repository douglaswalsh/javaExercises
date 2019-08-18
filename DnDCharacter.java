package codingBatPractice;

import java.util.Arrays;
import java.util.Random;

class DnDCharacter {

	private int strength;
	boolean firstRunStrength = true;
	private int dexterity;
	boolean firstRunDexterity = true;
	private int constitution;
	boolean firstRunConstitution = true;
	private int intelligence;
	boolean firstRunIntelligence = true;
	private int charisma;
	boolean firstRunCharisma = true;
	private int wisdom;
	boolean firstRunWisdom = true;

	int ability() {
		int ability;
		int[] results = new int[4];
		Random rand = new Random();
		for (int i = 0; i < results.length; i++) {
			int roll = rand.nextInt(6) + 1;
			results[i] = roll;
		}
		Arrays.sort(results);
		return ability = results[1] + results[2] + results[3];
	}

	int modifier(int input) {
		// return (int) (input - 10 > 0 ? (input - 10)/2 : Math.floor((input -
		// 10)/2));
		if (input - 10 > 0) {
			return (input - 10) / 2;
		} else {
			// System.out.println("did the else");
			int i = input - 10;
			Double d = new Double(i);
			d = d / 2;
			// System.out.println("d " + d);
			d = Math.floor(d);
			// System.out.println("double = " + d);
			int b = d.intValue();
			return b;
		}
	}

	 int getStrength() {
		if (firstRunStrength) {
			firstRunStrength = false;
			return strength = ability();
		}
		return strength;
	 }

	 int getDexterity() {
		if (firstRunDexterity) {
			firstRunDexterity = false;
			return dexterity = ability();
		}
		return dexterity;
	}

	 int getConstitution() {
		if (firstRunConstitution) {
			firstRunConstitution = false;
			return constitution = ability();
		}
		return constitution;
	}

	 int getIntelligence() {
		if (firstRunIntelligence) {
			firstRunIntelligence = false;
			return intelligence = ability();
		}
		return intelligence;
	}

	 int getWisdom() {
		if (firstRunWisdom) {
			firstRunWisdom = false;
			return wisdom = ability();
		}
		return wisdom;
	}

	 int getCharisma() {
		if (firstRunCharisma) {
			firstRunCharisma = false;
			return charisma = ability();
		}
		return charisma;
	}

	int getHitpoints() {
		return 10 + modifier(getConstitution());
	}

}
