package Basic_02;

import java.util.Scanner;

public class Basic_02_06 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("몇 월인가요?");
	int a = in.nextInt();
	
		//브레이크의 의미를 다시 생각해보기
		switch (a) {
		case 1:
		case 2:
		case 12:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("그런 월은 없습니다.");
		}

	}

}
