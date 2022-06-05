package vriables;


import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("x 값:");
		double x = in.nextDouble();
		System.out.println("y 값:");
		double y = in.nextDouble();
		System.out.println("합계는 "+(x+y)+"입니다.");
		System.out.println("평균은 "+(x+y)/2+"입니다.");

	}

}
