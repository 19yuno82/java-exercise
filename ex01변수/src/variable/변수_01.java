package variable;

public class 변수_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 사용하는 이유
		//변수란 값을 저장할 수 있는 공간
		
		//생성 : 변수명 앞에 자료형을 붙임
		//사용 : 변수명 앞에 자료형을 붙이지 않음
		int num;
		num = 15;
		
		//같은 이름의 변수는 2개 이상 생성할 수 없다
		//위에서부터 순서대로 읽는다(컴파일러 언어)
		
		
		//생각해보기
		num2 = 20; //생성하지 않은 변수는 사용할 수 없다
		
		//생각해보기2
		int num3 = 20; //같은 이름의 변수는 2개 이상 생성할 수 없다
		int num3 = 10;
		
		//생각해보기3
		int num4 = 50;
		num4 = 70; 		//위에서부터 아래로 읽는다
		
		System.out.println(num4); //어떤 값이 줄력될까?
		//대입연산자는 기존 변수의 값을 갱신한다  

	}

}
