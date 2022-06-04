package Basic_02;

import java.util.Scanner;

public class Basic_02_04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("정수 a :");
		int a = in.nextInt();
		System.out.println("정수 b :");
		int b = in.nextInt();

		System.out.println("a>=b가 되도록 정렬했습니다.");

		if (a < b) {
			int temp = b;
			b = a;
			a = temp;
			// 두 변수의 값을 뒤바꾸고 싶을 때 임시 변수를 이용
		}
		System.out.println("변수 a는 " + a + "입니다.");
		System.out.println("변수 b는 " + b + "입니다.");
	}

}
