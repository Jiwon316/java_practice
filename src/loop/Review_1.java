package loop;

public class Review_1 {

	public static void main(String[] args) {
		
		int i=1;
	        do {
	            i++;            
	            if (i%2==1) {
	                continue;
	            }
	            System.out.print(i + " ");
	        }while(i<=10);
	        
	}

}
