package codingBatPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
       List<Signal> signals = new ArrayList<Signal>();
    	//convert number to binary
        System.out.println(Integer.toBinaryString(number));
        List<String> messages = Arrays.asList(Signal.DOUBLE_BLINK, Signal.WINK);
        for (String a : messages){
        	System.out.println(a);
        }
        return signals;
    }

}
