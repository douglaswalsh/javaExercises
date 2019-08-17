package codingBatPractice;

import java.util.Arrays;

public class ResistorColor {

	int colorCode(String color) {
		for (int i = 0;i<colors().length;i++){
			if (colors()[i] == color){
				return i;
			}			
		}
		return -1;
	}

	String[] colors() {
		String[] colorsArray = {"Black","Brown","Red","Orange","Yellow","Green","Blue","Violet","Grey","White"};
		 return colorsArray;
	}
}
