package Project01;

public class Contact {
	private String name;
	private String number;
	private String email;
	private String address;
	private String birthDate;
	private String group;
	
	public Contact(String name,String number,String email,String address,String birthDate,String group) {
		this.name=name;
		this.number=number;
		this.email=email;
		this.address=address;
		this.birthDate=birthDate;
		this.group=group;
	}
	
	public Contact() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}
	
	//public static Contact contact = new Contact(contact.getName(),contact.getNumber(),contact.getEmal(),contact.getAddress(),
	//contact.getBitrhDate(),contact.getGroup());
	
	public static Contact contact = new Contact();
	
	public void printInfo() {
		System.out.println("이름 : "+ this.name);
		System.out.println("전화번호 : "+ this.number);
		System.out.println("이메일 : "+ this.email);
		System.out.println("주소 : "+ this.address);
		System.out.println("생일 : "+ this.birthDate);
		System.out.println("그룹 : "+ this.group);
	}
}
