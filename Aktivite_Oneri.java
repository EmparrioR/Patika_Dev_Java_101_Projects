import java.util.Scanner;

public class Aktivite_Oneri {
	public static void main(String [] args){
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Hava Sıcaklığını Giriniz: ");
		double derece = inp.nextDouble();
		
		if (derece <= 5) {
			
			System.out.print("Kayak yapabilirsiniz");
		
		} else if (derece > 5 && derece <= 15) {
			
				System.out.print("Sinemaya gidebilirsiniz");
				
		} else if (derece > 15 && derece <=25) {
				
				System.out.print("Piknik yapabilirsiniz");
			
		} else {
			
			System.out.print("Yüzmeye gidebilirsiniz");
			
		}
		
	}
}