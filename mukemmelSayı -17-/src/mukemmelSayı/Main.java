package mukemmelSayı;

public class Main {

	public static void main(String[] args) {
		int number=28;
		int j = 0;
		
		for (int i=1 ; i<number ; i++) {
			if(number % i==0) {
			j = j + i ;
			}
		}
			
			if (j==number) {
				System.out.println("Sayı Mükemmel Sayıdır");
				
			}else {
				System.out.println("Sayı mükkemmel sayı değildir");
				
			}
		}
		
	}

		

	


