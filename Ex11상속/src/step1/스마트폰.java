package step1;

public class 스마트폰 extends 핸드폰 {
	public void wifi() {
		System.out.println("와이파이 사용");
	}
	
	public void call() {//오버라이딩 : 재정의
		System.out.println("더 나은 전화걸기 방식");
	}

}
