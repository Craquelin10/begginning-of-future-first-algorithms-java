package S1;
import java.util.Random;
public class S1 {
	
	private int no;
	private String ad;
	
	public S1(int no, String ad) {
		this.no = no;
		this.ad = ad;
	}

	public int getNo() {
		return no;
	}

	public String getAd() {
		return ad;
	}
	public static void main(String[] args) {
		
	}
	
	public static S1[] Degistir(S1 ogrArr[]) {
		Random ran = new Random();
		int len = ogrArr.length;
		int ran_num;
		S1 temp;
		for (int i = 0; i < len; i++) {
			ran_num = ran.nextInt(len);
			temp = ogrArr[i];
			ogrArr[i] = ogrArr[ran_num];
			ogrArr[ran_num] = temp;
		}
		for (int i = 0; i < len; i++) {
			System.out.println("Ad: " + ogrArr[i].getAd() + ",No: " + ogrArr[i].getNo());

		}
		return ogrArr;
	}
}
