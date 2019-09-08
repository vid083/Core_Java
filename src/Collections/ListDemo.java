package Collections;
	import java.util.ArrayList;
	import java.util.List;
	public class ListDemo 
	{
	public static void main(String []args)
	{
		ArrayList<Integer>l1 = new ArrayList<Integer>();
		l1.add(90);
		l1.add(45);
		l1.add(101);
		l1.add(1, 65);
		l1.set(3, 20);
		System.out.println(l1);
		
		List<Integer>l2 = new ArrayList<Integer>();
		l2.add(412);
		l2.add(151);
		System.out.println(l2);
		
		l2.addAll(l1);
		System.out.println(l2);
		
		l2.addAll(1,l1);
		System.out.println(l2);
	}
}
