import java.util.Scanner;

public class 큰수찾기 {

	public static void main(String[] args) {
		// 두 개의 정수를 받아
		//더 큰 수를 반환하는 메소드 설계
		// 두 수가 같다면 0을 반환
		Scanner scan = new Scanner(System.in);
		System.out.print("number1 : ");
		int num1 = scan.nextInt();
		System.out.print("number2 : ");
		int num2 = scan.nextInt();
		
		int result = bigNum(num1,num2);
		System.out.println("큰 수는 : " + result);

	}//main
	//(접근제한자 생략시  =?default)
	public static int bigNum(int a, int b) {
		
		if(a == b ) {
			return 0; //리턴을 만나면 해당 메서드는 종료 된다!
		} else if(a<b) {
			return b;
		} else {
			return a;
		}
		
	}//bigNum

}
