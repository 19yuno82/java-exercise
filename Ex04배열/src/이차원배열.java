
public class 이차원배열 {

	public static void main(String[] args) {
		// 학생당 국, 영, 수 점수
		int[] stu1 = { 100, 90, 80 };
		int[] stu2 = { 10, 90, 80 };
		int[] stu3 = { 70, 90, 60 };
		int[] stu4 = { 100, 60, 50 };
		int[] stu5 = { 30, 90, 80, 50, 50, 50 };

		int[][] allStu = { stu1, stu2, stu3, stu4, stu5 };
//
//		for (int i = 0; i < allStu.length; i++) {
//			for (int j = 0; j < allStu[i].length; j++) {
//				System.out.print(allStu[i][j] + "\t");
//			} // for end
//			System.out.println();
//		} // for end

		for (int[] temp : allStu) {
			System.out.println(temp);
			for (int t : temp) {
				System.out.print(t + "\t");
			}//for end
			System.out.println();
		}//for end

	}

}
