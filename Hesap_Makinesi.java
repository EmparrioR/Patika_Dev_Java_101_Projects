import java.util.Scanner;

public class Hesap_Makinesi{
	public static void main(String [] args){
		
		int n1,n2,secim;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("1.Sayıyı giriniz: ");
		n1 = input.nextInt();
		
		System.out.print("2.Sayıyı giriniz: ");
		n2 = input.nextInt();
		
		System.out.println("1.Topla,2.Çıkar,3.Çarp,4.Böl");
		
		System.out.print("İşlem: ");
		secim = input.nextInt();
		
		switch (secim) {
			case 1: System.out.println("Sonuç: " + (n1+n2));
			break;
			case 2: System.out.println("Sonuç: " + (n1-n2));
			break;
			case 3: System.out.println("Sonuç: " + (n1*n2));
			break;
			case 4: System.out.println("Sonuç: " + (n1/n2));
			break;
			default: System.out.println("Geçersiz işlem !");
		}
	}
}