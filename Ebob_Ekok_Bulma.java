import java.util.Scanner;

public class Ebob_Ekok_Bulma {
	public static void main(String [] args){
		
		// EBOB ve EKOK Bulma
		
		int i = 1,j = 1;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("1. Sayıyı Giriniz: ");
		int n1 = inp.nextInt();
		
		System.out.print("2. Sayıyı Giriniz: ");
		int n2 = inp.nextInt();
		
		int ebob = 1;
		
		
		while (i<=n1){
			
			i++;
			
			if (n1%i == 0 && n2%i == 0){
				ebob = i;
				
			}
			
			
		}
		
		int ekok = (n1*n2)/ebob;
		System.out.println("EBOB: " + ebob);
		System.out.println("EKOK: " + ekok);
		
	}
}