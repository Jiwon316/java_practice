package Condition;


public class Quiz01 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%2 != 1) {
				continue;
				//나머지가 1이 아닌 경우(짝수)의 경우에는 지나치고 반복함
			}
		sum += i;
		//i의 값을 합함
		}
		
		System.out.println("1부터 100사이의 홀수의 합은 "+sum);

	}

}
