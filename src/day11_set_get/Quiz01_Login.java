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
			System.out.println("1.로그인 2.가입 3.로그아웃");
			System.out.print(">>> ");;
			num = input.nextInt();
			if(num==1) {
				System.out.print("아이디 입력 : ");
				id = input.next();
				System.out.print("비밀번호 입력 : ");
				pw = input.next();
				if(ex.print(id, pw) == 0) {
					System.out.println("인증 성공");
				}else {
					System.out.println("인증 실패");
				}
			}
			else if(num == 2) {
				System.out.print("가입 id : ");
				id = input.next();
				System.out.print("가입 pw : ");
				pw = input.next();
				ex.setUserId(id);
				ex.setUserPw(pw);
				System.out.println("저장 완료");
			}else if(num == 3) {
				System.out.println("종료합니다.");
				break;
			}
		
		
		
		
		
		}
		

		
		
	}
}		
	

