package Ch06.CodingProject_1;

public class Student {
	private String name;
	private int korScore;
	private int engScore;
	private int mathScore;

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
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	public Student(String name, int korScore, int engScore, int mathScore) {
		this.name=name;
		this.korScore=korScore;
		this.engScore=engScore;
		this.mathScore=mathScore;		
	}
	
	public static int add(Student student) {
		return student.korScore+student.engScore+student.mathScore;
	}

	public static double div(Student student) {
		return (student.korScore+student.engScore+student.mathScore)/3;
	}
	
}
