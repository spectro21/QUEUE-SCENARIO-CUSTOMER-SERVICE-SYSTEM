package Customer_Service_System;

import java.util.ArrayList;

public class queue_imp extends queue_abs{

	
public ArrayList<String> customers = new ArrayList<>(); //declare arraylist constructor uisng the array name customers

public ArrayList<String> getCustomers() {
    return customers; //getter method for the 1st in the queue
}

public queue_imp() { //constructor for the storage

	
}

@Override //method 1 adding customer
public void enqueue(String customer) { //customer is the actual storage
	if (customers.contains(customer)) { //returns true if that name already exists in the list, otherwise false.
        System.out.println(customer + " is already in the queue. Please try again later.");
    } else {
        customers.add(customer); //THIS the one who collects the content and put it in the storage
    }
}

@Override //removing a customer to the queue
public String dequeue() {
	if (!isEmpty()) { //icheck kung naay sulod an list
	return customers.remove(0);
}   else {
      return "Queue is empty! ";	//kung walay sulod, kini nga value ang ihatag
}
}

@Override // see customer in queue / tan awon lang dili tangalon
public String peek() {
	if (!isEmpty()) { //icheck kung naay sulod and list
	return customers.get(0); //if not empty ihatag sako anf value nga naa sa sulod
	
}   else {
      return "Queue is empty"; //kung walay sulod, kini nga value ang ihatag
}

}

@Override
public boolean isEmpty() {
	if (customers.isEmpty()) {
		return true ;
	
}   else  {
	    return false;
	
}
	

	
	
}



}

//PROBLEM FACED 
//1. USED VOID WHILE USING RETURN VALUE METHOD ON DEQUEUE AND PEEK
//2. HAVENT USED STRING ON DEQUEUE AND PEEK EVEN IT RETURNS A  VALUE OF STRING
//3. I USED VOID ON ABSTRACT EVEN MY METHODS USES STRING AND BOOLEAN AND RETURN VALUES
//4. DIDNT MAKE A CONSTRUCTOR FOR THE LIST OF NAMES IN THE ARRAYLIST


//MINOR ERRORS
//1. used customer instead of customers on line 43
//2. 

//NOTES
//1. YOU CAN DIRECTLY STATE A RETURN STATEMENT BUT YOU CAN ALSO USE ELSE EXPLICTLY
