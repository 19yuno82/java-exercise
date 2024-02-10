package for문;

public class Ex02 {

	public static void main(String[] args) {
		// 1+2+3+4+...+99+100의 결과를 출력
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i;
		} // for end
		System.out.println(sum);

		// 1-2+3-4+5-...+99-100의 결과를 출력
//		int oddSum = 0;
//		int evenSum = 0; //굳이 따로 모으지 않고 부호만 바꾸는 식으로
		int sum3 = 0;
		int sw = 1;
		for (int a = 1; a < 101; a++) {
			sum3 += (a * sw);
			sw *= -1;
//			if (a % 2 == 0) {
//				evenSum -= a; //sum -= a; //짝수면 마이너스
//			} else {
//				oddSum += a;  //sum += a; //홀수면 플러스
//			} // if end
		} // for end
		System.out.println(sum3);

		// (77*1)+(76*2)+...+(1*77)의 결과를 출력
		int sum2 = 0;
		int count = 1;
		for (int b = 77; b > 0; b--) {
			// sum2 += (b * (78 - b)); //내 풀이 //직관적인 해석에서 하나 더 나아가야
			sum2 += (b * count); // teacher
			count++;
		} // for end
		System.out.println(sum2);

	}

}
