package Dizi_1;
import java.util.*;
public class Dizi_1 {

	public static void main(String[] args) {
		
		int freq[] = {0,0,0,0,0,0};
		int zar;
		int i;
		
		for (i=0;i<10;i++){
			zar=zarAt();
			System.out.println("Gelen zar ="+zar);
			switch(zar){
			case 1: freq[0]++;
			break;
			case 2: freq[1]++;
			break;
			case 3: freq[2]++;
			break;
			case 4: freq[3]++;
			break;
			case 5: freq[4]++;
			break;
			case 6: freq[5]++;
			break;
			}
			
		}
		
		System.out.println("Freakanslar");
		for(i=0;i<freq.length;i++) {
			System.out.printf("---%d. rakamdan %d tane geldi",i+1,freq[i]);
			System.out.println("---");
			}
	}
			
			
		
		
public static int zarAt() {
		Random rnd = new Random();
		return 1+rnd.nextInt(6);
	}
	}


