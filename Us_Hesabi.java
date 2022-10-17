import java.util.Scanner;

public class Us_Hesabi {
	public static void main(String [] args){
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Sayı Giriniz: ");
		int n = inp.nextInt();
	/*	
		for (int i = 1; i < n; i*=2){
			
				System.out.println("2'nin kuvvetleri: " + i);
			
		}
	*/

		for (int i=1; i <= n; i*=4){
			
			System.out.println("4'ün kuvvetleri: " + i);
			
		}
			
			for (int j=1; j <= n; j*=5){
				
				System.out.println("5'in kuvvetleri: " + j);		
		}
		
	}
}