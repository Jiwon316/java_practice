package Basic_03;

import java.util.Scanner;

public class Basic_03_04_1 {

	public static void main(String[] args) {
		// *을 다섯개씩 끊어서 보여주기. for문 사용
		Scanner in = new Scanner(System.in);
		System.out.println("몇 개의 *을 표시할까요");
		int a = in.nextInt();

		if (a >= 0) {
			for (int i = 1; i <= a; i++) {
				System.out.print("*");
				if (i % 5 == 0) {
					System.out.printf("\n");
					// System.out.println();
				}
			}
		} else {
			System.out.println("양수가 아닙니다");
		}
	}
}

//5번에 한번씩 줄바꿈 넣어주기
