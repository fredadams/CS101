//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Exercise 6.9. Write a recursive method called power that takes a double x and an integer n and that returns x^n.					//
//Hint: a recursive definition of this operation is x^n = x*x^(n−1). Also, remember that anything raised to the zeroeth power is 1.	//
//Optional challenge: you can make this method more efficient, when n is even, using x^n = 􏰀(x^(n/2)^􏰁2.								//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Power {
	public static double power(double x, int n) {
		if (n == 0) {								//if n = 0, return 1
			x = 1;									//if n = 0, return 1
		}
		/*else {
			if (n%2 == 0) {							//when n is even use x^n = 􏰀(x^n/2)􏰁2.
				x = power(x, n/2);
				x = x * x; 							//when n is even use x^n = 􏰀(x^n/2)􏰁2.
			}*/
		else {
				x = x * power(x, (n - 1));			//x^x^(n-1) => recursion of Math.pow(x, n)
			}
		//}
	System.out.println(x);
	return x;
	}

	public static void main(String[] args) {
		power(3, 5);								//Invoke method power and pass values
	}
}