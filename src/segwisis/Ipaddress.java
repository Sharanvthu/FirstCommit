package segwisis;

import java.util.Scanner;

public class Ipaddress {

static	String pattern="\\b(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b";
	public static void main(String[] args) {

		System.out.println("Enter the IP adress");
		Scanner scanner=new Scanner(System.in);
		String Ip="";
		while (scanner.hasNext()) {
			Ip = scanner.next();
			System.out.println(Ip.matches(Ipaddress.pattern));
			
		}
		
	}

}
