package segwisis;

public class NumExcep {

	public static void main(String[] args) {
		int res=10;
		if (res==0) {
			System.out.println("Done");
		} else {

			try 
			{
				throw new NumberException("Do not divide by zero");
				
			} 
			catch (Exception e) 
			{
			System.out.println(e.getMessage());

			}
			NumExcep n= new NumExcep();
			n.c
		}



	}

}
