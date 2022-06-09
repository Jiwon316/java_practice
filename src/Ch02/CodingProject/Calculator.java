package Ch02.CodingProject;

import java.util.Scanner;

public class Calculator {
	int a;
	int b;
	double r;

	public static int add(int a, int b) {
		return a+b;
		//int add=a+b; 불필요한 내용
	}

	public static int sub(int a, int b) {
		return a-b;
	}

	public static int mul(int a, int b) {
		return a * b;
	}

	public static int div(int a, int b) {
		return a / b;
	}
	
	public static double circleArea(double r) {
		return 2*(3.14)*r;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Calculator cal = new Calculator();
		System.out.println("a값 : ");
		int a= in.nextInt();
		System.out.println("b값 : ");
		int b= in.nextInt();
		
		int add1=add(a,b);
		System.out.println("a값과 b값의 합은"+add1+"입니다.");
		int sub1=sub(a,b);
		System.out.println("a값과 b값의 차는"+sub1+"입니다.");
		int mul1=mul(a,b);
		System.out.println("a값과 b값의 곱은"+ mul1+"입니다.");
		int div1=div(a,b);
		System.out.println("a값을 b값으로 나눈 몫은"+div1+"입니다.");
		
		System.out.println("r값 : ");
		double r= in.nextDouble();
		double circleArea1=circleArea(r);
		circleArea1=(double) Math.round(circleArea1*10)/10;
		//소수점 둘째자리에서 반올림하는 코드
		System.out.println("반지름이 ㄱ값인 원의 둘레는"+circleArea1+"입니다.");
		
		
		
	}
}
