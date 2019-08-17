package codingBatPractice;

import java.lang.Math;

public class Darts {
	private double hyp;
	  public Darts(double x, double y) {  
		   hyp = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	    }

	    int score() {
	    	int outerRadius = 10;
	    	int midRadius = 5;
	    	int innerRadius = 1;
	       if (hyp <= outerRadius && hyp > midRadius){
	    	   return 1;
	       }
	       if (hyp <= midRadius && hyp > innerRadius){
	    	   return 5;
	       }
	       if (hyp <= innerRadius){
	    	   return 10;
	       }
	       return 0;
	    }
	    /*The outer circle has a radius of 10 units (This is equivalent to the total radius for the entire target)
	    //the middle circle a radius of 5 units 
	    and the inner circle a radius of 1.*/
}
