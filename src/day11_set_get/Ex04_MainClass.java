package day11_set_get;

import java.util.Scanner;

public class Ex04_MainClass {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		Ex04_set_get ex = new Ex04_set_get();
		String name=null;
		int age=0;
		System.out.println("�̸� �Է� : ");
		name = input.next();
		System.out.println("���� �Է� : ");
		age = input.nextInt();
		ex.setAge(age);					// ���� �����������
		ex.setName(name);
		String na = ex.getName();
		int ag = ex.getAge();
		System.out.println(na+"���� ���̴� "+ag+"�� �Դϴ�.");
		
		
		
		
	}
}
