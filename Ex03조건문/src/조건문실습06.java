import java.util.Scanner;

public class 조건문실습06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 아래 표를 보고 실적을 입력받아
		// 총 급여를 계산하는 프로그램을 구현
		// 99만원 이하 0원
		// 100만원~199만원 20만원
		// 200만원~299만원 30만원
		// 300만원 이상 50만원

		Scanner scan = new Scanner(System.in);

		int per = 0, bon = 0;

		System.out.print("이번 달 실적을 입력하세요 : ");
		per = scan.nextInt();

		if (per <= 990000) {
			bon = 0;
//			System.out.println("급여는 " + (per + bon) + "입니다.");
		} else if (per <= 1990000) {
			bon = 200000;
//			System.out.println("급여는 " + (per + bon) + "입니다.");
		} else if (per <= 2990000) {
			bon = 300000;
//			System.out.println("급여는 " + (per + bon) + "입니다.");
		} else {
			bon = 500000;
//			System.out.println("급여는 " + (per + bon) + "입니다.");
		}
		System.out.println("급여는 " + (per + bon) + "원 입니다.");
		
//		int pay = per + bon;
//		System.out.println(pay);
		
		
		System.out.println(" ");
		System.out.println("=end=");

	}

}
