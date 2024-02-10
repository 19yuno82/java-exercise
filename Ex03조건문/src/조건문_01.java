import java.util.Scanner;

public class 조건문_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//사용자로부터 나이를 입력받아
		//20살 이상이면 성인입니다 출력
		
		Scanner scan = new Scanner(System.in);
		
		 int age = 0;
		 
		 System.out.print("나이를 입력해주세요 : ");	//코드는 위에서 아래로 실행된다
		 age = scan.nextInt();
		 
		 if(age >= 20) {
			 System.out.println("성인입니다.");
		 }else {
			 System.out.println("미성년자입니다.");
		 }
		 

	}

}
