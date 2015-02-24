//////////////////////////////////////////////////////////////////////////////////////////////////////
//Exercise 12.5. Write a method named areFactors that takes an integer n and an array of integers,	// 
//and that returns true if the numbers in the array are all factors of n 							//
//(which is to say that n is divisible by all of them). HINT: See Exercise 6.1.						//
//////////////////////////////////////////////////////////////////////////////////////////////////////

public class AreFactors {
	public static boolean areFactors(int n, int[] array) {
		Boolean divisible = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i]%n == 0) {
				divisible = true;
			}
			else {
				divisible = false;
			}
		}
		return divisible;
	}

	public static void main(String[] args) {
		int [] theArray = {2, 4, 6, 7};
		System.out.println(areFactors(2, theArray));
	}

}