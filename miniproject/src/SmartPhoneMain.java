import java.util.Scanner;

public class SmartPhoneMain {

	static Contact contact = new Contact();

	public static void main(String[] args) {
		SmartPhone sp=  new SmartPhone();
		Scanner sc = new Scanner(System.in);

		System.out.println("# 데이터 2개를 입력합니다.");
		sp.inputContactData();
		sp.addContactData(contact); //이 안에 들어갈 내용 고민
		System.out.print(">> 데이터가 저장되었습니다. (1) ");

		System.out.println();

		sp.inputContactData();	
		sp.addContactData(contact);
		System.out.print(">> 데이터가 저장되었습니다. (2) ");
		System.out.println();

		printMenu();
		int menu = sc.nextInt();

			if (menu == 1) {
		//sp.inputContactData();	
		sp.addContactData(contact);
		System.out.print(">> 데이터가 저장되었습니다.");
		return;
			} else if (menu == 2) {
			   sp.printAllContact();
				return;
			} else if (menu == 3) {
				System.out.println("이름을 입력하세요.");
			  // sp.searchCantact(sc.next(), Contact newContact);
				//printInfo(contact);
				return;
			} else if (menu == 4) {
				//deleteContact();
			} else if (menu == 5) {
				System.out.println("이름을 입력하세요.");
				//sp.editContact(sc.next(), Contact newContact);
				return;
			} else if (menu==6){
				System.out.println("메뉴를 종료합니다.");
			}else {
				System.out.println("잘못 입력하셨습니다.");
				return;
			}

	}

	public static void printMenu() {
		System.out.println("Contact-------------------");
		System.out.println(">> 1. 연락처 등록");
		System.out.println(">> 2. 모든 연락처 출력");
		System.out.println(">> 3. 연락처 검색");
		System.out.println(">> 4. 연락처 삭제");
		System.out.println(">> 5. 연락처 수정");
		System.out.println(">> 6. 프로그램 종료");
		System.out.println("--------------------------");
		System.out.print("몇 번 메뉴를 실행할까요? : ");
	}

}
