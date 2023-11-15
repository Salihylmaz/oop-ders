package labodev;

public class Cat extends Animal implements Pet{
	
	String aname;
	
	public Cat(String name) {
		super(legs);
		this.aname=name;	
	}
	public Cat()
	{
		super(legs);
	}
	
	@Override
	public String getName() {
		return aname;
	}

	@Override
	public void setName(String name) {
		this.aname=name;
	}

	@Override
	public void play() {
		System.out.println("Oynar");
		
	}
	protected void yaz() {
		System.out.println("Kedi");
		System.out.println("---------");
		play();
		eat();
		System.out.println("\n");
	}
	
}
