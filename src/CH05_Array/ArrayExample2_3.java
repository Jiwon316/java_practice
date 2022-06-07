package CH05_Array;

public class ArrayExample2_3 {

	public static int add( int[] scores ) {
		int sum = 0;
		for(int i = 0;i<3;i++) {
			sum += scores[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int sum2=add(new int[] {88,79,90});
		System.out.println("총합 : "+sum2);

	}

}
