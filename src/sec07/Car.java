package sec07;

public class Car {
	//생성자
	String color;
	int cc;
	
	Car(String color, int cc){
		//위의 스트링 컬러와 인트 씨씨는 지역변수이기 때문에 위에서 한번 더 선언 후 this.를 붙여서 써줘야함
		this.color = color;
		this.cc= cc;
	}
}
