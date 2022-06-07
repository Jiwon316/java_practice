package CH05.String;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "김성호";
		String strVar2 = "김성호";
		
		if(strVar1==strVar2) {
			System.out.println("strVar1과 strVar2은 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2은 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2은 문자열이 같음");
		}
		
		String strVar3 = new String ("김성호");
		String strVar4 = new String ("김성호");
		
		if(strVar3==strVar4) {
			System.out.println("strVar3과 strVar4은 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4은 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4은 문자열이 같음");
		}
	}

}
