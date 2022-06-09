package sec06;

public class CarExample {

	public static void main(String[] args) {
		Car myCar= new Car();
		//객체생성
		
		//필드값 읽기
		System.out.println("제작회사"+ myCar.company);
		System.out.println("모델명"+ myCar.model);
		System.out.println("색깔"+ myCar.color);
		System.out.println("최고속도"+ myCar.maxSpeed);
		System.out.println("현재속도"+ myCar.speed);
		//초기값을 주지 않았으므로 기본값을 시스템이 줌
		
		System.out.println();
		
		//필드값 변경
		myCar.speed=60;
		System.out.println("현재속도"+ myCar.speed);
	}

}
