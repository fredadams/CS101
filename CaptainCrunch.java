//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Exercise 8.12. 1. 																												//
//The Captain Crunch decoder ring works by taking each letter in a string and adding 13 to it. 										//
//For example, ’a’ becomes ’n’ and ’b’ becomes ’o’. The letters “wrap around” at the end, so ’z’ becomes ’m’.						//
//Write a method that takes a String and that returns a new String containing the encoded version. 									//
//You should assume that the String contains upper and lower case letters, and spaces, but no other punc- tuation. 					//
//Lower case letters should be tranformed into other lower case letters; upper into upper. You should not encode the spaces.		//
//2. Generalize the Captain Crunch method so that instead of adding 13 to the letters, it adds any given amount. 					//
//Now you should be able to encode things by adding 13 and decode them by adding -13. Try it.										//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class CaptainCrunch {
	
	public static String decoderRing(String str) {
		char[] encode = new char[str.length()]; 			//assign length of string to new array size.
		for (int i = 0; i < str.length(); i++) {			//looping thru string in order to encode each character
			char ltr = str.charAt(i);						
			if (ltr >= 65 && ltr <= 90) {					//if ltr in the string is between 65 and 90 (upper case letters from ascii table)
				ltr = (char)((ltr - 65 + 13)%26 + 65); 
			}
			else if (ltr >= 97 && ltr <= 122) { 			//lower case alphabet letters in ascii table.
				ltr = (char)((ltr - 97 + 13)%26 + 97);
			}
			encode[i] = ltr; 
		} 
		return new String(encode); 
	} 

	public static String decoder(String str, int n) {
		char[] encode = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			char ltr = str.charAt(i);
			if (ltr >= 65 && ltr <= 90) {
				ltr = (char)((((ltr - 65 + n)%26) + 26)%26 + 65);
			}
			else if (ltr >= 97 && ltr <= 122) {
				ltr = (char)((((ltr - 97 + n)%26) + 26)%26 + 97);
			} 
		encode[i] = ltr; 
		} 
	return new String(encode); 
	}


	public static void main(String[] args) { 
		System.out.println(decoderRing(args[0]));
		System.out.println(decoder(args[0], Integer.parseInt(args[1])));
	} 
}