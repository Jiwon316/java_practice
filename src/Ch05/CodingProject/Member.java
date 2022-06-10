package Ch05.CodingProject;

public class Member {
	String name;
	String number;
	String major;
	int grade;
	String email;
	String birthDate;
	String address;

	Member(String name, String number, String major, int grade, String email, String birthDate, String address) {
		this.name = name;
		this.number = number;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birthDate = birthDate;
		this.address = address;
	}

	Member(String name, String number, String major, int grade, String email) {
		this(name, number, major, grade, email, "정보없음", "정보없음");

	}

	public static void main(String[] args) {
		
		Member member1 = new Member("SHKIM","010-9999-7777","컴퓨터",2,"shkim@gmail.com","2000-10-11","서울");
		String result1=print(member1);
		System.out.println(result1);
		
		System.out.println("----------------------------------");		
		Member member2 = new Member("JJKIM","010-1111-3333","컴퓨터",2,"jjkim@gmail.com");
		String result2=print(member2);
		System.out.println(result2);		
	}

	public static String print(Member member) {
		return "이름: "+member.name+"\n전화번호: "+member.number+"\n전공: "+member.major+"\n학년: "+member.grade+"\n이메일: "+member.email+"\n생일: "+member.birthDate+"\n주소: "+member.address;
	
	}

}
