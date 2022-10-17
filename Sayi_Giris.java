import java.util.Scanner;

public class Sayi_Giris {
	public static void main(String [] args){
		
		
		int toplam = 0,number;
		
		Scanner inp = new Scanner(System.in);
		
	/*	
		do {
			System.out.print("Sayı giriniz: ");
		    number = inp.nextInt();
			
			if (number%2==1){
				
				toplam += number;
				System.out.println("Tek Sayıların Toplamı: " + toplam);
				
			};
				
		}while(number >= 0);
		
	*/
		
		do {
			System.out.print("Sayı giriniz: ");
		    number = inp.nextInt();
			
			if (number%2 == 0 && number%4 == 0){
				
				toplam += number;
				System.out.println("2 ve 4'ün katları toplamı: " + toplam);
				
			};
				
		}while(number%2 == 0);
		
		
	}
}