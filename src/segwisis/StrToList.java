package segwisis;

import java.util.ArrayList;
import java.util.List;

public class StrToList {

	public static void main(String[] args) {
		String s="sharan,basava,nanu,ninu";
		String[] s1=s.split(",");
		for (String str : s1) {
			System.out.println(str);
		}
		System.out.println("=======================================");
		List<String> lst=new ArrayList<String>();
		for (int i = 0; i < s1.length; i++) {
			lst.add(s1[i]);
		}
		
		for(String s4:lst) {
			System.out.println(s4);
		}
		
		
	}

}
