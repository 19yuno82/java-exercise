import java.util.Random;
import java.util.Scanner;

public class 조건문while_Final {

	public static void main(String[] args) {
		// 랜덤으로 두 개의 정수를 뽑아 문제를 출력합니다 (범위 자유)
		// 사용자는 답을 입력합니다
		// 정답을 맞추면 Sucess 실패하면 Fail
		// 기회는 총 세번 세번 실패하면 게임 종료
		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		int num1 = 0, num2 = 0;
		int life = 0;

		while (life != 3) {

			num1 = random.nextInt(20) + 1;
			num2 = random.nextInt(20) + 1;

			System.out.print(num1 + " + " + num2 + " = ");
			int answer = scan.nextInt();

			if ((num1 + num2) == answer) {
				System.out.println("Sucess!");
				break;
			} else {
				System.out.println("Fail!");
			} // if end

			life++;

		} // while end

		System.out.println("GAME OVER");

	}

}
