package Basic_03;

import java.util.Scanner;

public class Basic_03_05_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("2 이상의 정수값 : ");
		int a = in.nextInt();
		int x = 0;

		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				x += 1;
			}
		}
		String result = (x == 0) ? "소수입니다." : "소수가 아닙니다.";
		System.out.println(result);

	}
}

//삼항 연산자 and를 사용하면 4번이면 판별 가능함