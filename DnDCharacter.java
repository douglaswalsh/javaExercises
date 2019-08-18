package codingBatPractice;

import java.util.Arrays;
import java.util.Random;

class DnDCharacter {
	
	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int charisma;
	private int wisdom;
	
	DnDCharacter(){
		strength 	 = ability();
		dexterity 	 = ability();
		constitution = ability();
		intelligence = ability();
		charisma	 = ability();
		wisdom 		 = ability();
	}
	
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
			int i = input - 10;
			Double d = new Double(i);
			d = d / 2;
			d = Math.floor(d);
			int b = d.intValue();
			return b;
		}
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
		return 10 + modifier(getConstitution());
	}

}
