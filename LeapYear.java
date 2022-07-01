package Day1Assignments;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 0;
		System.out.print("Enter the Year: ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println("Is a Leap Year!");		
			}
			else {
				System.out.println("Is not a Leap Year!");
			}
	}

}
