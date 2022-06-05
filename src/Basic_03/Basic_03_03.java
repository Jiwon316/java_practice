package Basic_03;

import java.util.Scanner;

public class Basic_03_03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("양의 정수값 :");
		int a = in.nextInt();
		
		int i = 1;
		int mul = 1;
		//mul에도 초기값으로 1을 주어야 오류가 나지 않음
		
		while(i<=a) {
			mul=mul*i;
			i++;
		}
		System.out.println("1부터 "+a+"까지의 곱은 "+mul+"입니다.");

	}

}
