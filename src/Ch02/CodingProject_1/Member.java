package Ch02.CodingProject_1;

import java.util.Scanner;

public class Member {

	String name;
	int age;
	double height;
	boolean hasBook;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Member member = new Member();
		System.out.println("나이를 입력하세요.");
		member.age = in.nextInt();

		String result1 = vaccine(member.age);
		System.out.println(result1);

		String result2 = health(member.age);
		System.out.println(result2);

	}

	public static String vaccine(int age) {
		if (age < 13 || age >= 60) {
			return "무료 백신접종이 가능합니다";
		} else {
			return "무료백신 대상이 아닙니다";
		}
	}

	public static String health(int age) {
		if (age >= 20) {
			if (age % 2 == 0) {
				if (age >= 40) {
					return "건강검진 대상입니다. \n무료 암 검사도 가능합니다.";
				} else {
					return "건강검진 대상입니다.";
				}
			} else {
				return "건강검진 대상이 아닙니다.";
			}
		} else {
			return "건강검진 대상이 아닙니다.";
		}
	}

}
