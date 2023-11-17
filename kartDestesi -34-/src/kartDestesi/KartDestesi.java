package kartDestesi;

public class KartDestesi {
	private int KART_SAYISI = 52;
	
	private Kart [] deste;
	
	public KartDestesi() {
		String [] No = {"As","Papaz","Kız","Vale","2","3","4","5","6","7","8","9","10"};
		String [] Tur = {"Kupa","Karo","Sinek","Maça"};
		
		deste = new Kart[KART_SAYISI];
		
		for(int i=0;i<deste.length;i++) {
			deste[i] = new Kart (No[i%13] , Tur[i/13] );
		}
		System.out.println("deste");
	}

}
