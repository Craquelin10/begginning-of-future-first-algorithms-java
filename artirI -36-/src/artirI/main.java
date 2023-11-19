package artirI;

public class main {

	public static void main(String[] args) {
		Soru4 test[] = {new Soru4(),new Soru4(),new Soru4(),new Soru4(2)};
		for(int i=0;i<test.length;i++) {
			System.out.println(test[i].geriVer());
		}

	
}

}
