//////////////////////////////////////////////////////////////////////////////////////////
//Exercise 8.3. Encapsulate the code in Section 8.7 in a method named countLetters, 	//
//and generalize it so that it accepts the string and the letter as arguments.			//
//Then rewrite the method so that it uses indexOf to locate the a's, 					//
//rather than checking the characters one by one.										//
//////////////////////////////////////////////////////////////////////////////////////////

public class CountLetters {
	public static int countLetters(String str, char letter) {
    	int length = str.length();
    	int count = 0;
    	int index = str.indexOf(letter);

    	while (index < length) {
            if (index != -1) {
                System.out.println("The letter " + letter + " was found at " + str + "[" + index + "].");
                count = count + 1;
                index = str.indexOf(letter, index + 1);
            }
            else {
                break;
            }
        }

        if (count == 0) {
            System.out.println("The letter " + letter + " was NOT found in the str " + str);
        }
        else {
            System.out.println("The number of letter(s) '" + letter + "' found in the word '" + str + "' = " + count + ".");    
        }
        
        return count;
    }

	public static void main(String[] args) {
		//countLetters("alibaba banana", 'a');
        countLetters("aaaaa", 'a');
	}
}

/*String fruit = "banana";
int length = fruit.length();
int count = 0;
int index = 0;

while (index < length) {
    if (fruit.charAt(index) == 'a') {
        count = count + 1;
    }
    index = index + 1;
}
System.out.println(count);*/