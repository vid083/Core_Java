package Static_keyword;

public class Student1_Main {
	public static void main(String [] args){
		Student1 s1 = new Student1("vidya",60,40,80);
		Student1 s2 = new Student1("vivek",50,70,90);
		Student1 s3 = new Student1("madhu",50,70,90);
		
		
		System.out.println(s1 + "\n" + s2 + "\n" + s3 );
		
		Student1 s = Student1.Compare(s1, s2);
		System.out.println("Highest Percentage Student Info --> " +Student1.Compare(s,s3));
	}
	
	

}
