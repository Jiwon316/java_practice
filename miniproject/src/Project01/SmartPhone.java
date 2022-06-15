
package Project01;

import java.util.Scanner;

public class SmartPhone {
	public static Contact[] contact = new Contact[10];

	static int l = contact.length;

	static Scanner sc = new Scanner(System.in);

	public static Contact inputContactData() {

		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("전화번호 : ");
		String number = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		System.out.print("주소 : ");
		String address = sc.next();
		System.out.print("생일 : ");
		String birthDate = sc.next();
		System.out.print("그룹 : ");
		String group = sc.next();

		return new Contact(name, number, email, address, birthDate, group);
	}

	public static void addContactData(Contact contact) {
			if(contact[i].getName(null)){
				 contact[i]=
			 }
		}

	public static void printContact(Contact contact) {
		Contact.printInfo(contact);
	}

	public static void printAllContact() {
		for (int i = 0; i < l; i++) {
			System.out.println("--------------------");
			Contact.printInfo(contact[i]);
			System.out.println("--------------------");
		}
	}

	public static void searchContact(String name) {

	}

	public static void deleteContact(String name) {
		for (int i = 0; i < l; i++) {
			if (contact[i].getName().equals(name)) {
				System.arraycopy(contact,i+1,contact,i,(contact.length-i+1));
			}
		}
	}
}
