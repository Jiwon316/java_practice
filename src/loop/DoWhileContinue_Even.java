package loop;

public class DoWhileContinue_Even {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;

		do {		
			i++; 
			if(i%2!=0) {
				continue;
			}
			sum += i;	
			}while (i <100);
		// 컨티뉴를 사용하면 조건문으로 이동
		System.out.println(sum);
	}
}
//홀수와 짝수는 조건이 달라짐, 같은 식으로 실행할 경우 답이 나오지 않음
