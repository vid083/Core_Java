package Collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import Collections.Student;
public class StudentSort_main {
	
	public static void main(String [] args)
	{
	 List <StudentSort>StudentSortList= new ArrayList<StudentSort>();
	 StudentSortList.add(new StudentSort("suchrita ", 21, 520, 9876543210l));
	 StudentSortList.add(new StudentSort("shikha ", 26, 553, 9876543211l));
	 StudentSortList.add(new StudentSort("vidya ", 22, 500, 9876543212l));
	 
	 for (StudentSort s: StudentSortList) {
		 System.out.println(s);
	 }
	 Collections.sort(StudentSortList);
	 
	 System.out.println("================================================");
		
		 for (StudentSort s: StudentSortList)
		 {
			 System.out.println(s);
		 }
		
	}
}