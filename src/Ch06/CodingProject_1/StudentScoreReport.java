package Ch06.CodingProject_1;

public class StudentScoreReport {

	public static void main(String[] args) {
		Student[] student = new Student[10];
		
		student[0]= new Student("aaa",100,70,80);
		student[1]= new Student("bbb",70,80,60);
		student[2]= new Student("ccc",80,70,70);
		student[3]= new Student("ddd",60,80,80);
		student[4]= new Student("eee",50,60,70);
		student[5]= new Student("fff",70,50,60);
		student[6]= new Student("ggg",90,90,50);	
		student[7]= new Student("hhh",90,80,90);
		student[8]= new Student("iii",80,70,90);
		student[9]= new Student("jjj",100,80,90);

		System.out.println("### Score Report###");
		System.out.println(" 국어  영어  수학       |       총합   평균");
		System.out.println("------------------------------------------");
				
		for(int i = 0 ;i<student.length;i++) {  
		System.out.println(" "+student[i].getKorScore()+"     "+student[i].getEngScore()+"      "+student[i].getMathScore()+"       |      "+Student.add(student[i])+"   "+Student.div(student[i]));
		}
	}

}
