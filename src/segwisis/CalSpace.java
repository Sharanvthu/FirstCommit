package segwisis;

import java.util.Scanner;

public class CalSpace {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your Sentence");
		String s=scan.nextLine();
		String[] c=s.split(" ");
		int space=0;
		for (int i = 0; i < c.length; i++) {
			space++;
		}
		System.out.println("The no's of space is :"+--space);
	}

}
