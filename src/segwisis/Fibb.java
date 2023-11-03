package segwisis;

public class Fibb {
	static int  n1=0,n2=1,n3=0;
static	int printfib(int count)
	{
	if(count>0)
	{
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.println(n3);
	}
	else 
	{
		System.exit(0);
	}
	return printfib(count-2);
	}
	public static void main(String[] args) {
		System.out.println(n1);
		System.out.println(n2);
		Fibb.printfib(15);
	}
}
