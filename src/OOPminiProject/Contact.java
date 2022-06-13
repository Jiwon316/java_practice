package OOPminiProject;

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
	
	public void printInfo(Contact c) {
		System.out.println("이름 : "+ c.name);
		System.out.println("전화번호 : "+ c.number);
		System.out.println("이메일 : "+ c.email);
		System.out.println("주소 : "+ c.address);
		System.out.println("생일 : "+ c.birthDate);
		System.out.println("그룹 : "+ c.group);
	}

}
