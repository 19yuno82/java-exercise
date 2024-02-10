
public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// &&(and) ||(or)
		// 두 개의 비교를 동시에 할 때
		
		//&&(and) 두가지 조건이 동시에 참일 때 참이다.
		//||(or) 두가지 조건 중 하나만 참이어도 참이다.
		
		System.out.println((1 + 3 == 15) && (4 < 5)); //노란 줄 표시는 데드코드를 뜻함
		      
	    System.out.println((2 < 1) && (4 < 5));
     	     
		System.out.println((1 < 3) || (4 < 2));
	      
		System.out.println((2 < 1) || (4 < 2));
		
		//not 연산!
		//true를 false로 바꿈
		//false를 true로 바꿈
		
		System.out.println(!(2 == 0));
		
		
		

	}

}
