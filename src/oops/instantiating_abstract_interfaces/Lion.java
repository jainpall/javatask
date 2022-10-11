package oops.instantiating_abstract_interfaces;

public class Lion extends Cat{

	@Override
	public void eat() {
		System.out.println("The lion has eaten");
	}

	@Override
	public void sleep() {
		System.out.println("The lion has slept");
	}
	
	public void die() {
		System.out.println("Lion dies at 20 years");
	}
}
