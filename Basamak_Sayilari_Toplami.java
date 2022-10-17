import java.util.Scanner;

public class Basamak_Sayilari_Toplami{
	public static void main(String [] args){
		
		int arm_hes;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Sayıyı giriniz: ");
		int sayi = inp.nextInt();
		
		int birler = sayi%10;
		int onlar = (sayi%100)/10;
		int yuzler = (sayi%1000)/100;
		int binler = (sayi/1000);
		
		
		int sonuc = birler + onlar + yuzler + binler;
		
	System.out.println("Basamak sayılarının toplamı: " + sonuc);	
		
		
	}
}	