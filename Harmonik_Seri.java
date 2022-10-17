import java.util.Scanner;

public class Harmonik_Seri{
	public static void main(String [] args){
		
	double result = 0.0;
	
	Scanner inp = new Scanner(System.in);
	
	System.out.print("Sayı giriniz: ");
	int no = inp.nextInt();
	
	for (int i = 1; i<=no; i++){
		
			result += (1.0/i);
			
	}
	
	System.out.println("Harmonik Toplam: " + result);
		
		
	}
}