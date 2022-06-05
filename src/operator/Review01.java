package operator;


public class Review01 {

	public static void main(String[] args) {
		String str1 = "JDK "+6.0;
		String str2 = str1 +" 특징";
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = 3+3.3+str1;
	    String str4 = str1+"3";    
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println(5/0.0);
		System.out.println(5%0.0);
		//인피니티:무한대, 난:낫어넘버
		
		int score = 95;
		char grade = (score>90)? 'A':'B';
		System.out.println(grade);
		
		/** 위와 동일한 코드
		int score = 95;
		char grade;
		if(score>90){
		grade=A
		}else{
		grade=B
		}
		System.out.println(grade);
		그러나 위의 코드를 더 선호
		 */
	
		int x=1;
		int y=1;
		int result1 = ++x + 10;
		System.out.println(result1);
		//x 앞에 증감연산자가 붙어있으므로 2가 되어  result1의 값은 12
		int result2 = y++ + 10;
		System.out.println(result2);
		System.out.println(y);
		//y에 1을 넣고 10을 더해서 result2의 값은 11, 그리고 y는 2가 됨

	}

}
