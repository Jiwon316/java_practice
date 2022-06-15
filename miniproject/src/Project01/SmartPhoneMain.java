package Project01;

import java.util.Scanner;

public class SmartPhoneMain {

	public static void main(String[] args) {
		Contact contact = new Contact();
		Scanner sc = new Scanner(System.in);

		System.out.println("# 데이터 2개를 입력합니다.");
		SmartPhone.inputContactData();
		System.out.print(">> 데이터가 저장되었습니다. (1) ");
		SmartPhone.addContactData(contact);
		
		System.out.println();

		SmartPhone.inputContactData();
		System.out.print(">> 데이터가 저장되었습니다. (2) ");

		printMenu();
		int menu = sc.nextInt();

		if (menu == 1) {
			SmartPhone.inputContactData();
			SmartPhone.addContactData(contact);
			System.out.print(">> 데이터가 저장되었습니다.");
			return;
		} else if (menu == 2) {

			return;
		} else if (menu == 3) {
			System.out.println("이름을 입력하세요.");
			return;
		} else if (menu == 4) {

		} else if (menu == 5) {
			System.out.println("이름을 입력하세요.");
			return;
		} else if (menu == 6) {
			System.out.println("메뉴를 종료합니다.");
		} else {
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
