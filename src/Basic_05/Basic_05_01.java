package Basic_05;

public class Basic_05_01 {

	public static void main(String[] args) {
	 int[]a= {5,4,3,2,1};
	 //int[]a= new int[]{5,4,3,2,1} 
	 //new 선언이 필요한지
	 for(int i=0;i<a.length;i++) {
		 //0부터 시작하기 때문에 <로 해야함 <=가 들어갈 경우 out of bounds 뜸
		 System.out.println("a["+i+"] = "+a[i]);
	 }
	}
}
