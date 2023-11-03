package segwisis;

import java.util.Scanner;

public class SumOfAll {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len=5;
		int sum =0;
		for (int i = 0; i < len; i++) 
		{
			sum=sum+scan.nextInt();
		}
		System.out.println("===================");
		System.out.println(sum);
	}

}
