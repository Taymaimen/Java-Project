package conditionnelStatment;

public class JumpingStatements {

	public static void main(String[] args) {
		int day=3;
		switch (day)
		{
		case 1:System.out.println("sunday");
		case 2:System.out.println("Monday");
		case 3:System.out.println("tuesday");
		case 4:System.out.println("wednesday");
		case 5:System.out.println("thursday ");
		case 6:System.out.println("friday ");
		case 7:System.out.println("saturday");
		default :System.out.println("invalid test");
		}
	}

}
