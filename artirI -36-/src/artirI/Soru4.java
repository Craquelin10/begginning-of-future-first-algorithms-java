package artirI;

public class Soru4 {
	private static int i=2;
	private int no;
	public Soru4() {
		no = i++;
	}
	public Soru4(int i) {
		no = i;
	}
	public String geriVer() {
		return "no"+no;
	}

}
