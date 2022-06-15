

public class Contact {
	private static String name;
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

	public static String getName() {
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
	
	 //임시 객체를 생성해서 저장하면 그 객체로 들어가게 한 다음에 그걸 복사해서 배열에 집어넣는다?
	/**
	  public Contact newContact = new Contact(String name,String number,String email,String address,String birthDate,String group){
		this.name=name;
		this.number=number;
		this.email=email;
		this.address=address;
		this.birthDate=birthDate;
		this.group=group;
	}
	*/
	
	public static Contact contact = new Contact(); 
	
	public static void printInfo(Contact contact) {
		System.out.println("이름 : "+ contact.getName());
		System.out.println("전화번호 : "+ contact.getNumber());
		System.out.println("이메일 : "+ contact.getEmail());
		System.out.println("주소 : "+ contact.getAddress());
		System.out.println("생일 : "+ contact.getBirthDate());
		System.out.println("그룹 : "+ contact.getGroup());
	}

	/**
	public static void save(String name, String number, String email, String address, String bitrhDate, String group) {
		Contact contact = new Contact (name, number, email, address,bitrhDate, group);
	}
	
	public static void modify(String name, String number, String email, String address, String bitrhDate, String group) {
		Contact newContact = new Contact (name, number, email, address,bitrhDate, group);
	}
	//저장과 수정을 어떻게 다르게 해야하는지 고민해보기
	//원리: 뉴 컨택트 객체를 만든 후 배열에 정보를 덮어씌움
	
	public static void delete(Contact contact) {
		contact.name= null;
		contact.number = null;
		contact.email = null;
		contact.address = null;
		contact.birthDate = null;
		contact.group = null;
	}
	*/
}
