package Basic_03;

import java.util.Scanner;

public class Basic_03_04_1 {

	public static void main(String[] args) {
		// *을 다섯개씩 끊어서 보여주기. for문 사용
		Scanner in = new Scanner(System.in);
		System.out.println("몇 개의 *을 표시할까요");
		int a = in.nextInt();
		for (int i = 1; i <= a + (a / 5); i++) {
			if (a % 5 == 0) {
				continue;
			}
		}
	}
}

//5번에 한번씩 참거짓을 판별하여 나머지가 0일 경우 컨티뉴?
//이 경우에는 컨티뉴할 때 별의 개수가 줄어듦
