package part3;
class Bike1 // add final - so we cannot extends into child class
{
	int speed=40;
	void run()
	{
		System.out.println(speed);
	}
	
	}

class Honda1 extends Bike1 // compile time error
{
	}

	
class Bike
{
	final void run() // add final - so we cannot overrid this method in child class
	{
		System.out.println("Running...........");
	}
	}

class Honda extends Bike
{
	/*void run() // compile time error
	{
		System.out.println("Started.....");
	}*/
	}
	public class FinalyMethodDemo {
	

	public static void main(String[] args) {

	}

}