import java.util.Scanner;

public class Kucuk_To_Buyuk {
	public static void main(String [] args){
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("1.sayıyı giriniz: ");
		double n1 = inp.nextDouble();
		
		System.out.print("2.sayıyı giriniz: ");
		double n2 = inp.nextDouble();
		
		System.out.print("3.sayıyı giriniz: ");
		double n3 = inp.nextDouble();
		
		if (n1<n2 && n2<n3) {
			System.out.println(n1 + " < " + n2 + " < " + n3);
		}else if (n1<n3 && n3<n2){
			System.out.println(n1 + " < " + n3 + " < " + n2);
		}else if (n2<n1 && n1<n3) {
			System.out.println(n2 + " < " + n1 + " < " + n3);
		}else if (n2<n3 && n3<n1) {
			System.out.println(n2 + " < " + n3 + " < " + n1);
		}else if (n3<n1 && n1<n2) {
			System.out.println(n3 + " < " + n1 + " < " + n2);
		}else if (n3<n2 && n2<n1) {
			System.out.println(n3 + " < " + n2 + " < " + n1);
		}
	}
}