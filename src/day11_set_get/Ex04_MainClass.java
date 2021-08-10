package day11_set_get;

import java.util.Scanner;

public class Ex04_MainClass {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		Ex04_set_get ex = new Ex04_set_get();
		String name=null;
		int age=0;
		System.out.println("이름 입력 : ");
		name = input.next();
		System.out.println("나이 입력 : ");
		age = input.nextInt();
		ex.setAge(age);					// 값을 저장해줘야함
		ex.setName(name);
		String na = ex.getName();
		int ag = ex.getAge();
		System.out.println(na+"님의 나이는 "+ag+"살 입니다.");
		
		
		
		
	}
}
