package day11_set_get;

import java.util.Scanner;

class Styler{
	
	Scanner input = new Scanner(System.in);
	
	private int stm,re,dr,end,n1;
	
	public void steam() {	
		System.out.println("1. ���� ���ֱ�");
		System.out.println("2. ����� Ŭ����");
		System.out.println("3. ������");
		System.out.println(">>> ");
		stm = input.nextInt();
		if(stm == 1) {
			System.out.println("���� ���ֱ⸦ �����մϴ�.");
		}else if(stm == 2) {
			System.out.println("����� Ŭ������ �����մϴ�.");
		}else if(stm > 3){
			System.out.println("���� ����Դϴ�.");
		}
	}
	
	public void remove() { 
		System.out.println("1. ��������");
		System.out.println("2. ��������");
		System.out.println("3. ������");;
		System.out.println(">>> ");
		re = input.nextInt();
		if(re == 1) {
			System.out.println("������ �����մϴ�.");
		}else if(re == 2) {
			System.out.println("������ �����մϴ�.");
		}else if(re>3){
			System.out.println("���� ����Դϴ�.");
		}
	}
	
	public void dry() { 
		System.out.println("������ �����մϴ�.");
	}
	
	public void pull() {
		System.out.println("���� ���ֱ� ����� ���۵Ǿ����ϴ�.");
		System.out.println("����� Ŭ���� ����� ���۵Ǿ����ϴ�.");
		System.out.println("���� ���� ����� ���۵Ǿ����ϴ�.");
		System.out.println("���� ���� ����� ���۵Ǿ����ϴ�.");
		System.out.println("���� ����� ���۵Ǿ����ϴ�.");
	}
	
	public void main() {
		while(true) {
			System.out.println("1. ����");
			System.out.println("2. Ż��");
			System.out.println("3. ����");
			System.out.println("4. ���ձ�� ����");;
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
