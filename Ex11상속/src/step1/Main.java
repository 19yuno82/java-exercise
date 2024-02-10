package step1;

public class Main {

	public static void main(String[] args) {
		
		핸드폰 phone1 = new 핸드폰(); //핸드폰 타입의 객체
		phone1.call();
		phone1.send();
		
		피쳐폰 phone2 =new 피쳐폰();
		phone2.call();
		phone2.send();
		//하위클래스는 상위클래스의 모든 필드/메소드를 포함하고 있다
		phone2.sms();
		
		스마트폰 phone3 = new 스마트폰();
		phone3.call();
		phone3.send();
		phone3.wifi();
//		phone3.phoneNum;
		
		//스마트폰 타입의 객체는 핸드폰 타입으로 형변환할 수 있다
		핸드폰 phone4 = new 스마트폰(); //업캐스팅 : 묵시적, 암시적, 자동
		핸드폰 phone5 = new 피쳐폰();
		
		((스마트폰)phone4).wifi();
		//업캐스팅 되어 있는 상태에서 하위클래스의 메소드를 쓰려면 다운캐스팅을 해주면 된다
		
		System.out.println("===오버라이딩===");
		phone4.call();
		phone5.call();
		//업캐스팅 되어 있는 상태에서 오버라이딩된 메소드를 호출하면 하위클래스의 메소드가 실행
		
//		스마트폰 phone6 = new 핸드폰();
		
		//다운캐스팅 : 업캐스팅이 되어있는 상태에서 다시 원래 개체타입으로 형변환
		스마트폰 phone6 = (스마트폰)phone4; //다운캐스팅 : 명시적, 강제

	}

}
