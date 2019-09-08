package Map;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class Book_main 
{
	public static void main(String [] args)
	{
		Map<Integer,Book>bookMap = new TreeMap<Integer,Book>();
		Book b1 = new Book("Harry Potter", "J.K Rowling");
		Book b2 = new Book("Hound Of Baskeravilla", "Sherlock Homes");
		Book b3 = new Book("Mahaprasthnam", "SreeSree");
		
		bookMap.put(b1.getId(), b1);
		bookMap.put(b2.getId(), b2);
		bookMap.put(b3.getId(), b3);
		 
	   System.out.println(bookMap);
	   
	   for(Map.Entry<Integer,Book> entry: bookMap.entrySet())
	   {
		   System.out.println(entry); 
		   System.out.println("Key :" +entry.getKey());
		   System.out.println("Value :" +entry.getValue()); 
	   }
	}
}
