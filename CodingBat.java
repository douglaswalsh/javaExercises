package codingBatPractice;

public class CodingBat {

	public static void main(String[] args) {
		DnDCharacter d = new DnDCharacter();	
		System.out.println(Math.floor(-3.5));
		System.out.println("Strength = \t" + d.getStrength());
		System.out.println("charisma = \t" + d.getCharisma());
		System.out.println("Wisdom = \t" + d.getWisdom());
		System.out.println("Constitution = \t" + d.getConstitution());
		System.out.println(d.modifier(3));
	}
}
