package Condition;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("정수값:");
		int x = in.nextInt();
		if(x>=0) {
			System.out.println("절대값은: "+x+"입니다.");
		}else {
			System.out.println("절대값은: "+(-x)+"입니다.");
		}

	}

}
