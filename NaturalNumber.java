package codingBatPractice;

import java.util.ArrayList;
import java.util.List;

public class NaturalNumber {

	private int sum = 0;
	private int number;
	
	public NaturalNumber(int testNumber) {
		if (testNumber <= 0){
			  throw new IllegalArgumentException("You must supply a natural number (positive integer)");
		}
		
		number = testNumber;
		List<Integer> factors = new ArrayList<>();
		for (int i = 1; i < testNumber; i++) {
			if (testNumber % i == 0) {
				factors.add(i);
				sum += i;
			}
		}
	}

	public Classification getClassification() {
		System.out.println("sum = " + sum);
		System.out.println("number = " + number);
		if (sum > number) {
			return Classification.ABUNDANT;
		} else if (sum == number) {
			return Classification.PERFECT;
		} else {
			return Classification.DEFICIENT;
		}

	}

}
