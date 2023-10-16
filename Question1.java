/*
1) define a functional interface "First" with an abstract method "void disp1()" , default method "void disp2()" and a static method "void disp3()"

inside main function using lambda expression invoke "disp1()" and "disp2()" methods.
also invoke "disp3()" method inside main.
*/

package Day_14;

interface First{
	void disp1();
	
	default void disp2() {
		System.out.println("Display 2");
	}
	
	static void disp3() {
		System.out.println("Display 3");
	}
}

public class Q1 {
	public static void main(String[] args) {
		First f = ()->{System.out.println("Display 1");};
		f.disp1();
		
		First f1 = ()->{};
		f1.disp2();
		
		First f2 = ()->{First.disp3();};
		First.disp3();
	}
}
