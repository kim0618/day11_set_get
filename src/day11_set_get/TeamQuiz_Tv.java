package day11_set_get;

import java.util.Scanner;

class Tv{
	Scanner input = new Scanner(System.in);
	private int num1,num2,num3,vol,on,ch,c[] = {1,2,3,4,5,6,7,8,9,10};
	
	public void power() {
		System.out.println("1. 전원 on");
		System.out.println("2. 전원 off");
		System.out.println(">>> ");
		num1 = input.nextInt();
		if(num1 == 1) {
			System.out.println("전원 ON 완료되었습니다.");
			on = on+1;
		}else {
			System.out.println("전원 OFF 완료되었습니다.");
			on = on-1;
		}
	}
	
	public void volume() {
		onOff();
		System.out.println("1. 볼륨 올리기");
		System.out.println("2. 볼륨 내리기");
		System.out.println("3. 볼륨 설정하기");
		System.out.println("4. 현재 볼륨보기");
		System.out.println("5. 나가기");
		System.out.print(">>> ");
		num2 = input.nextInt();
		if(num2 == 1) {
			++vol;
			System.out.println("볼륨이 +1 되었습니다.");
		}else if(num2 == 2){
			--vol;
			System.out.println("볼륨이 -1 되었습니다.");
		}else if(num2 == 3) {
			System.out.print("볼륨 설정하기 : ");
			vol = input.nextInt();
			System.out.println(vol+"볼륨 설정 완료");
		}else if(num2 == 4) {
			System.out.println("현재 볼륨은 "+vol+"입니다.");
		}
	}
	
	public void ch() {
		onOff();
		System.out.println("1. 채널 선택");
		System.out.println("2. 나가기");
		System.out.println(">>> ");
		num3 = input.nextInt();
		if(num3 == 1) {
			System.out.println("채널 입력 : ");
			ch = input.nextInt();
			for(int i=0; i<c.length; i++) {
			if(ch == c[i]) {
			System.out.println(ch+"채널로 변경되었습니다.");
			break;
			}else if (ch > c.length){
				System.out.println("채널이 존재하지 않습니다.");
				break;
			}
			}
		}
	}
	
	public void onOff() {
		if(on != 1){
			System.out.println("전원이 OFF 상태입니다.");
			}
	}
	
	public void main() {
		Tv st = new Tv();
		Scanner input = new Scanner(System.in);
		int num = 0;
		while(true) {
		System.out.println("1. 전원");
		System.out.println("2. 볼륨 설정");
		System.out.println("3. 채널 변경");
		System.out.println(">>> ");
		num = input.nextInt();
		switch(num) {
			case 1:
				st.power();
				break;
			case 2:
				st.volume();
				break;
			case 3:
				st.ch();
				break;
		}
		}
	}
	
}


public class TeamQuiz_Tv {
	public static void main(String[] args) {
		
		Tv st = new Tv();
		st.main();
		
		
		
		
	/*	Styler st = new Styler();
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		int num1 = 0;
		int num2 = 0;
		int on=0;
		int vol=0 ;
		int num3=0;
		int ch =0;
		int[] c = {1,2,3,4,5,6,7,8,9,10};
		
		st.setOn(on);
		while(true) {
		System.out.println("1. 전원");
		System.out.println("2. 볼륨 설정");
		System.out.println("3. 채널 변경");
		System.out.println(">>> ");
		num = input.nextInt();
		switch(num) {
			case 1:
				System.out.println("1. 전원 on");
				System.out.println("2. 전원 off");
				System.out.println(">>> ");
				num1 = input.nextInt();
				if(num1 == 1) {
					System.out.println("전원 ON 완료되었습니다.");
					on = on+1;
				}else {
					System.out.println("전원 OFF 완료되었습니다.");
					on = on-1;
				}
			case 2:
				if(on != 1){
					System.out.println("전원이 OFF 상태입니다.");
					continue;}
				if(num ==2) {
					System.out.println("1. 볼륨 올리기");
					System.out.println("2. 볼륨 내리기");
					System.out.println("3. 볼륨 설정하기");
					System.out.println("4. 나가기");
					System.out.print(">>> ");
					num2 = input.nextInt();
					if(num2 == 1) {
						vol++;
						System.out.println(vol+"에서 볼륨이 +1 되었습니다.");
					}else if(num2 == 2){
						vol--;
						System.out.println(vol+"에서 볼륨이 -1 되었습니다.");
					}else if(num2 == 3) {
						System.out.print("볼륨 설정하기 : ");
						vol = input.nextInt();
						System.out.println(vol+"볼륨 설정 완료");
					}
					else {
						break;
					}
				}
			case 3:
				if(on != 1){
				System.out.println("전원이 OFF 상태입니다.");
				continue;
				}
				System.out.println("1. 채널 선택");
				System.out.println("2. 나가기");
				System.out.println(">>> ");
				num3 = input.nextInt();
				if(num3 == 1) {
					System.out.println("채널 입력 : ");
					ch = input.nextInt();
					for(int i=0; i<c.length; i++) {
					if(ch == c[i]) {
					System.out.println(ch+"채널로 변경되었습니다.");
					break;
					}else if (ch > c.length){
						System.out.println("채널이 존재하지 않습니다.");
						break;
					}
					}
				}else {
					break;
				}
		}
		}*/
		
		
		
		
		
		
		}
}
