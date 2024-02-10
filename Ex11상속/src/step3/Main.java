package step3;

public class Main {

	public static void main(String[] args) {
		//1.하위클래스는 상위클래스의 필드와 메소드를 포함한다
//		Super store1 = new Super();
//		store1.coffee();
		
		Sub1 store2 = new Sub1();
		store2.coffee();//super recipe
		store2.cake();//sub recipe
		
		//2.하위클래스는 상위클래스로 형변환 될 수 있다 -> 업캐스팅
		Super store3 = new Sub1();
		
		store3.coffee(); //super recipe 
		
		//3.업캐스팅 되어 있는 객체는 다시 원래 타입으로 되돌릴 수 있다 -> 다운캐스팅
		((Sub1)store3).cake();
		
		//4.업캐스팅 되어 있는 상태에서 오버라이딩한 메소드를 호출하면 하위클래스의 메소드가 호출
		store3.coffee(); //sub recipe
		store3.ade();
		
		Super store4 = new Sub2();
		store4.coffee(); //sub2 recipe
		
		//5.추상메소드를 상속받는 하위클래스는 추상메소드를 반드시 오버라이딩 해야 한다 -> 구현의 강제성
		Super store5 = new Sub1();
		Super store6 = new Sub2();
		Super store7 = new Sub3();
		
		store5.coffee(); //sub1 recipe
		store6.coffee(); //sub2 recipe
		store7.coffee(); //sub3 recipe
		
		store5.ade(); //super recipe
		
		//6.추상클래스는 객체 생성이 불가능 -> 미완성 클래스
		//-> 상속(규격)용으로만 사용
//		new Super();
		
		//7.final (최종)
		//-변수(갱신 불가능: 상수), 메소드(오버라이딩 불가능), 클래스(상속 불가능)
//		final int num = 3;
//		num = 15;
		
		//8.인터페이스 - 찐 추상 all 추상메소드
		//- 추상클래스 : 추상 메소드 + 일반 메소드
		
		//9.static (메모리 할당 위치)
		//static 변수/메소드는 객체를 생성하지 않아도 사용(참조)할 수 있다

	}

}
