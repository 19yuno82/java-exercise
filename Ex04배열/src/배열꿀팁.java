import java.util.Arrays;
import java.util.Random;

public class 배열꿀팁 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rd = new Random();
		
		
		int[] numbers = new int[10];
		
	     for (int current = 0; current < numbers.length; current++) {
	         numbers[current] = rd.nextInt(20) + 1;
	         
	         for (int 검사 = current - 1; 검사 >= 0; 검사--) {
	            
	            if (numbers[current] == numbers[검사]) {
	               current--;
	               break;
	            }// if 끝
	            
	         }// 작은 for 끝
	         
	      }// 큰 for 끝
	      
	      // 배열에 들어있는 모든 원소 문자열로 출력
	      System.out.println(Arrays.toString(numbers)); 

	}

}
