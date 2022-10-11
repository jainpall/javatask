package oops.inheritance.hierarchical;

public class MainClass {
	public static void main(String[] args) {
		Lion lion = new Lion();
		Tiger tiger = new Tiger();
		
		lion.jump();
		lion.hunt();
		lion.rulingTheSavannah();
		
		tiger.jump();
		tiger.hunt();
		tiger.rulingTheJungle();
	}
}
