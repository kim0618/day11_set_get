package day11_set_get;

import java.util.Scanner;

class Login{
	private String userId=null,userPw=null;
	public int print(String id,String pw){
		if(getUserId() != null  && getUserPw() != null) {
			if(getUserId().equals(id) && getUserPw().equals(pw)) {
				return 0;
				}
			else { 
				return 1;
				}
		}return 1;
	}
	public String getUserId() {
		return userId;	
		}
	public void setUserId(String id) {
		this.userId = id;	
		}
	public String getUserPw() {
		return userPw;	
		}
	public void setUserPw(String pw) {	
		this.userPw = pw; 
		}
}

public class Quiz01_Login {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		Login ex = new Login();
		
		int num=0;
		String id=null,pw=null;
		while(true) {
			System.out.println("1.�α��� 2.���� 3.�α׾ƿ�");
			System.out.print(">>> ");;
			num = input.nextInt();
			if(num==1) {
				System.out.print("���̵� �Է� : ");
				id = input.next();
				System.out.print("��й�ȣ �Է� : ");
				pw = input.next();
				if(ex.print(id, pw) == 0) {
					System.out.println("���� ����");
				}else {
					System.out.println("���� ����");
				}
			}
			else if(num == 2) {
				System.out.print("���� id : ");
				id = input.next();
				System.out.print("���� pw : ");
				pw = input.next();
				ex.setUserId(id);
				ex.setUserPw(pw);
				System.out.println("���� �Ϸ�");
			}else if(num == 3) {
				System.out.println("�����մϴ�.");
				break;
			}
		
		
		
		
		
		}
		

		
		
	}
}		
	

