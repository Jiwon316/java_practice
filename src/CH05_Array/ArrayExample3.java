package CH05_Array;

public class ArrayExample3 {

	public static void main(String[] args) {

		// add라는 메소드를 콜함
		int sum2 = add(10, 20);
		// 함수를 콜함
		System.out.println();
		System.out.print("총합: " + sum2);
		
		//int sum3=add(10,20,30); ->에러발생
        //개수가 맞지 않음
	}

	public static int add(int a, int b) {
		// add로 콜할 함수 정의
		int sum = 0;
		sum += a + b;
		return sum;
	}

}
