package static_keyword;

public class Citizen {
	
	int citizenId;
	String citizenName;
	int age;
	
	//static variables
	static String nationality;
	
	static {
		nationality = "Indian";
		System.out.println("Static block of the citizen class executed");
	}
	
	public Citizen(int citizenId,String citizenName, int age) {
		super();
		this.citizenId = citizenId;
		this.citizenName = citizenName;
		this.age = age;
		System.out.println("Constructor executed");
	}
	
	void displayCitizenDetails() {
		System.out.println(citizenId);
		System.out.println(citizenName);
		System.out.println(age);
		
		System.out.println(nationality);
	}
	
	static void wishTheCountry(){
		System.out.println("Vande Matharam...");
	}


	}


