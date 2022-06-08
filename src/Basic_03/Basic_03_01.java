package Basic_03;

import java.util.Scanner;

public class Basic_03_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("정수 A :");
		int a = in.nextInt();
		System.out.println("정수 B :");
		int b = in.nextInt();
		if(a<b) {
			int temp = b;
			b=a;
			a=temp;
			//위에서 이미 int a를 선언했기 때문에 int를 붙이면 오류가 남
		}
		int i=b;
		do {
			System.out.println(i);
			i++;
		}while(i<=a);
	}

}
