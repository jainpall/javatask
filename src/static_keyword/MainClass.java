package static_keyword;

public class MainClass {
	
	static {
		System.out.println("Static block of the MainClass exceuted");
	}
	
	public static void main(String [] args) {
		System.out.println("Main method executed");
		
		Citizen dinesh = new Citizen(1234, "Dinesh Kumar", 29);
		Citizen raja = new Citizen(145, "Raja Rajandran", 30);
		Citizen clementina = new Citizen(166, "Clementina", 26);
		
//		Citizen.nationality = "Indian";
		
		dinesh.displayCitizenDetails();
		raja.displayCitizenDetails();
		clementina.displayCitizenDetails();
		
		Citizen.wishTheCountry();
		
	}

}
