package ex_interface;

public class SmartPhone implements SmartPhoneInterface, CameraInterface {
	
	//자바 상속의 3가지 특성
	//1.상속의 제한은 없다
	//해당 클래스는 자식클래스이면서 부모클래스일 수 있다
	//여러 클래스는 하나의 클래스를 상속할 수 있다
	
	//2.다중 상속을 지원하지 않는다 -> 자바의 상속의 유일한 특징
	//하나의 부모 클래스만 둘 수 있다
	
	//3.모든 클래스는 object라는 클래스를 상속받고 있다
	
	//인터페이스의 특성
	//인터페이스는 다중구현이 가능
	
	//추상클래스와 인터페이스 차이
	//추상클래스 - 한 개 이상의 추상메소드를 가지고 있는 클래스 or 클래스명 앞에 abstract 키워드 사용한 클래스
	//추상클래스 특징 - 객체 생성 x, 일반 메소드 o
	//인터페이스 - 추상메소드를 가지고 있으며 객체 생성 x, 일반 메소드 o
	
	//추상클래스랑 인터페이스랑 차이점은?
	//추상클래스는 클래스라 다중 상속이 안된다
	//인터페이스는 다중 구현이 가능

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pick() {
		// TODO Auto-generated method stub
		
	}

}
