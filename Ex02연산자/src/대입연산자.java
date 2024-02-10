
public class 대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 3;
		// = 오른쪽에 있는 값을 왼쪽에 대입
		
		//복합대입연산자
		num += 5; //num = num + 5
		
		int num2 = 10;
		System.out.println(num2+5); //15 출력 시 값만 적용
		System.out.println(num2); //10 대입되지 않았기 때문에 변하지 않는다
		
		num2 += 5;
		System.out.println(num2); //15
		
		
		

	}

}
