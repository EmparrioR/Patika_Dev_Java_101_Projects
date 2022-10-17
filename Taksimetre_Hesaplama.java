import java.util.Scanner;

public class Taksimetre_Hesaplama {
	public static void main(String [] args){
		
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Gidilen Km'yi giriniz: ");
		double km = input.nextDouble();
		
		if (km*2.20 > 20) {
			
		double sonuc = (km*2.20)+10;
		System.out.println("Ücret: " + sonuc );
		} 
		else if ((km*2.20)+10 < 20){
			System.out.println("Ücret: " + 20);
		}			
	}
}