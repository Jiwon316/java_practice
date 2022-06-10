package Ch06.CodingProject;

public class StudentScoreReport {

	public static void main(String[] args) {

		Student [] students = new Student [10];
	
		
		students[0]= new Student(null,100,70,80);
		students[1]= new Student(null,70,80,60);
		students[2]= new Student(null,80,70,70);
		students[3]= new Student(null,60,80,80);
		students[4]= new Student(null,50,60,70);
		students[5]= new Student(null,70,50,60);
		students[6]= new Student(null,90,90,50);	
		students[7]= new Student(null,90,80,90);
		students[8]= new Student(null,80,70,90);
		students[9]= new Student(null,100,80,90);
		
		//int sum =Student.add(students[]);
		//double avg = Student.div(students[]);
				
		System.out.println("### Score Report###");
		System.out.println(" 국어  영어  수학  |          총합   평균");
		System.out.println("------------------------------------------");
				
		for(int i = 0 ;i<10;i++) {  
		System.out.println("  "+students[i].getKorScore()+"   "+students[i].getEngScore()+"   "+students[i].getMathScore()+"   |      "+students[i].sum+"   "+students[i].avg);
		}
		

	}

}
