package day11_set_get;

import java.util.Scanner;

class Tv{
	Scanner input = new Scanner(System.in);
	private int num1,num2,num3,vol,on,ch,c[] = {1,2,3,4,5,6,7,8,9,10};
	
	public void power() {
		System.out.println("1. ���� on");
		System.out.println("2. ���� off");
		System.out.println(">>> ");
		num1 = input.nextInt();
		if(num1 == 1) {
			System.out.println("���� ON �Ϸ�Ǿ����ϴ�.");
			on = on+1;
		}else {
			System.out.println("���� OFF �Ϸ�Ǿ����ϴ�.");
			on = on-1;
		}
	}
	
	public void volume() {
		onOff();
		System.out.println("1. ���� �ø���");
		System.out.println("2. ���� ������");
		System.out.println("3. ���� �����ϱ�");
		System.out.println("4. ���� ��������");
		System.out.println("5. ������");
		System.out.print(">>> ");
		num2 = input.nextInt();
		if(num2 == 1) {
			++vol;
			System.out.println("������ +1 �Ǿ����ϴ�.");
		}else if(num2 == 2){
			--vol;
			System.out.println("������ -1 �Ǿ����ϴ�.");
		}else if(num2 == 3) {
			System.out.print("���� �����ϱ� : ");
			vol = input.nextInt();
			System.out.println(vol+"���� ���� �Ϸ�");
		}else if(num2 == 4) {
			System.out.println("���� ������ "+vol+"�Դϴ�.");
		}
	}
	
	public void ch() {
		onOff();
		System.out.println("1. ä�� ����");
		System.out.println("2. ������");
		System.out.println(">>> ");
		num3 = input.nextInt();
		if(num3 == 1) {
			System.out.println("ä�� �Է� : ");
			ch = input.nextInt();
			for(int i=0; i<c.length; i++) {
			if(ch == c[i]) {
			System.out.println(ch+"ä�η� ����Ǿ����ϴ�.");
			break;
			}else if (ch > c.length){
				System.out.println("ä���� �������� �ʽ��ϴ�.");
				break;
			}
			}
		}
	}
	
	public void onOff() {
		if(on != 1){
			System.out.println("������ OFF �����Դϴ�.");
			}
	}
	
	public void main() {
		Tv st = new Tv();
		Scanner input = new Scanner(System.in);
		int num = 0;
		while(true) {
		System.out.println("1. ����");
		System.out.println("2. ���� ����");
		System.out.println("3. ä�� ����");
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
		System.out.println("1. ����");
		System.out.println("2. ���� ����");
		System.out.println("3. ä�� ����");
		System.out.println(">>> ");
		num = input.nextInt();
		switch(num) {
			case 1:
				System.out.println("1. ���� on");
				System.out.println("2. ���� off");
				System.out.println(">>> ");
				num1 = input.nextInt();
				if(num1 == 1) {
					System.out.println("���� ON �Ϸ�Ǿ����ϴ�.");
					on = on+1;
				}else {
					System.out.println("���� OFF �Ϸ�Ǿ����ϴ�.");
					on = on-1;
				}
			case 2:
				if(on != 1){
					System.out.println("������ OFF �����Դϴ�.");
					continue;}
				if(num ==2) {
					System.out.println("1. ���� �ø���");
					System.out.println("2. ���� ������");
					System.out.println("3. ���� �����ϱ�");
					System.out.println("4. ������");
					System.out.print(">>> ");
					num2 = input.nextInt();
					if(num2 == 1) {
						vol++;
						System.out.println(vol+"���� ������ +1 �Ǿ����ϴ�.");
					}else if(num2 == 2){
						vol--;
						System.out.println(vol+"���� ������ -1 �Ǿ����ϴ�.");
					}else if(num2 == 3) {
						System.out.print("���� �����ϱ� : ");
						vol = input.nextInt();
						System.out.println(vol+"���� ���� �Ϸ�");
					}
					else {
						break;
					}
				}
			case 3:
				if(on != 1){
				System.out.println("������ OFF �����Դϴ�.");
				continue;
				}
				System.out.println("1. ä�� ����");
				System.out.println("2. ������");
				System.out.println(">>> ");
				num3 = input.nextInt();
				if(num3 == 1) {
					System.out.println("ä�� �Է� : ");
					ch = input.nextInt();
					for(int i=0; i<c.length; i++) {
					if(ch == c[i]) {
					System.out.println(ch+"ä�η� ����Ǿ����ϴ�.");
					break;
					}else if (ch > c.length){
						System.out.println("ä���� �������� �ʽ��ϴ�.");
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
