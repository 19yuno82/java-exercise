package Model;

public class MemberDTO {
	//VO value object
	//DTO data transfer object
	//DTO vs VO
	
	//database 컬럼과 똑같이 작성
	private String id;
	private String pw;
	private String name;
	private int age;
	
	public MemberDTO(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}//생성자
	
	public MemberDTO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}//오버로딩 - 중복정의

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}//class
