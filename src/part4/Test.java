package part4;


interface A{

	int a=10;//by defult variable in interface are static 
	void m1();//methode in interface is abstrct

}
public class Test implements A {
	
	//HERE WE CAN impement the method
	
	public void m1() {// modifier in class in default
		
		System.out.println("Test");
	}


	public static void main(String[] args) {
		
		A a=new Test();//creator the memory for the interface 
		a.m1();

	}

}
