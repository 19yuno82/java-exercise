package variable;

public class Basic {

	public static void main(String[] args) {
		//자동완성 : ctrl + space
		//화면 키우기 : ctrl + +
		//저장하기 : ctrl + s
		//실행하기 : ctrl + F11
		
		//변수 : 데이터를 담을 수 있는 공간
		//변수의 선언 : 데이터타입 변수명;
		int age;
		int birthday;
		//변수의 할당.
		age = 100;
		birthday = 223;
		//변수의 값을 꺼내서 확인해보자
		System.out.println(age); //개행하는 출력문
		System.out.print(birthday); //일반 출력문
		//syso + 자동완성 -> 출력문 쉽게 만들기
		System.out.println();
		
		//상수 선언 : final 데이터타입 변수명;
		final int birthday2;
		//상수에 값 할당
		birthday2=1964;
		//상수에 값 재할당
		//birthday2=10; 불가능!
		
		
		
		
		
		
		
	}

}
