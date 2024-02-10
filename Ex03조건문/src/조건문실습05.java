import java.util.Scanner;

public class 조건문실습05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 사용자로부터 점수를 입력받아
		// 90점 이상이면 A
		// 90 미만 80 이상이면 B
		// 80 미만 70 이상이면 C
		// 그 외의 경우 F

		Scanner scan = new Scanner(System.in);

		int score = 0;

		System.out.print("점수 입력 : ");
		score = scan.nextInt();

		if (score >= 90) {
			System.out.println("A학점 입니다.");
		} else if (score >= 80) {
			System.out.println("B학점 입니다.");
		} else if (score >= 70) {
			System.out.println("C학점 입니다.");
		} else {
			System.out.println("F학점 입니다.");
		}
		System.out.println(" ");

		System.out.println("=end=");

	}

}
