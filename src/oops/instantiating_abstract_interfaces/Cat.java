package oops.instantiating_abstract_interfaces;

public class Cat extends Animal{

	@Override
	public void eat() {
		System.out.println("The Cat has eaten");
	}

	@Override
	public void sleep() {
		System.out.println("The Cat has slept");
	}

}
