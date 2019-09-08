/* Create an Arraylist to store Employee objects with ID, name and salary fields.
Display all employee objects.
Remove all employee from the list whose salary is <2000 and add them to a another list 'freshers'.
now show both the lists.*/  
package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee_main {
	private static final List<Employee> FresherList = null;

	public static void main(String [] args){
		
	 List <Employee>EmployeeList= new ArrayList<Employee>();
	 
	 EmployeeList.add(new Employee("suchrita ", 34000 ));
	 EmployeeList.add(new Employee("shikha ", 40000 ));
	 EmployeeList.add(new Employee("vidya ", 19000 ));
	 
	 for (Employee e: EmployeeList)
	 {
		 System.out.println(e);
	 }
	 
	 System.out.println("___________________");
	 
	 
	 
	 List <Employee>FresherList= new ArrayList<Employee>();
	 
	 Iterator<Employee> it = EmployeeList.iterator();
	 
	 while(it.hasNext()){
		 Employee e = it.next();
		 if(e.salary() < 20000){
			 FresherList.add(e);
			 it.remove();
		 }
	 }
	 System.out.println("___________________");
	 
	 
	 
	 Iterator<Employee> it1 = EmployeeList.iterator();
	 
	 while(it1.hasNext()){
		 System.out.println(it1.next());
		 
	 }
	 System.out.println("___________________");
	 
	
	 
	 
	 Iterator<Employee> it2 = FresherList.iterator();
	 
	 while(it2.hasNext()){
		 System.out.println(it2.next());
	}
}
}