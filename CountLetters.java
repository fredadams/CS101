//////////////////////////////////////////////////////////////////////////////////////////
//Exercise 8.3. Encapsulate the code in Section 8.7 in a method named countLetters, 	//
//and generalize it so that it accepts the string and the letter as arguments.			//
//Then rewrite the method so that it uses indexOf to locate the a's, 					//
//rather than checking the characters one by one.										//
//////////////////////////////////////////////////////////////////////////////////////////

public class CountLetters {
	public static void countLetters(String word, char ltr) {
    	int length = word.length();
    	int count = 0;
    	int index = word.indexOf(ltr);

    	while (index <= length) {
    		if (word.indexOf(ltr, index) != -1) { 
                count = count + 1;
                System.out.println("The char " + ltr + " was found at " + word + "[" + index + "].");
                if (index == 0) {
                    index = word.indexOf(ltr, 1);
                }
                else {
                    index = index + word.indexOf(ltr, index);    
                }
                
			}
 			else {
 				System.out.println("The char " + ltr + " was found at " + word + "[" + index + "].");
    		}
    	}	
    	System.out.println("The number of letter(s) '" + ltr + "' found in the word '" + word + "' = " + count + ".");
	}

	public static void main(String[] args) {
		countLetters("aaaaa", 'a');
	}
}