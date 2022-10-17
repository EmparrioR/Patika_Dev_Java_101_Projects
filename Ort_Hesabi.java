import java.util.Scanner;

public class Ort_Hesabi {
	public static void main(String [] args){
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Matematik notunuzu giriniz: ");
		double mat = inp.nextDouble();
		
		System.out.print("Fizik notunuzu giriniz: ");
		double fiz = inp.nextDouble();
		
		System.out.print("Türkçe notunuzu giriniz: ");
		double tr = inp.nextDouble();
		
		System.out.print("Kimya notunuzu giriniz: ");
		double kim = inp.nextDouble();
		
		System.out.print("Müzik notunuzu giriniz: ");
		double müz = inp.nextDouble();
		
		double ort = (mat+fiz+tr+kim+müz)/5;
		
		if (ort > 0 && ort < 55){
			
			
			System.out.println("Ortalamanız: " + ort + "\nKaldınız !");
		
		}
		else if (ort >=55 && ort <= 100) {
			
			System.out.println("Ortalamanız: " + ort + "\nGeçtiniz !");
		}
		else {
			System.out.println(" ");
		}
	}
}