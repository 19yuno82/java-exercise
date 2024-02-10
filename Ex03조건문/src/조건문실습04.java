import java.util.Scanner;

public class 조건문실습04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수 num1.num2,num3 숫자 3개 입력받아서
		// 입력한 숫자 중 가장 큰 값을 출력

		Scanner scan = new Scanner(System.in);

		int num1 = 0, num2 = 0, num3 = 0;

		System.out.print("첫번째 수 : ");
		num1 = scan.nextInt();
		System.out.print("두번째 수 : ");
		num2 = scan.nextInt();
		System.out.print("세번째 수 : ");
		num3 = scan.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println(num1 + "이(가) 큰 수입니다.");
			} else {
				System.out.println(num3 + "이(가) 큰 수입니다.");
			}
		} else {
			if (num2 > num3) {
				System.out.println(num2 + "이(가) 큰 수입니다.");
			} else {
				System.out.println(num3 + "이(가) 큰 수입니다.");
			}
		}
		
		//쌤 풀이

//		int max = 0;
//		if (num1 > num2) {
//			max = num1;
//		} else {
//			max = num2;
//		}
//		
//		if (max > num3) {
//			System.out.println(max + "이(가) 큰 수입니다.");
//		} else {
//			System.out.println(num3 + "이(가) 큰 수입니다.");
//		}
		
		//서영님 풀이
//		max = (num1>num2 ? num1 : num2); //삼항연산자 (조건식 ? 값 : 값)
//		
//		if(max > num3) {
//			System.out.println(max);
//		} else {
//			System.out.println(num3);
//		}

	}

}
