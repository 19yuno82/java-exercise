
public class 증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//변수에 저장된 값을 1 감소시키거나 1 증가시킬 때 사용
		//1. 대입을 하지 않아도 변수값이 바뀜
		//2. 앞에 붙어있을 때랑 뒤에 붙어있을 때랑 실행순서가 틀림
		
		
		//연습문제1
		int num = 1;
		
		num++;
		num++;
		num++;
		
		System.out.println(num);
		
		
		//연습문제2
		int num2 = 10;
		System.out.println(num2++); //10 **사용하고 증감
		System.out.println(num2); //11 증감된 값이 사용
		System.out.println(++num2); //12 **증감이 되고 사용
		System.out.println(num2); //12 최종 값이 출력
		
		
		//연습문제3
		int num3 = 10;
		
		int num4 = num3++; //사용하고 증감 , num4에 10이 저장되고 num3은 11로 증가
		
		System.out.println(num3); //11
		System.out.println(num4); //10
		
		
		//연습문제4
		int num5 = 10;
		
		System.out.println(num5++ + 10);
		System.out.println(num5);
		
		
		//연습문제4
		int a=3, b=4, c=5, d=5;
		
		a += 6 + --b;
		
		d *= 7 - c++;
		
		System.out.println(a+ ", " + b + ", " + c + ", " + d);
		
		
		
		
		
		

		
	}

}
