package labodev;

public class Test {

	public static void main(String[] args) {
		Animal a1=new Animal(4);
		Spider a2=new Spider(8);
		Cat a3=new Cat("Nemo");
		Cat a5=new Cat();
		Fish a4=new Fish(0);
		
		a3.setName("kedi constructorlı:Dorry");
		a4.setName("Balik: Nemo");
		a5.setName("kedi boş: Marley");
		a1.yaz();
		a2.yaz();
		a3.yaz();
		a4.yaz();
		a4.setName("Dorry");
		a4.yaz();
		System.out.println("adi:"+a3.getName());
		System.out.println("adi:"+a4.getName());
		System.out.println("adi:"+a5.getName());
	}

}
