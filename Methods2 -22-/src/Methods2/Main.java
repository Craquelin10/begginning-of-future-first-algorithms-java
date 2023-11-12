package Methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj = sehirVer(); // alt tarafta sehirVer olarak tanımladığım metodu çağırdım
		System.out.println(yeniMesaj); // burda da yazdırdım
		int sayi = topla(15, 7); // alt tarafta topla olarak tanımladığım metodu çağırıp girdiğim değerlere
									// uyguladı
		System.out.println(sayi); // uyguladığım şeyi yazdırdı
		int toplam = topla2(2, 3, 5, 8, 4, 4);
		System.out.print(toplam);
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void güncelle() {
		System.out.println("Güncellendi");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) { // ... anlamı istediğim kadar veri girdisi sağlayabilrim oraya
		int toplam = 0;
		for (int sayi : sayilar) { // int sayi : sayilar  sayiların içindeki tüm değerleri tek tek sayi adı altında gez 
			toplam += sayi;
		}
		return toplam;
	}

	public static String sehirVer() {
		return "Ankara";

	}

}
