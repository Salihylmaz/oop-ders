package labodev;

public class Spider extends Animal {

	public Spider(int legs) {
		super(legs);
		
	}
	protected void eat() {
		System.out.println("yer");
	}
	protected void yaz() {
		System.out.println("Omurcek");
		System.out.println("---------");
		eat();
		System.out.println("\n");
	}
}
