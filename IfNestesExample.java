package operator;

public class IfNestesExample {

	public static void main(String[] args) {
		int score = (int)(Math.random()*20)+81;
		//81���� �����ؼ� 20������ ������ ����
		//Math.random() 0~1(1�� ������) �������� �ε��Ҽ����� ������ ����
		System.out.println("����: "+score);
		
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
		System.out.println("����: "+grade);
	}

}
