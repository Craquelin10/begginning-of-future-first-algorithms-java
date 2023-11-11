package StringsDemo;

public class Main {

	public static void main(String[] args) {
		
		String mesaj ="Bugün hava çok güzel";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayısı : "+mesaj.length()); // cümlenin uzunluğunu veriyo
		System.out.println("5. Eleman : "+mesaj.charAt(4)); // n. sıradaki elemanı buluyo
		System.out.println(mesaj.concat(" Yaşasın!")); // mesaj komutuna yeni kelime ekliyo
		System.out.println(mesaj.startsWith("B")); //B ile başlıyorsa true döndürür
		System.out.println(mesaj.endsWith("l")); // l ile bitiyorsa true verir
		char[] karakterler = new char[5];
		mesaj.getChars(0,5,karakterler,0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("a")); //sağdan başlar ilk gördüğünü verir
		System.out.println(mesaj.lastIndexOf("a")); //soldan başlar ilk gördüğünü sağa göre verir
		
		
		
		

	}

}
