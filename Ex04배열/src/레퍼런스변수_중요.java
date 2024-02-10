
public class 레퍼런스변수_중요 {

	public static void main(String[] args) {
		// 주소를 저장하는 변수 >> 레퍼런스 변수
		
		//String 저장할 수 있는 배열 5칸 생성하고 음식이름 저장
		
		String[] food = new String[5];
		 food[0] = "김치";
		 food[1] = "라면";
		 food[2] = "김밥";
		 food[3] = "국수";
		 food[4] = "우동";
		 
		String[] cars = {"부가티","람보르기니","포르쉐"};
		
		cars = food; //레퍼런스 변수이므로 주소가 복사된다. //메모리의 크기는 중요하지 않고 자료형이 일치해야 됨
		
		System.out.println(cars[2]); //복사된 주소에 있는 값이 출력
		
		cars[2] = "부가티";
		System.out.println(food[2]); //복사된 주소에 있는 값이 바뀜
		
		
		

		
		
		

	}

}
