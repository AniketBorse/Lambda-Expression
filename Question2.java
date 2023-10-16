/*
2) define a functional interface "Second" with an abstract method "void disp4()".

define a class Demo with main function.
inside main function create two implementations of "Second" using lambda expression and display their names.
*/

package Day_14;

interface Second{
	void disp4();
}

public class Demo {
	public static void main(String[] args) {
		Second s = ()->{System.out.println("Display 1");};
		s.disp4();
		
		Second s1 = ()->{System.out.println("Display 2");};
		s1.disp4();
	}
}
