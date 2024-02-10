package variable;

public class 자료형_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		double num = 3.141592;
		
//		num =num* 100; 
//		num = (int)num;  // 첫번째 num은 double형 , 두번째 num 은 int형, 뒤에서 앞으로 적용
//		num = num/100;
				
//		num = ((int)(num*100))/(double)100; // 정수/정수  정수/실수 실수/실수 잘 구분하자
//		
//		System.out.println(num);
		
		//논리형
		boolean isRunning = true; //참
		isRunning = false ; //거짓
		
		//문자형(단수) vs 문자열(복수)
		char ch1 = 'a';
		
		String str1 = "apple";
		
		System.out.println((char)(ch1+1));
		System.out.println(ch1+1);
		System.out.println(str1+1);
		
		int num3 = 015; //8진수 숫자 앞에 '0'를 붙이면..
		System.out.println(num3);
		
		//문자열 + 숫자 => 문자열
		System.out.println(10+7+"5"); //175
		System.out.println(10+"7"+5); //1075 (((숫자 + 문자열) = 문자열) + 숫자 = 문자열)
		System.out.println("10"+7+5); //1075 (((문자열 + 숫자) = 문자열) + 숫자 = 문자열)
		
		
		

	}

}
