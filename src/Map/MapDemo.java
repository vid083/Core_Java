package Map;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> m = new HashMap<Integer, String>();
		m.put(2, "two");
		m.put(1, "one");
		m.put(143263, "larger");
		m.put(5, "five");
		m.put(524446, "five");
		
		System.out.println(m);
		Map<Integer,String> m1 = new TreeMap<Integer,String>(m);
		
		System.out.println(m1);
		
		
		Map<Integer,String> m2 = new TreeMap<Integer,String>();
		m2.put(2, "two");
		m2.put(1, "one");
		m2.put(14326, "larger");
		m2.put(5, "five");
		m2.put(524446, "five");
		System.out.println("m2 = " +m2);
	}

}
