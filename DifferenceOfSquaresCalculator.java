package codingBatPractice;

import java.lang.Math;

public class DifferenceOfSquaresCalculator {
	
	/*Find the difference between the square of the sum and the sum of the squares of the first N natural numbers.

The square of the sum of the first ten natural numbers is
(1 + 2 + ... + 10)² = 55² = 3025.

The sum of the squares of the first ten natural numbers is
1² + 2² + ... + 10² = 385.

Hence the difference between the square of the sum of the first
ten natural numbers and the sum of the squares of the first ten
natural numbers is 3025 - 385 = 2640.*/
	private double squareOfSum = 0;
	private double sumOfSquares = 0;

    int computeSquareOfSumTo(int input) {
        for (int i = 1; i <= input; i++){
        	squareOfSum = i + squareOfSum;
        }
        squareOfSum = Math.pow(squareOfSum,2);
       return (int) squareOfSum;        
    }

    int computeSumOfSquaresTo(int input) {
    	double j = 0;
       for (double i = 1; i <=input; i++){
    	   j = Math.pow(i,2);
    	   System.out.println("squares " + j);
    	   sumOfSquares = sumOfSquares + j;
       }
       return (int) sumOfSquares;
    }

    int computeDifferenceOfSquares(int input) {
       System.out.println("sum of squares \t" + computeSumOfSquaresTo(input));
       //computeSumOfSquaresTo(input);
       System.out.println("square of sum \t" + computeSquareOfSumTo(input));
      // computeSquareOfSumTo(input);
       System.out.println(sumOfSquares );
       System.out.println(squareOfSum  );
    	
    	return (int) Math.abs(squareOfSum- sumOfSquares);
    }

}

