import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요: ");
		String str = sc.nextLine();


		 while(true) {
			 if (str.equals("exit")) {
				//문자열은 ==로 비교할 수 없음, .equals() 사용
					System.out.println("프로그램을 종료합니다.");
				 break;
			} else {
				System.out.println(str.length() + "글자 입니다.");
				break;
			}

	}

		}

	}



