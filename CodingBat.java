package codingBatPractice;

public class CodingBat {

	public static void main(String[] args) {
		DnDCharacter d = new DnDCharacter();	
		System.out.println(d.getHitpoints());
		System.out.println(d.getConstitution());
		System.out.println(10 + d.modifier(d.getConstitution()));
	}
}
/*
 * assertEquals(character.getHitpoints(),10 +
 * character.modifier(character.getConstitution()));
 */
