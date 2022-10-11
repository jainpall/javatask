package oops.instantiating_abstract_interfaces;

public abstract class Animal {
	public abstract void eat();
	public abstract void sleep();
	
	public void die() {
		System.out.println("animal died...");
	}
}
