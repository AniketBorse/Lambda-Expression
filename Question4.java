/*
4) define a functional interface "Calculator" with an abstract method "int multiply(int a,int b)"
define a class "CalcDemo" with main method.
inside main using lambda create an implementation of "Calculator" , invoke "multiply()" method and display its result.
*/

package Day_14;

interface Calculator{
	int multiply(int a, int b);
}

public class CalcDemo {
	public static void main(String[] args) {
		Calculator c = (a, b)->{
			return a*b;
		};
		System.out.println(c.multiply(3, 9));
	}
}
