package part2;

public class StaticExample {

	static int a=10;//static variable
	int b=20;//non static variable


	static void m1() {
		System.out.println("this is m1 static-method ");
		//
		//create object
		StaticExample se=new StaticExample();
		System.out.println(se.b);

	}
	void m2() {
		System.out.println("this is m2 not static-method ");
	};
	void m3() {
		System.out.println("this is m3 not static-method ");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	};


	public static void main(String[] args) {
		//static method can acces only static staf directly without creating object
		System.out.println(a);

		System.out.println(StaticExample.a);
		m1();
		StaticExample.m1();//by class name


	}

}
