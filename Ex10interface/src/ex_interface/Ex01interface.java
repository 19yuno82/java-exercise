package ex_interface;

public interface Ex01interface {
	//interface 하드웨어에서 유래
	//c타입, 220V 등 하나의 통일된 하드웨어
	
	//규격화 된 메소드를 통해 기능을 구현
	
	//클래스 - 필드와 메소드
	
	//인터페이스의 필드와 메소드
	//1.필드(변수)
	
	//인터페이스에 변수 선언은 안된다 
	int num = 0; //상수
	//상수키워드 final
	//1번째 특징 final 생략 가능
	
	//2번째 특징
	//public protected default private
	//class파일은 접근제한자 작성하지 않았을 시 default 기본 접근제한자
	//interface는 접근제한자 작성하지 않았을 시 public 기본 접근제한자
	
	//(public static final) int num = 0;
	
	
	//메소드
	//
	//추상메소드
	//구현한 클래스 파일에서 "반드시" 구현해야 하는 메소드
	//추상화 키워드 - abstract - 리턴타입 앞에 작성
	public abstract void test();
	
	//인터페이스 내에는 메소드가 추상메소드
	void test2(); //public abstract이 생략
	
	//1.8버전 부터는 default 메소드 생성이 가능
	
	default void test3() {
		//Q.추상 메소드인가?
		//추상메소드는 바디가 없다, 바디란 { }
		//A.추상메소드가 아니다
		//반드시 구현할 필요가 없다
	}
	
	//1.9버전 static 메소드, private 메소드 생성가능
	
	
	

}
