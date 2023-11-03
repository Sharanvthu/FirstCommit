package segwisis;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your String");
		String s=scan.nextLine();
		int i=0;
		for(char c:s.toCharArray())
		{
			i++;
		}
		System.out.println("The length of String is :"+i);
	}

}
