package ex_01;

public class Main {

	public static void main(String[] args) {
		//클래스와 객체 구분하기
		//- 객체지향 프로그래밍을 앞으로 공부할건데 
		//초보가 처음부터 객체지향적으로 프로그램을 설계하는 것은 엄청나게 어려움
		
		//초보용 객체지향 프로그래밍 활용
		//클래스를 새로운 자료형(value object)으로 설계하는 방법
		
		//메이플 캐릭터 생성
		//-닉네임(String), 레벨(int), 직업(String), str(int), intel(int), dex(int), lux(int)
		
		//클래스를 활용해서 7개의 변수(속성,필드)을 가진 새로운 자료형을 설계
		
		Maple m1 = new Maple(); //객체생성
		m1.nick = "어둠의지팡이";
		
		
		//타락파워전사 생성!!
		Maple m2 = new Maple(); //객체생성
		m2.nick = "타락파워전사";
		
		m1.lv = 99; //클래스의 lv변수값이 바뀐건가? //클래스는 설계, 객체는 생성
		

	}//main

}
