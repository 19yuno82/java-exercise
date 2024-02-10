
public class 배열문법 {

	public static void main(String[] args) {

		// 이름 저장하는 배열 3칸
		String[] names = new String[3]; //자료형[] 변수명 = new 자료형[길이]
		// new 키워드 : 메모리를 생성할 때 사용
		// 메모리가 생성되면 주소가 부여
		// 주소를 저장해놔야 찾아갈(참조) 수 있다
		// 기억할 때 쓰는 것 : 변수
		// 주소를 저장하는 변수 : 레퍼런스 변수

		System.out.println(names);

		names[0] = "홍길동";
		names[1] = "이몽룡";

		System.out.println(names[2]);
		// String 배열을 생성하면 기본으로 null값이 저장 ("" != null)
		// int 배열을 생성하면 기본으로 0값이 저장

		// 배열 사용 시 발생할 수 있는 예외
//		System.out.println(names[8]); //생성된 배열의 인덱스를 벗어난 범위이다.

		// 배열의 길이 알아내는 법
		System.out.println(names.length);
		// 길이는 3, 마지막 인덱스는 2

		// 배열의 다른 문법
		// 값을 지정한 채로 생성
		String[] team = { "장서영", "김은성", "이경열", "정찬호", "정윤오" };

		// 0번 사람부터 마지막 사람까지 출력
		for (int i = 0; i < 5; i++) {
			System.out.print(team[i] + " ");
		} // for end
		System.out.println();

		for (int i = team.length-1; i >= 0; i--) {
			System.out.print(team[i] + " ");
		} // for end

	}

}
