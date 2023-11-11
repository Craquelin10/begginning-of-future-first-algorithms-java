package miniProjeAsalSayı;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		int number = 23;
		//int remainder = number % 2; // remainder = kalan
		//System.out.println(remainder);
		boolean isPrime = true; // başlangıçta asallığını doğru tanımladım
		
		if(number==1) {
			System.out.println("Sayı Asal Değildir");
			return;
		}
		
		if(number<1) {
			System.out.println("Geçersiz Sayı");
			return;
		}
		
			for(int i=2 ; i<number ; i++) {
				if(number % i == 0 ) { // sayının i ye bölümünden modu 0 sa yani tam bölünüyorsa
					isPrime = false; // asallığını yanlışa çevir
				}
		}
		if(isPrime == true) {
			System.out.println("Sayı Asaldır");
		}else {
			System.out.println("Sayı Asal Değildir");
		}
			
		}
		
		

	}


