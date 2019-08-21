package Classes_and_Objects;

public class Student_Main {
	public static void main(String[] args){
		
		Student S1 = new Student();
		
		S1.setName("Vidya");
		S1.setAddress("HYD");
		
		System.out.println(S1.getName());
		System.out.println(S1.getAddress());
		System.out.println("____________");
		
		Student S2 = new Student(102, "Vivek", "NJ");
		S2.getDetails();
		S2.setAddress("NY");
		System.out.println("_____________");
		S2.getDetails();
	
	}

}
