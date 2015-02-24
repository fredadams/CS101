//////////////////////////////////////////////////////////////////////////////////////////////////////
//Exercise 12.5. Write a method named areFactors that takes an integer n and an array of integers,	// 
//and that returns true if the numbers in the array are all factors of n 							//
//(which is to say that n is divisible by all of them). HINT: See Exercise 6.1.						//
//////////////////////////////////////////////////////////////////////////////////////////////////////

public class AreFactors {
	public static boolean areFactors(int n, int[] array) {
		Boolean divisible = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i]%n == 0) {							//Are the numbers in factors devisible by the 1st number in args (args[0]).
				divisible = true;							//If so return true.
			}
			else {
				divisible = false;							//Else return false.
			}
		}
		return divisible;									//Return result.
	}

	/*public static void main(String[] args) {
		int [] theArray = {2, 4, 6, 7};
		System.out.println(areFactors(2, theArray));
	}*/

	public static void main(String[] args) {
		System.out.println("Assumption: The 1st number in the aray is the devider number for the rest of the numbers in the array.");
		System.out.println("Example: run with 2 4 6 7, means the numbers 4, 6, and 7 all have to be divisible by 2.");
		
		int[] factors = new int[args.length - 1];			//factors has same length as args - 1 since 1st number in array ars is the devider.
		for (int i = 1; i < args.length; i++) {				//since 1st number is the devider we start at 1 instead of 0.
			factors[i - 1] = Integer.parseInt(args[i]);		//array factors starts at args[1,....], hence factors[i-1] = args[i]
		}
		System.out.println(areFactors(Integer.parseInt(args[0]), factors));		//pass the devider and array of int to areFactors method.
	}
}