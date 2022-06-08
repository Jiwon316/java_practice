package CH06_Class;

public class Calculator {

	int a;
	int b;

	public int add(int a, int b) {
		return a+b;
		//int add=a+b; 불필요한 내용
	}

	public int sub(int a, int b) {
		return a-b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}
}
