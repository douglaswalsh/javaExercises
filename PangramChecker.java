package codingBatPractice;
import java.util.regex.*;
import java.util.Arrays;

public class PangramChecker {
	
	//alphabet used for matching the string
	String pattern = "abcdefghijklmnopqrstuvwxyz";

    public boolean isPangram(String input) {
    	//check if input matches alphabet, doesn't care about spaces, order, cases
    	//convert string to char array
    	char[] tempArray = input.toCharArray();
    	//sort char array in alphabetical order
    	Arrays.sort(tempArray);
    	//remove duplicates from the char array and add resulting chars to the string
    	boolean repeatedChar;
    	//String sortedInput = new String(tempArray);
    	String newString = "";
    	for (int i = 0; i <tempArray.length;i++){
    		repeatedChar = false;
    		for (int j = i + 1;j < tempArray.length;j++){
    			if (tempArray[i] == tempArray[j]){
    				repeatedChar = true;
    				break;
    			}
    		}
    		if (!repeatedChar){
    			newString = newString + tempArray[i];
    			//System.out.println("getting in there");
    		}
    	}
    	//removes spaces from the string
    	newString = newString.replaceAll("[^a-zA-Z0-9]", "");
    	System.out.println("this is the newString \t"+ newString);
    	System.out.println("this is the pattern \t"+ pattern);
    	return Pattern.matches(pattern, newString);
    }

}

