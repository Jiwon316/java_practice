package Basic_03;

import java.util.Scanner;

public class Basic_03_05_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("2 이상의 정수값 : ");
		int a = in.nextInt();
		int x = 0;
		
		for (int i = 2; i < a; i++) {
			x = (a % i == 0) ? x+1: x;
			//약수가 발생할 경우 x에 숫자를 더해줌
		}
	
		String result = (x == 0) ? "소수입니다." : "소수가 아닙니다.";
		System.out.println(result);

	}
}
