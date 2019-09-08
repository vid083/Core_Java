
package Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Book_main 
{
	public static void main(String[] args) 
	{
		Set<Book> bookHashset = new HashSet<Book>();

		Book b1 = new Book("Harry", "general", "potter");
		Book b2 = new Book("girl", "Stakes", "larry");
		Book b3 = new Book("Youngpeople", "Dommy", "hatto");
		Book b4 = new Book("Lives", "Harry", "potter");
		Book b5 = new Book("girlinthecity", "Harry", "potter");
		Book b6 = new Book("Lifes", "Harry", "potter");
		
		bookHashset.add(b1);
		bookHashset.add(b2);
		bookHashset.add(b3);
		bookHashset.add(b4);
		bookHashset.add(b5);
		bookHashset.add(b6);
		
		for (Book book : bookHashset) 
		{
			System.out.println(book);
		}
		for (Book i  : bookHashset) 
		{
			int count = 0;
			for (Book j : bookHashset)
			{
				if (i.getpublisher().equals(j.getpublisher())) 
				{
					count++;
				}
			}
			   if (count > 1)
			   {
				System.out.println(i.getName());
   		       }
		 }
	 }
}