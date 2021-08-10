package day11_set_get;

public class Ex05_MainClass {
	public static void main(String[] args) {
		
		int k=100, e=90, m=80;
		int sum = k+e+m;
		double avg = sum/3.0;
		Ex05_set_get ex = new Ex05_set_get();
		
		ex.setKor(k);
		ex.setEng(e);
		ex.setMath(m);
		ex.setSum(k, e, m);
		ex.setAvg(avg);
		System.out.println("±¹¾î : "+ex.getKor());
		System.out.println("¿µ¾î : "+ex.getEng());
		System.out.println("¼öÇÐ : "+ex.getMath());
		System.out.println("ÃÑÇÕ : "+ex.getSum());
		System.out.println("Æò±Õ : "+ex.getAvg());
	}
}
