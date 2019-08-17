package codingBatPractice;
public class ReverseString {
    String reverse(String inputString) {
        String newString = "";
        for (int i = 1; i < inputString.length() + 1;i++){
       newString += inputString.charAt(inputString.length()-i);	
        }
        return newString;
    }
}
