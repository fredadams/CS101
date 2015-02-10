public class SquareRoot {
	public static double squareRoot(double a) {
		double x0 = a/2;						//initial guess, you should use a/2
		double x1 = (x0 + a/x0)/2;				//x1 = (x0 + a/x0)/2

		while (Math.abs(x1 - x0) >= 0.0001) {	//recursive until the absolute value of xn − xn−1 is less than 0.0001
			System.out.println("x0 = " + x0 + ", x1 = " + x1 + ", absolute x1 - x0 = " + Math.abs(x1 - x0));
			x0 = x1;							//x0 becomes x1 if the absolute value of the two < 0.0001
			x1 = (x0 + a/x0)/2;					//x1 new value.
		}
		System.out.println("x0 = " + x0 + ", x1 = " + x1 + ", absolute x1 - x0 = " + Math.abs(x1 - x0));
		return(x1);								//(Math.abs(x1 - x0));
	}

	public static void main(String[] args) {
		squareRoot(9);
	}
}