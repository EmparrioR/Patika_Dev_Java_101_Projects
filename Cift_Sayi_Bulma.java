import java.util.Scanner;

public class Cift_Sayi_Bulma {
	public static void main(String [] args){
	
		
		double ort;
		int toplam = 0,sayac = 0;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Bir Sayı Giriniz: ");
		int sayi = inp.nextInt();
		
		for(int i = 1; i <= sayi; i++){
			
			System.out.println(i);
			
			if(i%12 == 0){
				
				toplam += i;
				sayac++;
				
			}
			
		}
		ort = (toplam/sayac);
		System.out.println("3 ve 4'e tam bölünenlerin ortalaması: " + ort);
	}
}