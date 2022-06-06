package loop;

public class DoWhile_Odd {

	public static void main(String[] args) {

		int sum = 0;
		int i = 0;
		//i의 초기값이 1일 경우 아래 실행문에서 증감식을 만나 1이 포함되지 않으므로 0을 줘야함
		do {
			i++;
			if (i % 2 == 0) {
				continue;
			}
			sum += i;
		} while (i <100);
		// 컨티뉴를 사용하면 조건문으로 이동
		System.out.println(sum);
	}
}
