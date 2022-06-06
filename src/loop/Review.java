package loop;

public class Review {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;

		do {		
			i++; 
			if(i%2!=0) {
				continue;
			}
			sum += i;	
			}while (i <=10);
		// 컨티뉴를 사용하면 조건문으로 이동
		System.out.println(sum);
	}
}
