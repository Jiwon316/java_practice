package operator;

public class IfNestesExample {

	public static void main(String[] args) {
		int score = (int)(Math.random()*20)+81;
		//81부터 시작해서 20까지의 난수를 구함
		//Math.random() 0~1(1은 미포함) 구간에서 부동소수점의 난수를 생성
		System.out.println("점수: "+score);
		
		String grade;
		
		if (score>=90) {
			if(score>=95) {
				grade="A+";
			}else {
				grade="A";
			}
		}else{
			if(score>=85) {
				grade="B+";
			}else {
				grade="B";
			}
		}
		System.out.println("학점: "+grade);
	}

}
