import java.util.Random;
import java.util.Scanner;

public class Lv3 {

	public static void main(String[] args) {
		// 데이터가 홀수인 것만 출력
		// 홀수가 총 몇 개인지 함께 출력

		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		System.out.print("array length : ");
		int length = scan.nextInt();

		int[] array = new int[length];
		int count = 0;
		
		//생성된 배열에 랜덤 수 부여, 중복없게
		for (int i = 0; i < length; i++) {
			array[i] = random.nextInt(length)+1;
			for (int j = 0; j < i; j++) {
				if (array[j] == array[i]) {
					i--;
					break;
				} // if end
			} // for end
			
		} // for end
		
		//홀수만 출력, 카운팅
//		for (int i = 0; i < length; i++) {
//			if (array[i] % 2 != 0) {
//				System.out.print(array[i] + " ");
//				count++;
//			} // if end
//		} // for end
//
//		System.out.println();
//		System.out.println("total : " + count);
		
		//확장 for문(for-each문)
		for(int temp : array) {
			//배열의 길이만큰 반복하면서 0번째 데이터부터 마지막번째 데이터까지 temp에 저장
			if(temp % 2 == 1) {
				System.out.print(temp+" ");
				count++;
			}//if end
		}//for-each end
		
		System.out.println();
		System.out.println("total : "+count);
		
		
		
		
		
		
		
		
	}

}
