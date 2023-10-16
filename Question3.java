/*
3) define a functional interface "MyInterface" with an abstract method "void fun()"

define a class Demo with two functions "static void perform" and main.

from main function pass lambda expression, collect it in "perform" method and invoke "fun()" function.
*/

package Day_14;

interface MyInterface{
	void fun();
}

public class Demo1 {
	static void perform() {
		System.out.println("My Function");
	}
	
	public static void main(String[] args) {
		MyInterface m = ()->{perform();};
		m.fun();
	}
}
