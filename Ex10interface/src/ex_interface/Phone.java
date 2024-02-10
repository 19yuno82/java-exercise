package ex_interface;

public class Phone implements PhoneInterface{//상속 : extends 구현 : implements 
	//오버로딩 - 메소드 중복정의
	//매개변수의 타입이나 개수가 달라야 한다
	//메소드 명은 같아야 한다
	//리턴타입은 상관없다
	
	//오버라이딩 - 메소드 재정의
	//다 같아야 한다 ( 메소드명, 매개변수 타입/개수, 리턴타입)
	//body만 달라야 한다
	
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("전화겁니다.");
		
	}

	@Override
	public void receive() {
		// TODO Auto-generated method stub
		System.out.println("전화를 받습니다.");
	} 

}
