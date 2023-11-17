package elemanDeğiştirme;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int a[] = {1,2,3,4};
		int el;
		System.out.println("Hangi Eleman Değişsin");
		el=inp.nextInt();
		degis(a,el);
		
	}
	public static void degis(int a[], int el) {
		a[el]=a[el]*2;
		switch(el) {
		case 0:System.out.println(a[0]);
		break;
		case 1:System.out.println(a[1]);
		break;
		case 2:System.out.println(a[2]);
		break;
		case 3:System.out.println(a[3]);
		break;
		
		}
		
	}
	
}


