package Collections_CabCustomer;
/*
Three classes are given to you, 
COJ_65_CabCustomer
COJ_65_CabCustomerService
COJ_65_CabCustomerServiceTester


Define the following in the class COJ_65_CabCustomer 

  private : custId int, customerName String, pickupLocation String,dropLocation String, distance int,phone long
 
  Generate Getter/Setter for the all fields.

  Implement the default constructor.

 Generate the parameterized constructor in the order to initialize the data members of a class custId,Name,Pickup,Drop,Distance,Phone

Define the following in the  class COJ_65_CabCustomerService and write logics in the following methods:
private : Generic ArrayList to represent list of CabCustomers.

addCabCustomer() : 
Description :Add the customer object parameter to the ArrayList  
Method name: addCabCustomer()
Return Type  :void 
Arguments: one of type COJ_65_CabCustomer

isFirstCustomer():
Description : Check whether the customer object parameter is already existing in arrayList.
Method Name:isFirstCustomer()
Return Type: boolean
Arguments: one of type  COJ_65_CabCustomer
Note : If phone number of a customer matches with any of the phone numbers of the array list, then consider it as a existing customer, otherwise consider
                the customer as new customer. 
 
calculateBill():
Method Name :calculateBill()
Argument:  COJ_65_CabCustomer
Return Type :double
Description:  method should calculate and return the customer bill based on following rules
                                1) if the customer is new return 0.0;
                                2) if the customer's travel distance is below or equal    
                                           to 4 kms then return 80.00 (Rs).
                                3) if the customer travel distance is above 4 kms calculate bill 80 + 6 per each km.

                                Ex: Any distance for new customer return 0;
                                                distance 4 return 80
                                                distance 6 return 80 + (2 * 6);
printBill():
Description: which should return the bill of the customer object parameter in the following format:

                                output : JOHN Please pay your bill of Rs.0.0
                                             SMITH Please pay your bill of Rs.180.0

Note : 
           Assume one customer books only one cab at a time.
           No charge for customer booking the cab for the first time.
           Customer's phone number is key to test a new customer or old customer.
           Distance should be treated as kilometers                                  

A class COJ_65_CabCustomerServiceTester is given with main() where you can create various objects and test them.