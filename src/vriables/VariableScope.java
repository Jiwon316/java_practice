package vriables;


public class VariableScope {

	public static void main(String[] args) {
	int var1;
	
	if(true){
		int var2=20;
		
		var1 = 10;
		//var2 = 20; //선언과 동시에 값을 주기로 함
 	}
	
	var1=10;
	//var2=20; //이미 블락된 메소드의 변수는 메모리에서 팝 되었기 때문에 쓸 수 없음
	
	for(int i=0;i<1;i++) {
		int var3;
	
		var1=10;
		var3=30;
	}
	var1=10;
	//var3=30; //이미 끝난 메소드의 변수는 메모리에서 팝 되었기 때문에 끌어쓸 수 없다
	System.out.println(var1);
	//sysout+ctrl+space 단축키 입력
 }

}

//에러가 아닌 느낌표의 의미: 변수를 선언했으나 사용하지 않음
