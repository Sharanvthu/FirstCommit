package segwisis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentStream {

	public static void main(String[] args) {

		Student std=new Student(1, "A", 40);
		Student std1=new Student(2, "B", 30);
		Student std2=new Student(3, "C", 20);
		Student std3=new Student(4, "D", 10);

		List<Student> ls=new ArrayList<Student>();
		ls.add(std);
		ls.add(std1);
		ls.add(std2);
		ls.add(std3);

		for (Student student : ls) 
		{
			System.out.println(student);
		}
		System.out.println("=============After apply condition==================");
		Map<Boolean,List<Student>>  data1=ls.stream().collect(Collectors.partitioningBy(i ->i.getId()>2));
		data1.forEach((i,k)->System.out.println(i+"\n"+k));
		System.out.println("===========================================");
		Map<Boolean,List<Student>>  data2=ls.stream().collect(Collectors.groupingBy(i->i.getId()>2));
		
		data2.forEach((i,k)->
		
		{	
			int m=0;
			if(i==true) 
			{
				
				while (m<2) {
					k.get(m).setMarks(k.get(m).getMarks()*4);
					
					m++;
				}
				System.out.print(i+"\n"+k);
				
				
			}
			else {
				
				System.out.println(i+"\n"+k);
			}
		});
		//		for (int j = 0; j < data1.size(); j++) 
		//		{
		//			for (Student student : ls) 
		//			{
		//				
		//					if (student.getId()>2) 
		//					{
		//						
		//						student.setMarks(data1.get(j));
		//						j++;
		//					}
		//					
		//				
		//				System.out.println(student);
		//			}
		//		}
	}



}
