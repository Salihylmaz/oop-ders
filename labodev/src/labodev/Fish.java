package labodev;

public class Fish extends Animal implements Pet{
	
	String name;
	
	public Fish(int legs) {
		super(legs);
		
	}

	@Override
	public String getName() {
		return name;
		
	}

	@Override
	public void setName(String name) {
		this.name=name;
		
	}

	@Override
	public void play() {
		System.out.println("Yuzer cok oynayamaz gibi");
		
	}
	protected void swim() {
		System.out.println("yuruyemez ayakları yok maalesef");
	}
	protected void eat() {
		System.out.println("Sadece yer");
	}
	protected void yaz()
	{
		System.out.println("Balik");
		System.out.println("---------");
		eat();
		swim();
		play();
		System.out.println("\n");
	}
}
