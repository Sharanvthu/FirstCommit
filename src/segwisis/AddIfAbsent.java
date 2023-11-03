package segwisis;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AddIfAbsent {

	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.putIfAbsent(1, "sharan");
		m.putIfAbsent(4, "sharan");
		m.putIfAbsent(3, "basava");
		m.putIfAbsent(2, "nanu");
		Set<Integer> key=m.keySet();
		for (int i : key) {
			System.out.println(i+" "+m.get(i));
		}
		
	}

}
