import java.util.Scanner;

public class Ucgen_Alan_Hesaplama {
    public static void main(String[] args) {
        
        Scanner giris = new Scanner(System.in);

        System.out.print("A kenarını giriniz: ");
        int a = giris.nextInt();
    
        System.out.print("B kenarını giriniz: ");
        int b = giris.nextInt();

        double sqr = (a*a)+(b*b);

        double hipo = Math.sqrt(sqr);

        System.out.print("C kenarını giriniz: ");
        int c = giris.nextInt();
		
		System.out.println("Hipotenüs: " + hipo);
		
		float cevre = (a+b+c);
		System.out.println("Üçgenin çevresi: " + cevre);
		
		float alan_kare = (cevre/2)*(cevre/2-a)*(cevre/2-b)*(cevre/2-c);
		// Dik üçgende (a*b)/2'de alan hesabını verir.
		
		System.out.println("Üçgenin Alanı: " + Math.sqrt(alan_kare));
		

        
    }
}