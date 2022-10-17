import java.util.Scanner;

public class Ucak_Bileti {
	public static void main(String [] args){
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Mesafeyi giriniz (KM): ");
		double mesafe = inp.nextDouble();
		
		System.out.print("Yaşınızı giriniz: ");
		int yas = inp.nextInt();
		
		System.out.print("Yolculuk Tipi (1=> Tek Yön,2=> Gidiş-Dönüş) Seçin: ");
		int tip = inp.nextInt();
		
		double tutar = mesafe*(0.10);
		
		if (mesafe > 0 && yas > 0){
				if (tip == 1){
					
					if (yas < 12){
						System.out.println("Toplam tutar: " + tutar*(0.5));
					}else if (yas >= 12 && yas <= 24){
						System.out.println("Toplam tutar: " + tutar*(0.9));
					}else if (yas >= 65){
						System.out.println("Toplam tutar: " + tutar*(0.7));
					}else {
						System.out.println("Toplam tutar: " + tutar);
					}
				}else if (tip == 2){
					tutar = (tutar*2)*0.8;
					if (yas < 12){
						System.out.println("Toplam tutar: " + tutar*(0.5));
					}else if (yas >= 12 && yas <= 24){
						System.out.println("Toplam tutar: " + tutar*(0.9));
					}else if (yas >= 65){
						System.out.println("Toplam tutar: " + tutar*(0.7));
					}
				}else {
					System.out.println("Hatalı Veri Girdiniz !");
				}
		}else {
			System.out.println("Hatalı Veri Girdiniz !");
		}
	}
}