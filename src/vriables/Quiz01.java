package vriables;

import java.util.Scanner;
//키보드를하드웨어적으로컨트롤할수있게자바에서제공하는기능

public class Quiz01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        //in: 키보드의입력값을받을준비를함
        System.out.println("정수값;");
        int x = in.nextInt();
        //만들어진데이터는정수이므로정수에맞는공간을만들어야함
        //nextInt 다음에입력하는정수를받아올것
        System.out.println(x+"를입력했습니다.");
   }
}