package Collections_CabCustomer;

public class CabCustomerServiceTester {
	
	public static void main(String[] args){
		CabCustomer c1 = new CabCustomer("sai", "Gachibowli", "Hitech city", 5, 9876543210l);
		CabCustomer c2 = new CabCustomer("vinay", "Gachibowli", "Hitech city", 10, 9876543211l);
		
		CabCustomerService service = new CabCustomerService();
		service.addCabCustomer(c1);
		
		System.out.println(service.printBill(c1));
		System.out.println(service.printBill(c2));
	}
}
