import java.util.Scanner;

public class Us_Hesabi_Recursive {
	
	public static int us_alma(int taban,int us){

    	if (taban == 1){
			return 1;
		} else if (us == 0) {
			return 1;
		} else {
			return taban*us_alma(taban,us-1);
		}

	
	public static void main(String [] args){

		System.out.println(us_alma(5,3));
		
		
		
		
	/*	
		for (int i = 1; i < n; i*=2){
			
				System.out.println("2'nin kuvvetleri: " + i);
			
		}
	*/
/*
		for (int i=1; i <= n; i*=4){
			
			System.out.println("4'ün kuvvetleri: " + i);
			
		}
			
			for (int j=1; j <= n; j*=5){
				
				System.out.println("5'in kuvvetleri: " + j);		
		}

*/
		
	}
}