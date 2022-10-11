package oops;

public class bank {



	
	private int custID;
	private String custName;	
	private String branch;
	private String location;
	
	public void submit form(){
		System.out.println(custName+"has submit the form");
	}
	public void collected atm(){
			System.out.println(custName+"has collected the atm");
	}
	public void transferedTheMoney(){
				System.out.println(custName+"has transferred the money");
				
	}
	public void displayDetails() {
		System.out.println("Customer ID:" +custID);
		System.out.println("Customer Name:" +custName);
		System.out.println("Branch:" +branch);
		System.out.println("Location:" +location);
		
	}
}







