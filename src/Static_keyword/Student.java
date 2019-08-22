package Static_keyword;

public class Student {
	
	private int id;
	private String name;
	private String address;
	private static int idGenerator = 1;
	
	Student(){
		id = idGenerator++;
	}
	
	Student(String name, String address){
		this();
		this.name = name;
		this.address = address;
	}
	
	public String toString(){
		return "id = " + id + ", Name = " + name + ", Addres = " + address;
	}

}
