import java.util.Scanner;

public class Daire_Hesabi {
	public static void main(String [] args){
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("Dairenin yarıçapını(r) giriniz: ");
	double r = input.nextDouble();
	
	System.out.print("Merkez açı ölçüsünü giriniz: ");
	double q = input.nextDouble();
	
	double g_alan = (r*r)*3.14;
	double cevre = (2*r)*3.14;
	double aci_alan = (3.14*(r*r)*q)/360;
	
	System.out.println("Daireni çevresi: " + cevre);
	System.out.println("Daireni alanı: " + g_alan);
	System.out.println("Daire dilim alanı: " + aci_alan);
	
	
	}
}