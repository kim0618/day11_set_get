package day11_set_get;

import java.util.Scanner;

class Styler{
	
	Scanner input = new Scanner(System.in);
	
	private int stm,re,dr,end,n1;
	
	public void steam() {	
		System.out.println("1. 구김 없애기");
		System.out.println("2. 드라이 클리닝");
		System.out.println("3. 나가기");
		System.out.println(">>> ");
		stm = input.nextInt();
		if(stm == 1) {
			System.out.println("구김 없애기를 시작합니다.");
		}else if(stm == 2) {
			System.out.println("드라이 클리닝을 시작합니다.");
		}else if(stm > 3){
			System.out.println("없는 기능입니다.");
		}
	}
	
	public void remove() { 
		System.out.println("1. 먼지제거");
		System.out.println("2. 냄새제거");
		System.out.println("3. 나가기");;
		System.out.println(">>> ");
		re = input.nextInt();
		if(re == 1) {
			System.out.println("먼지를 제거합니다.");
		}else if(re == 2) {
			System.out.println("냄새를 제거합니다.");
		}else if(re>3){
			System.out.println("없는 기능입니다.");
		}
	}
	
	public void dry() { 
		System.out.println("건조를 시작합니다.");
	}
	
	public void pull() {
		System.out.println("구김 없애기 기능이 시작되었습니다.");
		System.out.println("드라이 클리닝 기능이 시작되었습니다.");
		System.out.println("먼지 제거 기능이 시작되었습니다.");
		System.out.println("냄세 제거 기능이 시작되었습니다.");
		System.out.println("건조 기능이 시작되었습니다.");
	}
	
	public void main() {
		while(true) {
			System.out.println("1. 스팀");
			System.out.println("2. 탈취");
			System.out.println("3. 건조");
			System.out.println("4. 종합기능 시작");;
			System.out.println(">>> ");
			n1 = input.nextInt();
			switch(n1) {
			case 1:
				steam();
				break;
			case 2:
				remove();
				break;
			case 3:
				dry();
				break;
			case 4:
				pull();
				break;
			}
		}
	}
}

public class TeamQuiz_Styler {
	public static void main(String[] args) {
		
		Styler st = new Styler();
		st.main();

	}
}
