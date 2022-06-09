package Ch02.CodingProject;

public class Person {
	 String memberName;
	 String memberNum;
	 String memberIdNum;

	public static void main(String[] args) {
		Person person = new Person();
		person.memberName="회원명";
		person.memberNum= "010-1111-1111";
		person.memberIdNum="0000000-00000000";
		
		System.out.println("회원님의 이름은 ("+person.memberName+")입니다.") ;
		System.out.println("회원님의 전화번호는 "+person.memberNum+"입니다.") ;
		System.out.println("회원님의 주민등록번호는 "+person.memberIdNum+"입니다.") ;
	}

}
