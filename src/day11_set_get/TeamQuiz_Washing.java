package day11_set_get;

import java.util.Scanner;

class Washing{
	Scanner input = new Scanner(System.in);
	private int po,wa,co,we,clo,n1;
	public void power() { 
		System.out.println("1. ����");
		System.out.println("2. ����");
		System.out.println("3. �Ͻ�����");
		po = input.nextInt();
		if(po == 1) {
			System.out.println("������ ON �Ǿ����ϴ�.");
		}else if(po== 2) {
			System.out.println("��Ź�Ⱑ �����մϴ�.");
		}else if(po==3) {
			System.out.println("��Ź�Ⱑ �Ͻ����� �Ǿ����ϴ�.");
		}else {
			System.out.println("���� ����Դϴ�.");
		}
	}
	
	public void closed() { 
		System.out.println("1. ����");
		System.out.println("2. ����");
		clo = input.nextInt();
		if(clo == 1) {
			System.out.println("���� �����ϴ�.");
		}else if(clo == 2) {
			System.out.println("���� �����ϴ�.");
		}
	}
	
	public void wei() {  
		System.out.println("���� ���� ���� : ");
		System.out.print("1~1000g >>> ");;
		we = input.nextInt();
		if(we <300) {
			System.out.println(we+"g�Դϴ� �����̴� ���Դϴ�.");
			System.out.println("�����̰� �����Ǿ����ϴ�.");
		}else if(we <600 ) {
			System.out.println(we+"g�Դϴ� �����̴� ���Դϴ�");
			System.out.println("�����̰� �����Ǿ����ϴ�.");
		}else if(we <1000) {
			System.out.println(we+"g�Դϴ� �����̴� ���Դϴ�");
			System.out.println("�����̰� �����Ǿ����ϴ�.");
		}else {
			System.out.println("�ʹ� ���� ���Դϴ�.");
		}
	}
	
	public void washing() { 
		System.out.println("1. ��Ź");
		System.out.println("2. Ż��");
		System.out.println("3. ���");
		wa = input.nextInt();
		if(wa == 1) {
			System.out.println("��Ź����� �߰��˴ϴ�.");
		}else if(wa == 2) {
			System.out.println("Ż������� �߰��˴ϴ�.");
		}else if(wa==3) {
			System.out.println("�������� �߰��˴ϴ�.");
		}else {
			System.out.println("���� ����Դϴ�.");
		}
	}
	
	public void course() { 
		System.out.println("1. ǥ�� �ڽ�");
		System.out.println("2. �޼� �ڽ�");
		System.out.println("3. �̺� �ڽ�");
		co = input.nextInt();
		if(co == 1) {
			System.out.println("ǥ�� �ڽ��� �����ϼ̽��ϴ�.");
		}else if(co == 2) {
			System.out.println("�޼� �ڽ��� �����ϼ̽��ϴ�.");
		}else if(co== 3) {
			System.out.println("�̺� �ڽ��� �����ϼ̽��ϴ�.");
		}else {
			System.out.println("���� ����Դϴ�.");
		}
	}
	
	public void main() {
		while(true) {
			System.out.println("1. ����");
			System.out.println("2. ��Ź");
			System.out.println("3. �ڽ�����");
			System.out.println("4. ���� ���԰���");
			System.out.println("5. �� ����");
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
