package segwisis;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter 1st num ");
		int n1=scan.nextInt();
		System.out.println("Enter 2nd num ");
		int n2=scan.nextInt();
		
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println(n1+" "+n2);
	}

}
