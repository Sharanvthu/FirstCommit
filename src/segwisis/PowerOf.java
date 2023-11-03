package segwisis;

import java.util.Scanner;

public class PowerOf {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number ");
		int i=scan.nextInt();
		System.out.println("The 2 to the power of "+i+"is :"+Math.pow(2, i));
	}

}
