package Methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 1;
		boolean varMı = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMı = true;
				break;
			}
		}
		String mesaj="";
		if (varMı) {
			mesaj=aranacak+ " Sayısı mevcuttur ";
			mesajVer(mesaj);
		} else {
			mesaj= aranacak+ " Sayısı mevcut değildir ";
			mesajVer(mesaj);
		}
	}
	public static void mesajVer(String mesaj){
		System.out.println(mesaj);
	}

}
