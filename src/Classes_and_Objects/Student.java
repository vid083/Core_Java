package Classes_and_Objects;

public class Student {
	private int id;
	private String name;
	private String address;

	//constructor --> without arguments
	protected Student(){
	
	}
	
	// constructor to get all details together --> with arguments
	protected Student(int id, String name, String address){
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	
	// to get any one detail separately 
	// set--> for run time
	protected void setId(int id){
		this.id = id;
	}
	protected void setName(String name){
		this.name = name;
	}
	protected void setAddress(String address){
		this.address = address;
	}
	
	// get --> compile
	protected int getId(){
		return id;
	}
	protected String getName(){
		return name;
	}
	protected String getAddress(){
		return address;
	}
	
	
	void getDetails(){
		System.out.println("ID : " +id);
		System.out.println("Name: " +name);
		System.out.println("Address: " +address);

		// to print
/*public String toString(){
String S = "ID: " +id + "name :" +name+ "address : " +address;
return s;  */
	}
}