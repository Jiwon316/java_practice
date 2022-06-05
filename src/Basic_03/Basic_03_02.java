package Basic_03;

import java.util.Scanner;

public class Basic_03_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("몇 개의 *을 표시할까요?");
		int a = in.nextInt();
		if (a >= 0) {
			int i = 1;

			while (i <= a) {
				System.out.print("*");
				i++;
			}
		}
	}

}
