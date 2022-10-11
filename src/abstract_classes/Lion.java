package abstract_classes;

public class Lion extends Animal {
	@Override
	public void eat() {
		System.out.println("Lion loves to eat meat...");
		System.out.println("Eats more than 10 Kgs of meat a day");
	}
	
	
	@Override
	public void sleep() {
		System.out.println("Lion sleeps 16 hours a day");
	}
	@Override
	public void run() {
		System.out.println("Runs at 60km/h");
	}


	
}
	

