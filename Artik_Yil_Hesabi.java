import java.util.Scanner;

public class Artik_Yil_Hesabi {
	public static void main(String [] args){
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Doğum yılınızı giriniz: ");
		int yil = inp.nextInt();
		
		
		if (yil%4 == 0){
			
			if (yil%100 == 0){
				if (yil%400 == 0){
				 System.out.println(yil + " bir artık yıldır");
				}else {
				 System.out.println(yil + " bir artık yıl değildir");
				}
		
			}else {
			System.out.println(yil + " bir artık yıldır");
			}
		}else {
			System.out.println(yil + " bir artık yıl değildir");
		}
	}
}
