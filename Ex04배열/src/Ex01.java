import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");
		String newId = scan.next();
		
		String id1 = "person1";
		String pw1 = "password1";
		
		String id2 ="person2";
		String pw2 = "password2";
		
		String id3 = "person3";
		String pw3 = "password3";
		
		if(newId.equals(id1)||newId.equals(id2)||newId.equals(id3)) {
			System.out.println("중복된 아이디 입니다.");
		}//if end
		

	}

}
