package CH05_Array;

public class ArrayExample2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] { 83, 90, 87 };

		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.print("총합: " + sum1);

		// add라는 메소드를 콜함
		int sum2 = add(new int[] { 86, 90, 89 });
		// 힙메모리에 주소값을 리턴하여 스택의 스코어스에 넣어줌
		// 어레이가 아니라 인티저라면 그 값을 그대로 스코어에 넣어줌
		// 그래서 스코어스를 컨트롤할 수 있음 , scores[0] 0번지 등에 접근 가능해짐
		// 썸1 쪽에 있는 배열과는 또 다른 배열이 생성됨
		System.out.println();
		// 위아래 구분 줄바꿈용
		System.out.print("총합: " + sum2);

	}

	// add로 콜할 메소드를 정의함
	public static int add(int[] scores) {
		// 스코어스라는 지역변수를 선언함
		// add를 콜한 쪽에 인티저로 리턴해줌
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		return sum;
		// 계산된 값이 있을 때 콜한 쪽으로 넘겨줌
		// 리턴이 없으면 void를 붙여줘야함

	}

}
