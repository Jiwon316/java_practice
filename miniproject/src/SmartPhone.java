import java.util.Scanner;

public class SmartPhone {

	public static Contact [] contact = new Contact[10];
	static int l = contact.length;
	
	//Contact contact = new Contact();
	// Contact newContact = new Contact();



	public static Contact inputContactData() {
		Scanner sc = new Scanner(System.in);

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
		for(int i=0; i<l;i++) {
			if(contact.getName().equals(null)) {
				 
			}
		}
	}

	public static void printContact(Contact contact) {
		
	}

	public static void printAllContact() {
		for (int i = 0; i < l; i++) {
			System.out.println("--------------------");
			Contact.printInfo(contact[i]);
			System.out.println("--------------------");
		}
	}

	public static void searchContact(String name) {
		//for(int i=0;i<l<i++) {
				//if(name.contentEquals(contact[i].getName()))
			//return contact [i];
		//}

	}

	public static void deleteContact(String name) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		if (sc.next().contentEquals(Contact.getName())) {
			new Contact(null, null, null, null, null, null);
		}
		Contact [] temp = new Contact [9];
		System.arraycopy(contact,0,temp,0,contact.length);
		System.arraycopy(temp,0,contact,0,contact.length);
		
	}

	public static void editContact(String name, Contact newContact) {
		// inputContactData();
		newContact = inputContactData();
		if (name.contentEquals(Contact.getName())) {
			new Contact(newContact.getName(), newContact.getNumber(), newContact.getEmail(), newContact.getAddress(),
					newContact.getBirthDate(), newContact.getGroup());
		}
	}
}