package part5;

public class ExceptionExample {

	public static void main(String[] args) {
		System.out.println("Program is started");
		System.out.println("Program in progress");

		int a=100;
		System.out.println(a/0);

		/*try {

		} catch(ArithmeticException) {

		System.out.println("");}
		 */
		String s=null;
		try {
			System.out.println(s.length());

		}catch (Exception e){// if we don't know the type of exception we can make Exception becz Exception is a super class of all Exception
			System.out.println("entred to cach");

		}
		String x="123";
		


		System.out.println("Program is completed");
		System.out.println("Program is existed");
	}

}
