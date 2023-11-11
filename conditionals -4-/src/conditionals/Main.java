package conditionals;

public class Main {

	public static void main(String[] args) {
		int sayi = 20;
		if (sayi<20) {
			System.out.println("sayı 20'den küçüktür");
		}else if(sayi==20){
			System.out.println("sayı 20'ye eşittir");
		}else if(sayi==21) { //koyduğum else iflerden birine uymadığında else ye geçiyor. else ife uyuyorsa else ye girmez
			System.out.println("Bu sayı büyülüdür");
		}		
		else {
			System.out.println("sayı 20'den büyüktür");
		}
		
		

	}

}
