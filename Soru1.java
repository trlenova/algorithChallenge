
public class Soru1 {
	public static void main(String args[]) {
		f1(1,10);  // istediğiniz aralıgı verebilirsiniz
	}

	
	public static void f1(int small,int big) {
		if(!(small<=big)) {
			return;
		}
		int rnd =small + (int)(Math.random() * ((big - small) + 1));
		System.out.println(rnd); 
		f1(small,rnd-1);
		f1(rnd+1,big);
	}
}
