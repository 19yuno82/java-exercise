import java.util.Scanner;

public class 조건문while_04 {

	public static void main(String[] args) {
		// 현재 몸무게와 목표 몸무게를 각각 입력 받으세요
		// 주차 별 감량 몸무게를 입력받습니다.
		// 목표 몸무게를 달성한 경우 축하합니다 출력하고 종료

		// 심화) 만약 목표 목무게를 현재 몸무게보다 더 높게 입력했다면 목표 몸무게를 다시 입력받기

		Scanner scan = new Scanner(System.in); // 스캐너 객체 만들기

		System.out.print("current weight : ");
		int currentWeight = scan.nextInt();
		System.out.print("target weight : ");
		int targetWeight = scan.nextInt();

		while (targetWeight >= currentWeight) {
			System.out.print("target weight : ");
			targetWeight = scan.nextInt();
		} // while end

		int week = 0;

		while (true) {

			week++;
			System.out.print(week + "week down : ");
			int weightLoss = scan.nextInt();

			currentWeight -= weightLoss;

			if (currentWeight <= targetWeight) {
				System.out.println(currentWeight + "Kg SUCESS!");
				System.out.println("congratulations!!");
				break;
			} // if end

		} // while end

	}

}
