//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Exercise 8.4. The purpose of this exercise is to review encapsulation and generalization.						//
//1. Encapsulate the following code fragment, transforming it into a method that takes a 						//
//   String as an argument and that returns the final value of count.											//
//2. In a sentence or two, describe what the resulting method does (without getting into the details of how).	//
//3. Now that you have generalized the code so that it works on any String,										// 
//   what could you do to generalize it more?																	//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class BalancedBrackets {
    public static int balancedBrackets (String s, char c1, char c2) {
        //String s = "((3 + 7) * 2)";
        int len = s.length();
        int i = 0;
        int count = 0;
        while (i < len) {
            //char c = s.charAt(i);
            //if (c == '(') {
            if (c1 == s.charAt(i)) {
                count = count + 1;
            }
            //else if (c == ')') {
            else if (c2 == s.charAt(i))  {
                count = count - 1;
            }
            i = i + 1;
        }
        System.out.println(count);
        return count;
    }
    
    public static void main(String[] args) {
        balancedBrackets("((3 + 7) * 2)", '<', '>');
        //balancedBrackets(args[0], Character.parseChar(args[1]), args[2]);
    }
}

//1. See above method balancedBrackets.
//2. Returns 0 if number of open brackets matches number of closed brackets, else returns the count of unmatched open or closed brackets.
//3. Make it work for any open/close type brackets. Examples: (), {}, [], <>.