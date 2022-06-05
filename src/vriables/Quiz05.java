package vriables;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("이름:");
		String name = in.nextLine();
		//nextLine 다음 입력된 한줄을 받아옴 
		System.out.println("나이:");
		int age = in.nextInt();
		System.out.println(name+"님 안녕하세요. 나이는 "+age+"살 이시네요.");
		
		
	}

}