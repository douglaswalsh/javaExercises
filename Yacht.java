package codingBatPractice;

public class Yacht {

	/*
	 * Given a list of values for five dice and a category, your solution should
	 * return the score of the dice for that category. If the dice do not
	 * satisfy the requirements of the category your solution should return 0.
	 */
	boolean win = false;
	int score = 0;
	int[] dice;

	Yacht(int[] dice, YachtCategory yachtCategory) {
		this.dice = dice;
		if (yachtCategory == yachtCategory.YACHT) {
			for (int i = 0; i < dice.length - 1; i++) {
				System.out.println("win " + win);
				System.out.println(dice[i]);
			}
			System.out.println(yachtWin());
			if (yachtWin()) {
				score();
			}
		}
	}

	int score() {
		return score;
	}

	boolean yachtWin() {
		for (int i = 0; i < dice.length - 1; i++) {
			if (dice[i] != dice[i + 1]) {
				break;
			} else {
				win = true;
				score = 50;
			}
		}
		return win;
	}
}

// try setting categories and scores in a map