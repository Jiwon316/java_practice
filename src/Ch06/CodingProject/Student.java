package Ch06.CodingProject;

public class Student {
	private String  name;
    private int korScore;
    private int mathScore;
    private int engScore;
	int sum;
	double avg;

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

 public Student(String name, int korScore,int engScore, int mathScore){
       
    	this.name=getName();
    	this.korScore=getKorScore();
    	this.mathScore=getMathScore();
    	this.engScore=getEngScore(); 
    	
	}
    
    public static int add(Student student) {
    	return student.getKorScore()+student.getEngScore()+student.getMathScore();
    }
    
    public static double div(Student student) {
    	return (student.getKorScore()+student.getEngScore()+student.getMathScore())/3;
    }
}
