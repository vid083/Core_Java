package Collections_CabCustomer;

import java.util.ArrayList;

public class CabCustomerService {
	
	private ArrayList<CabCustomer> cabcustomerList = new ArrayList();
	
	public void addCabCustomer(CabCustomer customer){
		cabcustomerList.add(customer);
	}
	
	public boolean isFirstCustomer(CabCustomer customer){
		
		for(CabCustomer c : cabcustomerList){
			if(c.getPhone() == customer.getPhone())
				return false;
		}
		return true;
	}
	
	public double calculateBill(CabCustomer customer){
		if(isFirstCustomer(customer))
			return 0.0;
		else if(customer.getDistance() <= 4)
			return 80.0;
		else{
			return (80 +(6 * (customer.getDistance()-4)));
		}
	}
	
	public String printBill(CabCustomer customer){
		return customer.getCustomerName()+" " + "Please pay your bill of Rs." + calculateBill(customer);
	}

}
