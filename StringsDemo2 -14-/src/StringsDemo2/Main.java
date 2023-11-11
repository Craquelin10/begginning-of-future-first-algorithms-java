package StringsDemo2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		String yeniMesaj= mesaj.replace(' ','-');
		System.out.println(yeniMesaj);// ilk kutudaki karakter yerine 2. kutudakini koyuyor
		System.out.println(mesaj.substring(2,5)); //2. den sonrasını yazıyor / 4. ye kadar 4. yok
		
		for (String kelime : mesaj.split(" ")) { // boşluğa göre ayırıyor cümleyi
			System.out.println(kelime);
			
		}
		System.out.println(mesaj.toLowerCase()); //tüm cümleyi küçük harfli yapar
		System.out.println(mesaj.toUpperCase()); //tüm cümleyi büyük harfli yapar
		System.out.println(mesaj.trim()); // başındaki ve sonundaki boşlukları atar
		

	}

}
