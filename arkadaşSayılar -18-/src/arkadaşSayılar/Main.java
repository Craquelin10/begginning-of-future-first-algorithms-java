package arkadaşSayılar;

public class Main {

	public static void main(String[] args) {
		int number1= 220;
		int number2= 284;
		int t1 = 0;
		int t2 = 0;
				
		
		for(int i=1;i<number1;i++) {
			if(number1 % i ==0) {
			t1 = t1 +i ;
			}
		}
		for (int j=1;j<number2;j++) {
			if(number2 % j ==0) {
			t2 = t2 + j;
			}
		}
				if(t1==number2 && t2==number1){
					System.out.println("Arkadaş Sayılar");
					
				}else {
					System.out.println("Arkadaş Sayı değiller");
					
				}
				
				
			}
		}
	
				

	


