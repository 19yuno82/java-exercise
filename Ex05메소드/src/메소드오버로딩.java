
public class 메소드오버로딩 {

	public static void main(String[] args) {
		//
		System.out.println(calculateArea(10));
		System.out.println(calculateArea(10.0,20.0));
		System.out.println(calculateArea(10,20));

	}//main
	public static double calculateArea(double side) {
		return side*side;
	}//정사각형
	public static double calculateArea(double width, double height) {
		return width*height;
	}//직사각형
	
	public static double calculateArea(int base, int height) {
		return (double)base*height/2;
	}//삼각형

}
