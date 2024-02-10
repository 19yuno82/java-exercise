package step5;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 덧셈게임 객체지향으로 만들기
		// 1.게임기 (controller) 설계
		// 2.덧셈cd, 뺄셈cd 설계
		// 3.호환성을 위해 cd 규격 설계

		// 규칙. 랜덤으로 두 수를 뽑아 문제를 출력하고
		// 정답을 입력받아 정답/오답 결과 출력
		// 기회는 총 3번! 3번 틀리면 게임 종료
		// 틀릴 때마다 다른 문구 출력
		
		PlusCD plus = new PlusCD(3, new String[]{"음..괜찮아","음.음..괜찮겠지?","이번 생은 포기하는 걸로.."},9);
		
		GameController con1 = new GameController(plus);
		
		con1.play();
		
		MinusCD minus = new MinusCD(5,new String[]{"다시 가즈아","또 다시 가즈아","또 또 다시 가즈아??","음....","그냥 포기하는 걸로.."} , 99);
		
		GameController con2 = new GameController(minus);
		
		con2 .play();

	}

}
