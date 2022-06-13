package OOPminiProject;

public class ContactMain {

	public static void main(String[] args) {
		Contact c = new Contact("최윤호","010-0000-0000","choi@gmail.com","서울","2000-05-05","친구");

		
		c.printInfo(c);
		c.setGroup("가족");
	
		
		System.out.println("-------------------");
		System.out.println("그룹 정보 변경");
		System.out.println("-------------------");

		c.printInfo(c);
	}

}
