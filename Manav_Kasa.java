import java.util.Scanner;

public class Manav_Kasa {
	public static void main(String [] args){
		
		double armut,elma,domates,muz,patlıcan;
		armut = 2.14;
		elma = 3.67;
		domates = 1.11;
		muz = 0.95;
		patlıcan = 5;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Armut kaç kilo: ");
		double a_kilo = input.nextDouble();
		
		
		System.out.print("Elma kaç kilo: ");
		double e_kilo = input.nextDouble();
		
		System.out.print("Domates kaç kilo: ");
		double d_kilo = input.nextDouble();
		
		System.out.print("Muz kaç kilo: ");
		double m_kilo = input.nextDouble();
		
		System.out.print("Patlıcan kaç kilo: ");
		double p_kilo = input.nextDouble();
		
		double t_tutar = (a_kilo*2.14)+(e_kilo*elma)+(d_kilo*1.11)+(m_kilo*0.95)+(p_kilo*5.00);
		System.out.println("Toplam Tutar: " + t_tutar);
	}
}