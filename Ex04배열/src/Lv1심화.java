import java.util.Random;
import java.util.Scanner;

public class Lv1심화 {

	public static void main(String[] args) {
		// 배열 값을 저장할 때 랜덤수(난수)를 뽑아 저장(범위 자유)
		// 중복되는 난수가 발생하지 않게 뽑아보세요

		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		System.out.print("배열의 길이 : ");
		int length = scan.nextInt();

		int[] array = new int[length];

		for (int i = 0; i < length; i++) {
			array[i] = random.nextInt(length);
			for (int j = 0; j < i; j++) {
				if (array[j] == array[i]) {
					i--;
					break;
				} // if end
			} // for end
		} // for end

		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		} // for end

		// 앞으로 설계 시 고려사항
		// 가독성, 속도(반복횟수, 비교), 메모리, 유지보수(수정/확장이 편리해야)
		// - 데이터, 알고리즘(특정 데이터에 국한되지 않게!!), 출력은 분리해서 생각해라

	}

}
