package Customer_Service_System;


import java.util.Scanner;
public class Main_Service {

	
public static void main(String[] args)	 {

Scanner scanner =  new Scanner(System.in);
queue_imp queue = new queue_imp(); //object instantiation or object creation 
//queue_imp is what connects IMLENTS CLASS TO MAIN CLASS

String[] customersList = {"Alice", "Bob", "Charlie", "David", "Emma"}; //REFERENCE STORAGE FOR THE COMPUTER

boolean running = true;




while (running) {
System.out.println("Customers in Queue: " + queue.getCustomers()); //

	if (!queue.isEmpty()) {
	    System.out.println("Serving Customer: " + queue.getCustomers().get(0));
	} else {
	    System.out.println("Serving Customer: None");
}
System.out.println("Please choose action:");
System.out.println("1. Add customer");
System.out.println("2. Remove a customer");
System.out.println("3 See queued customer");
System.out.println("4. Check if the line is empty");
System.out.println("5. Exit ");
System.out.println("Enter your choice: ");
int choice = scanner.nextInt();
	

if (choice == 1) { //ADD OPTION
System.out.println("Please choose customer to add in the queue: ");
System.out.println("1. Alice ");
System.out.println("2. Bob ");
System.out.println("3. Charlie ");
System.out.println("4. David ");
System.out.println("5. Emma ");
System.out.println("Enter your choice: ");
int choice2 = scanner.nextInt();
	
//  if (choice == 1) duplicate customer add



queue.enqueue(customersList[choice2 - 1 ]); //[choice - 1] is just the same with  - customerList[1] = Alice
System.out.println(customersList[choice2 -1] + " Has been added to the queue. "); //confirmation of adding
System.out.println("                ");

}

if (choice == 2) { // REMOVE OPTION
    String servedCustomer = queue.dequeue(); // removes the first customer
    System.out.println(servedCustomer + " has been removed from the queue");
    System.out.println();
}

if (choice == 3) { // PEEK / SEE NEXT CUSTOMER
    String nextCustomer = queue.peek();
    System.out.println("Next customer in the queue: " + nextCustomer);
    System.out.println();
}


if (choice == 4) { // CHECK IF EMPTY
    if (queue.isEmpty()) {
        System.out.println("The queue is empty.");
    } else {
        System.out.println("The queue has customers waiting.");
    }
    System.out.println();
}

if (choice == 5) { // EXIT
    running = false;
    System.out.println("Exiting program. Goodbye!");
}

}
	
}
	
}

//LIMITATIONS
//if (!queue.customers.contains(selectedCustomer)
