package Basic_03;

import java.util.Scanner;

public class Basic_03_04 {

	public static void main(String[] args) {
		// *을 다섯개씩 끊어서 보여주기. for문 사용
		Scanner in = new Scanner(System.in);
		System.out.println("몇 개의 *을 표시할까요");
		int a = in.nextInt();

		if (a >= 0) {
		  for (int i = 1; i <=a/5; i++) {
				System.out.println("*****");
		  }			
		  for(int j=1;j<=a%5;j++) {
			System.out.print("*");
			}
	}else{
		System.out.println("양수가 아닌 수를 입력하셨습니다.");
	}
}
}