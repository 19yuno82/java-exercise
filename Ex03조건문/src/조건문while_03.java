import java.util.Scanner;

public class 조건문while_03 {

	public static void main(String[] args) {
		//아이디를 입력 받고
		//비밀번호를 입력 받고
		//아이디와 비밀번호가 모두 일치할 경우 "로그인 성공"
		//일치하지 않은 경우에는 "로그인 실패" 출력
		//아이디 : 이름 , 비밀번호 : 생일
		//로그인을 실패했을 경우 계속 반복, 로그인 성공 시 '아이디'님 환영합니다 출력
		
		Scanner scan = new Scanner(System.in);
		
		String id = "홍길동";
		int pw = 1234; //숫자만 쓰지 않는 경우를 고려 String 변수로
		
		while(true) {
			
			System.out.print("아이디 : ");
			String idInput = scan.next();
			System.out.print("비밀번호 : ");
			int pwInput = scan.nextInt();
			
			if(id.equals(idInput)&&(pw == pwInput)) {
				System.out.println("로그인 성공");
				break;
			} else {
				System.out.println("로그인 실패");
			}//if end
			
			
			
		}//while end
		
		System.out.println(id+"님 환영합니다.");

	}

}
