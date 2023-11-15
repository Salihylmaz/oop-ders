package labodev;

public class Animal {
	static int legs;
	public Animal(int legs) {
		super();
		//this.legs=legs;
	}
	
	protected void walk() {
		System.out.println("yurur");
	}
	protected void eat() {
		System.out.println("yer");
	}
	protected void yaz() {
		System.out.println("Animal");
		System.out.println("---------");
		walk();
		eat();
		System.out.println("\n");
	}
}
