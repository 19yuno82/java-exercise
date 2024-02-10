package step3;

public class Sub2 implements Super {
	//동명점
	public void coffee() { //오버라이딩
		System.out.println("동명점에 어울리는 커피 레시피");
	}

	@Override
	public void ade() {
		// TODO Auto-generated method stub
		System.out.println("동명점 에이드 레시피");
	}

}
