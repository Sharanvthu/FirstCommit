package segwisis;

import java.util.Scanner;

public class FindVowels {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your String to Count Vowels and Consonents ");
		String s= scan.nextLine();
		int vowels=0;
		int consonents=0;
		for(char c:s.toCharArray())
		{
			if ((c==65||c==69||c==73||c==79||c==85)||(c==97||c==101||c==105||c==111||c==117))
			{
				vowels++;
			}
			else {
				consonents++;
			}
		}
		System.out.println("Vowels :"+vowels+"  consonents :"+consonents);
	}

}
