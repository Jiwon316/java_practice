package Basic_02;

import java.util.Scanner;

public class Basic_02_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("변수 A :");
		int a = in.nextInt();
		System.out.println("변수 B :");
		int b = in.nextInt();
		
		if(a%b==0) {
			System.out.println("B는 A의 약수이다.");
		}else {
			System.out.println("B는 A의 약수가 아니다.");
		}
		
	}

}
