package Variables;

import java.util.Scanner;

public class Quiz02{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("정수값;");
		int x = in.nextInt();
		System.out.println("100을 더한 값은 "+(x+100)+"입니다.");
		System.out.println("100을 뺀 값은 "+(x-100)+"입니다.");
	}

}
