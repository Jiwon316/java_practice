package Basic_02;

import java.util.Scanner;

public class Basic_02_03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("정수 A :");
		int a = in.nextInt();
		System.out.println("정수 B :");
		int b = in.nextInt();
		
		//삼항 연산자 사용해서 풀기
		String result = (a-b>=10)?"두  값의 차이는 10 이상입니다.":"두 값의 차이는 9 이하입니다";		
		System.out.println(result);
				
	}

}
