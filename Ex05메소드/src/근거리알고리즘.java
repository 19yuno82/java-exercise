import java.util.Scanner;

public class 근거리알고리즘 {

	public static void main(String[] args) {
		// 두 수를 전달받아 10에 가까운 수를 리턴받기

		Scanner scan = new Scanner(System.in);

		System.out.print("number1 : ");
		int num1 = scan.nextInt();
		System.out.print("number2 : ");
		int num2 = scan.nextInt();

		int result = nearOfTen(num1, num2);
		System.out.println("10에 더 가까운 수 : " + result);

	}// main

	public static int nearOfTen(int a, int b) {

//		int a1 = abs(10 - a);  
//		int b1 = abs(10 - b);
//		if (a1 > b1) {
//			return b;
//		} else if (a1 == b1) {
//			return 0;
//		} else {
//			return a;
//		} // if end

		// 절대값 구하기 : java의 도구 중 Math 클래스를 이용.(간단한 수학 메소드 제공)
		int dis_a = Math.abs(10 - a);
		int dis_b = Math.abs(10 - b);

		if (dis_a == dis_b) {
			return 0;
		} else {
			return dis_a > dis_b ? b : a;
		}

	}// nearOfTen

//	public static int abs(int c) {
//		if (c < 0) {
//			c = -c;
//		} // if end
//		return c;
//	}// abs end

}
