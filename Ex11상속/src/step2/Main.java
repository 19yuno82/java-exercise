package step2;

public class Main {

	public static void main(String[] args) {
		//1번 예제
		//-인형뽑기 기계
		//인형 클래스 설계, 기계(메소드) 설계
		//기계 메소드는 매개변수로 인형클래스 전달받아서 pick()메소드 호출
		Pka pka = new Pka();
		machine(pka);
		machine(new Fairi()); //에러 이유 : 파이리 클래스로 받은 매개변수를 피카 클래스로 형변환 X
		machine(new Turtleking());

	}//main
	
	public static void machine(Pocketmon doll) {
		//하위클래스가 상위클래스로 형변환 => 업캐스팅
				
		//업캐스팅 되어 있는 상태에서 원래 객체타입을 알아낼 수 있는 방법
//		if(doll instanceof Pka) {
//			//만약에 doll이 Pka 타입이라면
//			((Pka)doll).pickPika();
//		}else if(doll instanceof Fairi) {
//			((Fairi) doll).pickFairi();
//		}else if(doll instanceof Turtleking) {
//			((Turtleking) doll).pickTurtleking();
//		}
		
		//오버라이딩
		doll.pick();
			
	} //업캐스팅을 하여 여러 클래스가 적용될 수 있다 상위클래스로 묶이니깐
	
	//같은 이름으로 메소드를 설계할 수 있도록 허용
	//-대신 매개변수 갯수나 타입을 다르게 해서
//	public static void machine(Fairi doll) {
//		doll.pickFairi();
//	} //의존성 주입 - 한 클래스에만 국한되어 있다
	

}
