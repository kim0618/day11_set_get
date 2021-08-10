package day11_set_get;

public class Ex05_set_get {

	private int kor, eng, math, sum;
	private double avg;
	
	public void setKor(int k) {
		this.kor = k;
	}
	public int getKor() {
		return kor;
	}
	
	public void setEng(int e) {
		this.eng = e;
	}
	public int getEng() {
		return eng;
	}
	
	public void setMath(int m) {
		this.math = m;
	}
	public int getMath() {
		return math;
	}
	
	public void setSum(int k,int e,int m) {
		this.sum = k+e+m;
	}
	public int getSum() {
		return sum;
	}
	
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public double getAvg() {
		return avg;
	}
}
