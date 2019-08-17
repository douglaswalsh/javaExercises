package codingBatPractice;

class RnaTranscription {

    String transcribe(String dnaStrand) {
     String rna = "";
    	for (int i = 0;i < dnaStrand.length();i++){
    	  char c = dnaStrand.charAt(i);
    	  if (c == 'G'){
    		 rna += "C"; 
    	  }
    	  if (c == 'C'){
     		 rna += "G"; 
     	  }
    	  if (c == 'T'){
    		  rna += "A";
    	  }
    	  if (c == 'A'){
    		  rna += "U";
    	  }
      }
    	
    	return rna;
    }

}



