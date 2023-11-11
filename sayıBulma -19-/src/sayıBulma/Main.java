package sayıBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[]{1,2,5,7,9,0};
		int aranacak = 8;
		boolean varMı=false;
		
		for (int sayi : sayilar) {
			if(sayi==aranacak) {
				varMı = true;
				break;
			}
		}
		if(varMı) {
			System.out.println("Sayı mevcuttur");
		}else {
			System.out.println("Sayı mevcut değildir");
		}
		
		
		
		
		int[] numbers= new int [] {1,2,5,7,9,0};
		int toFind=17;
				
		for(int i=0; i<numbers.length ;i++) {
					if(toFind==numbers[i]) {
						System.out.println("Arrays Include This Number");
					return;
					}
						}
		System.out.println("Arrays Not Include This Number");
		
	}
}
