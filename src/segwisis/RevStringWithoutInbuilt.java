package segwisis;

import java.util.Scanner;

public class RevStringWithoutInbuilt {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String  to reverse");
		String s=scan.nextLine();
		String rev = "";
		char[] c=s.toCharArray();
		for (char d : c) 
		{
			rev=d+rev;
		}
		System.out.println(rev);
	}

}
