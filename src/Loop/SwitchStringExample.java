package Loop;

public class SwitchStringExample {

	public static void main(String[] args) {
     String position = "과장";
     //문자열도 스위치를 사용할 수 있음
     
     switch(position) {
     case "부장":
    	 System.out.println("700만원");
    	 break;
     case "과장":
         System.out.println("500만원");     
         break;
     default:
         System.out.println("300만원");     
     }

	}

}
