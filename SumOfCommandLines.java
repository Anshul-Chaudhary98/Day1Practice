package Day1Assignments;

public class SumOfCommandLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 0, count = 0, sum = 0;
		for(int i = 0; i < args.length; i++) {
			try {
				number =Integer.parseInt(args[i]);
				sum = sum + number;
			}
			catch(NumberFormatException e) {
				System.out.println(e);
				count++;
				
			}
		}
		System.out.println("Sum of command lines: " + sum);
		System.out.println("Invalid Integers are: " + count);
		
	}

}
