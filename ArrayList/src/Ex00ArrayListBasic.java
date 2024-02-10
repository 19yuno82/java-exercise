import java.util.ArrayList;

public class Ex00ArrayListBasic {

	public static void main(String[] args) {
		//배열 만들기
		int[] ages = new int[5];
		ages[0] = 20; //인덱싱해서 데이터를 삽입했다 //실행 전 발생된 에러 >> 컴파일 에러
		//ages[5] = 10; //실행 도중 에러 >> 런타임 에러(로직 에러) 크기를 넘어섬
		
		
		//ArrayList
		ArrayList<Integer> ages2 = new ArrayList<Integer>();
		ages2.add(30);//0 //0
		ages2.add(20);//1 //remove
		ages2.add(10);//2 //1
		ages2.add(15);//3 //2
//		ages2.add(5,100); //공간의 크기가 온전하지 않게 접근하면, size문제 발생
		
//		System.out.println(ages2.get(0));
//		System.out.println(ages2.get(1));
//		System.out.println(ages2.get(2));
//		System.out.println(ages2.get(3));
		
		//remove 해당 인덱스 삭제
//		ages2.remove(1);
		ages2.remove(10);
		
//		System.out.println(ages2.get(0));
//		System.out.println(ages2.get(1));
		System.out.println(ages2.get(2));
//		System.out.println(ages2.get(3));
		
		//set 해당 인덱스 데이터 변경
		ages2.set(1,100);
		System.out.println(ages2.get(0));
		System.out.println(ages2.get(1));
		System.out.println(ages2.get(2));
		
		//size arraylist 크기(길이)
		System.out.println(ages2.size());
		
		//clear 전체 삭제
		ages2.clear();
		System.out.println(ages2.size());
		
		
	}

}
