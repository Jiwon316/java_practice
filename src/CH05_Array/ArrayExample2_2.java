package CH05_Array;

public class ArrayExample2_2 {

	public static void main(String[]args) {
		
		int sum = add(new int[] {89,76,93});
		System.out.println("총합: "+sum);
		int avg = sum/3;
		System.out.println("평균: "+avg);
		
	}
	
	public static int add(int[] scores) {
		int sum=0;
		for(int i=0;i<3;i++) {
			sum+=scores[i];
		}
		return sum;
	}
	
}
