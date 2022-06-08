package Variables;


import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("정수값:");
		int x = in.nextInt();
		//인티저이기 때문에 어레이를 사용할 수는 없음
		System.out.println("마지막 자릿수를 제외한 값은 "+(x/10)+"입니다.");
		System.out.println("마지막 자릿수는 "+(x-(x/10)*10)+"입니다.");
	}

}