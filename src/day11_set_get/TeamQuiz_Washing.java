package day11_set_get;

import java.util.Scanner;

class Washing{
	Scanner input = new Scanner(System.in);
	private int po,wa,co,we,clo,n1;
	public void power() { 
		System.out.println("1. 전원");
		System.out.println("2. 동작");
		System.out.println("3. 일시정지");
		po = input.nextInt();
		if(po == 1) {
			System.out.println("전원이 ON 되었습니다.");
		}else if(po== 2) {
			System.out.println("세탁기가 동작합니다.");
		}else if(po==3) {
			System.out.println("세탁기가 일시정지 되었습니다.");
		}else {
			System.out.println("없는 기능입니다.");
		}
	}
	
	public void closed() { 
		System.out.println("1. 닫힘");
		System.out.println("2. 열림");
		clo = input.nextInt();
		if(clo == 1) {
			System.out.println("문이 닫힙니다.");
		}else if(clo == 2) {
			System.out.println("문이 열립니다.");
		}
	}
	
	public void wei() {  
		System.out.println("빨래 무게 설정 : ");
		System.out.print("1~1000g >>> ");;
		we = input.nextInt();
		if(we <300) {
			System.out.println(we+"g입니다 물높이는 하입니다.");
			System.out.println("물높이가 설정되었습니다.");
		}else if(we <600 ) {
			System.out.println(we+"g입니다 물높이는 중입니다");
			System.out.println("물높이가 설정되었습니다.");
		}else if(we <1000) {
			System.out.println(we+"g입니다 물높이는 상입니다");
			System.out.println("물높이가 설정되었습니다.");
		}else {
			System.out.println("너무 많은 양입니다.");
		}
	}
	
	public void washing() { 
		System.out.println("1. 세탁");
		System.out.println("2. 탈수");
		System.out.println("3. 헹굼");
		wa = input.nextInt();
		if(wa == 1) {
			System.out.println("세탁기능이 추가됩니다.");
		}else if(wa == 2) {
			System.out.println("탈수기능이 추가됩니다.");
		}else if(wa==3) {
			System.out.println("헹굼기능이 추가됩니다.");
		}else {
			System.out.println("없는 기능입니다.");
		}
	}
	
	public void course() { 
		System.out.println("1. 표준 코스");
		System.out.println("2. 급속 코스");
		System.out.println("3. 이불 코스");
		co = input.nextInt();
		if(co == 1) {
			System.out.println("표준 코스를 선택하셨습니다.");
		}else if(co == 2) {
			System.out.println("급속 코스를 선택하셨습니다.");
		}else if(co== 3) {
			System.out.println("이불 코스를 선택하셨습니다.");
		}else {
			System.out.println("없는 기능입니다.");
		}
	}
	
	public void main() {
		while(true) {
			System.out.println("1. 전원");
			System.out.println("2. 세탁");
			System.out.println("3. 코스설정");
			System.out.println("4. 빨래 무게감지");
			System.out.println("5. 문 닫힘");
			n1 = input.nextInt();
			switch(n1) {
			case 1:
					power();
					break;
			case 2:
					washing();
					break;
			case 3:
					course();
					break;
			case 4:
					wei();
					break;
			case 5:
					closed();
					break;
				}
			}
	}
	
}

public class TeamQuiz_Washing {
	public static void main(String[] args) {
		Washing ex = new Washing();
		ex.main();
	}
}
