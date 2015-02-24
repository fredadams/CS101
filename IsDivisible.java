//////////////////////////////////////////////////////////////////////////////
//Exercise 6.1. Write a method named isDivisible that takes two integers,   //
//n and m and that returns true if n is divisible by m and false otherwise. //
//////////////////////////////////////////////////////////////////////////////

public class IsDivisible {
    public static boolean isDivisible(int n, int m) {          
        if (n%m == 0) {         //if n is devisible by m return true
            return true;
        }
        else {                  // else return false
            return false;
	   }
    }

    public static void main(String[] args) {
        // System.out.println(isDivisible(9, 4));
        if (args.length%2 == 0) {
            for (int i = 0; i < args.length; i += 2)  {     //Increase i by 2 since you are passing 2 numbeers at a time in the array.
                //pass 1st and 2nd integer numbers of the array, then 3rd and 4th, 5th and 6th, etc.
                System.out.println(isDivisible(Integer.parseInt(args[i]), Integer.parseInt(args[i + 1])));
            }
        }
        else {
            System.out.println("You have to enter and even number of integers seperated by space.");
            System.out.println("First number devisible by second number, third number devisible by fourth, and so forth.");
        }
    }
}