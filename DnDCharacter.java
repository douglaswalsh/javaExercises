package codingBatPractice;

import java.util.Arrays;
import java.util.Random;

class DnDCharacter {
	
	//this does not calculate each value only once - how to do that?
	
	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int charisma;
	private int wisdom;
		
	int ability() {
		int ability;
		int[] results = new int[4];
		Random rand = new Random();
		for (int i = 0; i < results.length;i++){
			int roll = rand.nextInt(6)+1;
			results[i] = roll;
		}
		Arrays.sort(results);
		return ability = results[1] + results[2] + results[3];
    }

    int modifier(int input) {
     //return  (int) (input - 10 > 0 ? (input - 10)/2 : Math.floor((input - 10)/2));
    	if (input - 10 > 0){
    		return (input - 10)/2;
    	} else{
    		System.out.println("did the else");
    		int i = input - 10;
    		Double d = new Double(i);
    		d = d/2;
    		System.out.println("d " + d);
    		d = Math.floor(d);
    		System.out.println("double = " + d);
    		 int b = d.intValue();
    		return b;
    	}
    }

    final int getStrength() {
      return strength = ability();
    }

   final int getDexterity() {
    	return dexterity = ability();
    }

   final int getConstitution() {
    	return constitution = ability();
    }

  final  int getIntelligence() {
    	return intelligence = ability();
    }

   final int getWisdom() {
    	return wisdom = ability();
    }

   final int getCharisma() {
    	return charisma = ability();
    }

    int getHitpoints() {
       return 10 + modifier(constitution);
    }

}

