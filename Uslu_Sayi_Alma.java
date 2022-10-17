import java.util.Scanner;

public class Uslu_Sayi_Alma{
	public static void main(String [] args){	

	Scanner inp = new Scanner(System.in);
		
	System.out.print("Tabanı giriniz: ");
	int t = inp.nextInt();
	
	System.out.print("Üssü giriniz: ");
	int u = inp.nextInt();
	
/*	
	// Math sınıfını kullanarak üs alma işlemi
	double sonuc = Math.pow(t,u);
	
	System.out.println("Sonuç: " + sonuc);
*/

		long sonuc = 1;
		
		for (; u != 0; --u){
			sonuc *= t;
		}
		
		System.out.println("Sonuç: " + sonuc);
	}
}