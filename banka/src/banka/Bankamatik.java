package banka;

import java.util.HashMap;
import java.util.Scanner;

public class Bankamatik {

	public static void main(String[] args) {
		
		HashMap<Integer,String> kart=new HashMap<Integer, String>();
		kart.put(12345,"Salih");
		kart.put(012345,"Ahmet");
		kart.put(234,"Mehmet");
		kart.put(2345,"Emre");
		kart.put(5678,"Huseyin");
		
		int para_s=1000;
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Isminizi giriniz");
		String isim=scan2.nextLine();
		System.out.println("Sifrenizi giriniz");
		int sifre=scan.nextInt();
		while(true)
		{
			if(kart.containsValue(isim)&& kart.containsKey(sifre))
			{
				System.out.println("1-)Para ekleme");
				System.out.println("2-)Para cekme");
				System.out.println("3-)Cıkma");
				System.out.println("4-)Bakiye kontrol");
				System.out.println("Hangi islemi yapmak istiyorsunuz");
				int islem=scan.nextInt();
				
				switch (islem) {
				case 1: {
					System.out.println("Ne kadar para ekleyeceksiniz");
					int ekle=scan.nextInt();
					para_s=para_s+ekle;
					break;
				}
				case 2:{
					System.out.println("Ne kadar para cekeceksiniz");
					int cikar=scan.nextInt();
					para_s=para_s - cikar;
					break;
				}
				case 3:{
					break;
				}
				case 4:{
					System.out.println(para_s);
					break;
				}
				default:{
					System.out.println("Yanlis secim");
					break;
				}
			}
			if(islem==3)
			{
				break;
			}
		}
		
	}	
		
	}

}
