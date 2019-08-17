package codingBatPractice;

public class ArmstrongNumbers {
	boolean isArmstrongNumber(int numberToCheck) {
		//a number that is the sum of its own digits each raised to the power of the number of digits.	
		int x = numberToCheck;
		int numberOfDigits = String.valueOf(numberToCheck).length();
		
		int[] digits = new int[numberOfDigits];
		for (int i = 0; i < numberOfDigits;i++) {
			digits[i] = x%10;
			x = x/10;
		}
		
		int sum = 0;
		for (int value : digits){
			sum += Math.pow(value, numberOfDigits);
		}
		System.out.println(sum);
		return numberToCheck == sum;
	}
}
