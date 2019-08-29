package codingBatPractice;

import java.util.HashMap;

public class Scrabble {
	/*
	 * Given a word, compute the scrabble score for that word.
	 * ## Letter Values 
	 * ```text Letter Value 
	 * A, E, I, O, U, L, N, R, S, T 1 
	 * D, G 2 
	 * B, C, M, P 3
	 * F, H, V, W, Y 4 
	 * K 5 
	 * J, X 8 
	 * Q, Z 10 ```
	 */
	private String word;
	private int score;
	HashMap<Character, Integer> ScoresMap = new HashMap<Character, Integer>();

	
	Scrabble(String word) {
		ScoresMap.put ('a',1);
		ScoresMap.put ('b',3);
		ScoresMap.put ('c',3);
		ScoresMap.put ('d',2);
		ScoresMap.put ('e',1);
		ScoresMap.put ('f',4);
		ScoresMap.put ('g',2);
		ScoresMap.put ('h',4);
		ScoresMap.put ('i',1);
		ScoresMap.put ('j',8);
		ScoresMap.put ('k',5);
		ScoresMap.put ('l',1);
		ScoresMap.put ('m',3);
		ScoresMap.put ('n',1);
		ScoresMap.put ('o',1);
		ScoresMap.put ('p',3);
		ScoresMap.put ('q',10);
		ScoresMap.put ('r',1);
		ScoresMap.put ('s',1);
		ScoresMap.put ('t',1);
		ScoresMap.put ('u',1);
		ScoresMap.put ('v',4);
		ScoresMap.put ('w',4);
		ScoresMap.put ('x',8);
		ScoresMap.put ('y',4);
		ScoresMap.put ('z',10);
		
		score = 0;
		word = word.toLowerCase();
		
		for (int i = 0; i < word.length(); i++ ){
				if( ScoresMap.containsKey(word.charAt(i))){
					score += ScoresMap.get(word.charAt(i));
				}
			}
	}


	int getScore() {
		return score;
	}

}
