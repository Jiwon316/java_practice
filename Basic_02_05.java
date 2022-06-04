package Basic_02;

import java.util.Random;

public class Basic_02_05 {

	public static void main(String[] args) {
		System.out.println("컴퓨터가 낸 것은 :");
		
		int a = (int)(Math.random()*3)+0;
		
		switch(a) {
		case 0:
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
			break;
		default:
			System.out.println("보");
			break;
			}

	}

}
