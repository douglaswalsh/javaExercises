package codingBatPractice;

public class Acronym {

	/*
	 * Convert a phrase to its acronym. Help generate some jargon by writing a
	 * program that converts a long name like Portable Network Graphics to its
	 * acronym (PNG).
	 */

	private String[] phraseArray;
	private String Acronym = "";

	Acronym(String phrase) {
		phrase = phrase.replaceAll("_", "");
		phrase = phrase.replaceAll("'", "");
		phraseArray = phrase.split("[, -.@]+");
	}

	String get() {
		for (String a : phraseArray) {
			Acronym += a.toUpperCase().charAt(0);
		}
		return Acronym;

	}

}
