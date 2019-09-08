package Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Student_main
{
	public static void main(String [] args)
	{
		// main object method for collection..................
	 List <Student>StudentList= new ArrayList<Student>();
	 StudentList.add(new Student("suchrita ", 34 , 45 ,56));
	 StudentList.add(new Student("shikha ", 40 , 55 ,76));
	 StudentList.add(new Student("vidya ", 45 , 65 ,86));
	 
	 for (Student s: StudentList)
	 {
		 System.out.println(s);
	 }
	 System.out.println("================================================");
		
		// for Arraylist............
		ArrayList <Student>StudentArrayList= new ArrayList<Student>();
		 StudentArrayList.add(new Student("suchrita ", 34 , 45 ,56));
		 StudentArrayList.add(new Student("shikha ", 40 , 55 ,76));
		 StudentArrayList.add(new Student("vidya ", 45 , 65 ,86));
		 
		 for (Student s: StudentArrayList)
		 {
			 System.out.println(s);
		 }
		
		// for linkedlist............
		 System.out.println("================================================");
				 LinkedList<Student>StudentLinkedList= new  LinkedList<Student>();
				 StudentLinkedList.add(new Student("reddy ", 44 , 55 ,66));
				 StudentLinkedList.add(new Student("singh ", 40 , 65 ,70));
				 StudentLinkedList.add(new Student("ramagiri ", 50 , 75 ,80));
				 
				 for (Student s: StudentLinkedList)
				 {
					 System.out.println(s);
				 }
	}
}