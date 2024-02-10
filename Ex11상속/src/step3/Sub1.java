package step3;

//extends : 확장, 상속
//implements : 구현, 인터페이스
public class Sub1 implements Super {
	//풍암점
	public void cake() {
		System.out.println("풍암점 당근케이크 레시피");
	}
	
	public void coffee() {//메소드 재정의 - 오버라이딩
		System.out.println("풍암점에 어울리는 커피 레시피");
	}

	@Override
	public void ade() {
		// TODO Auto-generated method stub
		System.out.println("풍암점 에이드 레시피");
		
	}

}
