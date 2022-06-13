package Ch07.CodingProject;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account ac = new Account();

		System.out.println("계좌 정보를 입력하세요");
		System.out.print("계좌명의 : ");
		ac.setName(sc.next());
		System.out.print("계좌번호 : ");
		ac.setNo(sc.next());
		System.out.print("잔고 : ");
		ac.setBalance(sc.nextInt());
	    System.out.println(ac);
	    //투스트링을 오버라이딩해서 클래스 이름만 넣어도 값이 호출됨
	    //toString(ac.getName(), ac.getNo(),ac.getBalance());
		//Account.toString(ac); 안써도 됨
		//System.out.printf("계좌 기본 정보 : {%s,%s,%d} \n",ac.getName(),ac.getNo(),ac.getBalance());
		System.out.print("출금액 : ");
		int withdraw = sc.nextInt();
		System.out.println("잔금은 " + (ac.getBalance() - withdraw) + "입니다.");

	}

}
