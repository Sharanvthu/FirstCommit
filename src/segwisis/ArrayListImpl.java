package segwisis;

import java.util.ArrayList;

public class ArrayListImpl {

	public static void main(String[] args) 
	{
		Student s=new Student(1, "nanu");
		Student s1=new Student(2, "neenu");
		Student s2=new Student(3, "avunu");
		Student s3=new Student(4, "ivunu");
		ArrayList<Student> arr=new ArrayList<Student>();
		arr.add(s);
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		
		for (Student student : arr) {
			
		}
	}

}
