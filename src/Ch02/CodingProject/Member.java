package Ch02.CodingProject;

public class Member {

	String name;
	int age;
	double height;
	boolean hasBook;
	//static 붙일 필요가 없음

	public static void main(String[] args) {
		
		Member member = new Member();
		
		member.name;
		member.age;
	    member.height;
		member.hasBook;
		
		System.out.println("회원님의 이름은 "+member.name+"입니다.");
		System.out.println("회원님의 나이는 "+member.age+"입니다.");
		System.out.println("회원님의 키는 "+member.height+"입니다.");
		System.out.println("회원님의 책 보유여부는 "+member.hasBook+"입니다.");
		
		//System.out.printf("%s 회원님의 나이는 %i이고, 키는 %d입니다. 책의 소유여부는 %b입니다.",member.name,member.age,member.height,member.hasBook);
	}

}
