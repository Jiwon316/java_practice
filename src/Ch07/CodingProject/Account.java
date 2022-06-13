package Ch07.CodingProject;

public class Account {
	private String name;
	private String no;
	private int balance;
	
	public Account() {
		this.name = name;
		this.no=no;
		this.balance=balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//public void toString(Account account) {
		//System.out.println("{"+account.name+","+account.no+","+account.balance+"}");
		//System.out.printf("{%s,%s,%d}\n",account.name,account.no,account.balance);
//}

	public String toString() {
		return "계좌 기본정보 : {"+name+","+no+","+balance+"}";
		//오브젝트 객체의 메소드 투스트링을 오버라이딩함
				
	}
	
}
