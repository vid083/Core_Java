package Classes_and_Objects;

public class Mobile_Main {
	public static void main(String[] args) {
		//Object Creation
		Mobile samsung = new Mobile();
		Mobile iphone = new Mobile();
		
		//Object.classmember
		samsung.RAM = 6;
		samsung.OS = "Andriod";
		samsung.displaysize = 5;
		
		iphone.RAM = 8;
		iphone.OS = "apple";
		iphone.displaysize = 5;
		
		System.out.println("RAM : " +samsung.RAM);
		System.out.println("OS : " +samsung.OS);
		System.out.println("displaysize : " +samsung.displaysize);
		
		samsung.calls();
		samsung.messages();

		
		System.out.println("RAM : " +iphone.RAM);
		System.out.println("OS : " +iphone.OS);
		System.out.println("displaysize : " +iphone.displaysize);
		
		iphone.calls();
		iphone.messages();
		
	}

}
