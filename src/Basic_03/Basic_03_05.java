package Basic_03;

import java.util.Scanner;

public class Basic_03_05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("2 이상의 정수값 : ");
		int a = in.nextInt();
		for (int i = 2; i < a; i++) {
			if (a % i != 0) {
				continue;
			} else {
				System.out.println("입력하신 값은 소수가 아닙니다.");
				break;
			}
		}
	}

}

//나누어지는 수가 있으면 다 더해서 0이면 소수 0이 아니면 소수가 아님
