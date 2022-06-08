package Basic_05;

import java.util.Scanner;

public class Basic_05_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("사람 수는 몇명 :");
		int a = in.nextInt();
		System.out.println("점수를 입력하세요 : ");
		
	    int[] scores =new int [a];
		
		for(int i=1;i<=a;i++) {
			System.out.print(i+"번의 점수 : ");
			scores [i-1]=in.nextInt();
        }

		int sum1= add(scores);
    	int avg=sum1/a;
    	
     	System.out.println("합계는 "+sum1+"입니다.");
     	System.out.println("평균은 "+avg+"입니다.");
     	System.out.println("최고점은 "+"모름"+"입니다.");
     	System.out.println("최저점은 "+"모름"+"입니다.");
	}
	public static int add(int[]scores) {
		int sum=0;
		for(int i=0;i<scores.length;i++) {
			sum+=scores [i];
		}
			return sum;
	}
}
