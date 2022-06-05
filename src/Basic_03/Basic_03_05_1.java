package Basic_03;

import java.util.Scanner;

public class Basic_03_05_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("2 이상의 정수값 : ");
		int a = in.nextInt();
		for (int i = 2; i <a; i++) {
			if (a % i == 0) {
				System.out.println("입력하신 값은 소수가 아닙니다.");
				break;
			}
			else{
				continue;			
			}
		}

	}

}
