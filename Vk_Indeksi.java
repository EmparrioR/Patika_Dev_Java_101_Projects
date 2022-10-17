import java.util.Scanner;

public class Vk_Indeksi {
	public static void main(String [] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Boyunuzu giriniz (m): ");
	double boy = input.nextDouble();
	
	System.out.print("Kilonuzu giriniz (kg): ");
	double kilo = input.nextDouble();
	
	double indeks = kilo/(boy*boy);
	System.out.println("Vücut Kitle İndeksiniz: " + indeks);
		
	}
}