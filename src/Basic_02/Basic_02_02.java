package Basic_02;

import java.util.Scanner;

public class Basic_02_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("정수값 : ");
		int a = in.nextInt();
		// 중첩조건문 사용

		if (a >= 0) {
			if (a % 3 != 2) {
				if (a % 3 != 1) {
					System.out.println("이 값을 3으로 나눈 나머지는 0입니다.");
				} else {
					System.out.println("이 값을 3으로 나눈 나머지는 1입니다.");
				}
			} else {
				System.out.println("이 값을 3으로 나눈 나머지는 2입니다.");
			}
		} else {
			System.out.println("양수가 아닌 값을 입력하셨습니다.");
		}
	}
}

	