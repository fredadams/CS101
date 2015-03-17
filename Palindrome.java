//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Exercise 8.9. 1. Create a new program named Palindrome.java.																						//
//2. Write a method named first that takes a String and returns the first																			//
//letter, and one named last that returns the last letter.																							//
//3. Write a method named middle that takes a String and returns a sub- string that contains everything except the first and last characters.		//
//Hint: read the documentation of the substring method in the String class. 																		//		
//Run a few tests to make sure you understand how substring works before you try to write middle.													//
//What happens if you invoke middle on a string that has only two letters? One letter? No letters?													//
//4. The usual definition of a palindrome is a word that reads the same both forward and backward, like “otto” and “palindromeemordnilap.” 			//
//An alternative way to define a property like this is to specify a way of testing for the property. For example, we might say, 					//
//“a single letter is a palindrome, and a two-letter word is a palindrome if the letters are the same, and any other word is a 						//
//palindrome if the first letter is the same as the last and the middle is a palindrome.															//
//Write a recursive method named isPalindrome that takes a String and that returns a boolean indicating whether the word is a palindrome or not.	//
//5. Once you have a working palindrome checker, look for ways to simplify it by reducing the number of conditions you check. 						//
//Hint: it might be useful to adopt the definition that the empty string is a palindrome.															//
//6. On a piece of paper, figure out a strategy for checking palindromes iteratively. There are several possible approaches, 						//
//so make sure you have a solid plan before you start writing code.																					//
//7. Implement your strategy in a method called isPalindromeIter.																					//
//8. Optional: Appendix B provides code for reading a list of words from file. Read a list of words and print the palindromes.						//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Palindrome {
	public static String first (String word) {
		return word.substring(0, 1);								//Return 1st char of word
	}

	public static String last (String word) {
		return word.substring(word.length() - 1);					//return last char of word
	}

	public static String middle (String word) {
		if (word.length() <= 2) {
			return ""; 
		}
		return word.substring(1, word.length() - 1);				//return middle char(s) of word
	}

	public static boolean isPalindrome (String word) {
		if (word.length() < 2) {
			return true;
		}
		else {
			boolean firstLastMatch = (first(word).equals (last(word)));
			if (firstLastMatch) {
				return isPalindrome(middle(word));
			}
			else {
				return false;
			}
		}
	}

	public static boolean isPalindromeIter(String word) {
		while (word.length() > 1) {
			if (!first(word).equals (last(word))) {
				return false;
			}
			word = middle(word); 
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "palindromeemordnilap";
		
		System.out.println("First letter in word '" + str + "' => " + first(str));
        System.out.println("Last letter in word '" + str + "' => " + last(str));
        System.out.println("Middle letter(s) in word '" + str + "' => " + middle(str));
        System.out.println("Is the word '" + str + "' a palindrome (recursive)? " + isPalindrome(str));
        System.out.println("Is the word '" + str + "' a palindrome (iterative)? " + isPalindromeIter(str));
    }
}