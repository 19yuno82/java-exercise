
public class TestEquals {

	public static void main(String[] args) {
		// 왜 문자열 비교할때 equals를 써야 하지?
		
		String name = "정윤오";
		String name2 = "정윤오";
		String firstName = "정";
		String lastName = "윤오";
		
		if(name == name2) {					//완전한 문자열끼리 비교, 같다고 나옴, 주소가 같아서
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		
		if(name == firstName+lastName) {	//문자열끼리 더한 값과 비교할때 다르다고 나옴, 하지만 값은 사실 같다
			System.out.println("참");		//문자열인 값을 비교하는게 아닌 주소 개념때문
		}else {
			System.out.println("거짓");
		}
		
		String name3 = firstName + lastName;
		if(name.equals(name3)) { 			//문자열끼리 비교할때는 equals를 사용한다
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		
		//레퍼런스 데이터타입은 .equals를 써서 비교한다
		

	}

}
