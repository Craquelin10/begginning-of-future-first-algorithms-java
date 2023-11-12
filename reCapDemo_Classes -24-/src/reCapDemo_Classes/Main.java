package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 20;
		int sayi2= 10;
				
		DortIslem dortIslem = new DortIslem();
		
		System.out.println(DortIslem.Topla(sayi1,sayi2));
		System.out.println(DortIslem.Cıkar(sayi1,sayi2));
		System.out.println(DortIslem.Carp(sayi1,sayi2));
		System.out.println(DortIslem.Bol(sayi1,sayi2));
		
		

	}
}
